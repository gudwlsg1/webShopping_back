package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.Category;
import kr.hs.dgsw.shopping_back.Domain.Product;
import kr.hs.dgsw.shopping_back.Domain.SubMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubMenuService {
    List<SubMenu> findAll();
    int deleteById(Long id);
    Long add(SubMenu subMenu);
    int modify(SubMenu subMenu);
    SubMenu findById(Long id);
    List findByCategoryId(Long categoryId);
}
