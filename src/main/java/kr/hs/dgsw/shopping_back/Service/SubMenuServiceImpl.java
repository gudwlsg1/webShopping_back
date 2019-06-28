package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubMenuServiceImpl implements SubMenuService{

    @Autowired
    private SubMenuMapper subMenuMapper;


    @Override
    public List<SubMenu> findAll() {
        return subMenuMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return subMenuMapper.deleteById(id);
    }

    @Override
    public Long add(SubMenu subMenu) {
        return subMenuMapper.add(subMenu);
    }

    @Override
    public int modify(SubMenu subMenu) {
        return subMenuMapper.modify(subMenu);
    }

    @Override
    public SubMenu findById(Long id) {
        return subMenuMapper.findById(id);
    }

    @Override
    public List findByCategoryId(Long categoryId) {
        return subMenuMapper.findByCategoryId(categoryId);
    }
}
