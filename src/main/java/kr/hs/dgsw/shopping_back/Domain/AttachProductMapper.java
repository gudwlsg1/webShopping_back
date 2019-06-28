package kr.hs.dgsw.shopping_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface AttachProductMapper {
    HashMap findById(Long id);
    Long add(AttachProduct attach);
    int modify(AttachProduct attach);
    int deleteById(Long id);
}
