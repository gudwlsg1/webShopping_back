package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Product product);
    int modify(Product product);
    Product findById(@Param("id") Long id);
    List findByCategoryId(@Param("categoryId") Long categoryId);
    List findBySubId(@Param("subId") Long subId);
}
