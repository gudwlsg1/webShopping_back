package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Service.AttachProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.HashMap;

@RestController
public class AttachmentProductController {
    @Autowired
    private AttachProductService attachProductService;

    @GetMapping("/product/image/{id}")
    public void image(@PathVariable Long id, HttpServletResponse response) {
        try {
            HashMap map = this.attachProductService.findById(id);
            String filename = (String)map.get("filename");
            String filepath = (String)map.get("filepath");

            File file = new File(filepath);
            if(! file.exists()) return;

            String mimeType = URLConnection.guessContentTypeFromName(filepath);
            if(mimeType == null) mimeType = "application/octet-stream";

            response.setContentType(mimeType);
            response.setHeader("Content-Disposition", "inline; filename='" + filename + "'");
            response.setContentLength((int)file.length());
            System.out.println(response.toString());
            InputStream is = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(is, response.getOutputStream());
        } catch(Exception ex) {
            final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());
            logger.warn(ex.getLocalizedMessage());
        }

    }
}
