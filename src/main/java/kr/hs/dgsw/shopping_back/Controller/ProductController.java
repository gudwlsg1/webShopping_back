package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/submenu/{id}")
    public List getFindBySubMenuId(@PathVariable Long id){
        return productService.findBySubId(id);
    }

    @GetMapping("/product/category/{id}")
    public List getFindByCategoryId(@PathVariable Long id){
        return productService.findByCategoryId(id);
    }
}
