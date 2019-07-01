package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Basket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BasketService {
    List<Basket> findAll();
    int deleteById(Long id);
    Long add(Basket basket);
    int modify(Basket basket);
    Basket findById(Long id);
    List findByUserId(Long userId);
}
