package kr.hs.dgsw.shopping_back.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface AttachUserMapper {
    HashMap findById(Long id);
    Long add(AttachUser attach);
    int modify(AttachUser attach);
    int deleteById(Long id);
}
