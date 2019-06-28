package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Domain.CategoryMapper;
import kr.hs.dgsw.shopping_back.Domain.User;
import kr.hs.dgsw.shopping_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return categoryMapper.deleteById(id);
    }

    @Override
    public Long add(Category category) {
        return categoryMapper.add(category);
    }

    @Override
    public int modify(Category category) {
        return categoryMapper.modify(category);
    }

    @Override
    public Category findById(Long id) {
        return categoryMapper.findById(id);
    }
}
