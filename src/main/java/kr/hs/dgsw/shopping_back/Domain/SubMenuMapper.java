package kr.hs.dgsw.shopping_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SubMenuMapper {
    List<SubMenu> findAll();
    int deleteById(@Param("id") Long id);
    Long add(SubMenu subMenu);
    int modify(SubMenu subMenu);
    SubMenu findById(@Param("id") Long id);
    List findByCategoryId(@Param("categoryId") Long categoryId);
}
