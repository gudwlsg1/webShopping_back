package kr.hs.dgsw.shopping_back.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    int deleteById(@Param("id") Long id);
    Long add(User user);
    int modify(User user);
    User findById(@Param("id") Long id);
    User login(User user);
}
