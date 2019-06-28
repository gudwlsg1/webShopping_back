package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    int deleteById(Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(Long id);
    List findByCategoryId(Long categoryId);
    List findBySubId(Long subId);
}
