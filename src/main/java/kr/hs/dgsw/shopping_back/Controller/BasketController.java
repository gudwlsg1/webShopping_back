package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.Basket;
import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Service.BasketService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {
    @Autowired
    private BasketService basketService;

    @GetMapping("/basket/user/{userId}")
    public List getByUserId(@PathVariable Long userId){
        return basketService.findByUserId(userId);
    }

    @PutMapping("/basket")
    public int modifyBasket(@RequestBody Basket basket){
        return basketService.modify(basket);
    }

    @PostMapping("/basket")
    public Long addBasket(@RequestBody Basket basket){
        return basketService.add(basket);
    }

    @DeleteMapping("/basket/{basketId}")
    public int deleteBasket(@PathVariable Long basketId){
        return basketService.deleteById(basketId);
    }
}
