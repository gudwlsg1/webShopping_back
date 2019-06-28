package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Product;
import kr.hs.dgsw.shopping_back.Domain.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }

    @Override
    public Long add(Product product) {
        return productMapper.add(product);
    }

    @Override
    public int modify(Product product) {
        return productMapper.modify(product);
    }

    @Override
    public Product findById(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List findByCategoryId(Long categoryId) {
        return productMapper.findByCategoryId(categoryId);
    }

    @Override
    public List findBySubId(Long subId) {
        return productMapper.findBySubId(subId);
    }
}
