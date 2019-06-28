package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Service.CategoryService;
import kr.hs.dgsw.shopping_back.Service.SubMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubMenuController {

    @Autowired
    private SubMenuService subMenuService;

    @GetMapping("/submenu/{id}")
    public List<Category> getFindbyCategoryId(@PathVariable Long id){
        return subMenuService.findByCategoryId(id);
    }
}
