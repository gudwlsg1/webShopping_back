package kr.hs.dgsw.shopping_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Category category);
    int modify(Category category);
    Category findById(@Param("id") Long id);


}
