package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Basket;
import kr.hs.dgsw.shopping_back.Domain.BasketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketMapper basketMapper;

    @Override
    public List<Basket> findAll() {
        return basketMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return basketMapper.deleteById(id);
    }

    @Override
    public Long add(Basket basket) {
        return basketMapper.add(basket);
    }

    @Override
    public int modify(Basket basket) {
        return basketMapper.modify(basket);
    }

    @Override
    public Basket findById(Long id) {
        return basketMapper.findById(id);
    }

    @Override
    public List findByUserId(Long userId) {
        return basketMapper.findByUserId(userId);
    }
}
