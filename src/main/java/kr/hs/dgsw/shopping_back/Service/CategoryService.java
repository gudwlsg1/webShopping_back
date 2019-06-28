package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    int deleteById(Long id);
    Long add(Category category);
    int modify(Category category);
    Category findById(Long id);
}
