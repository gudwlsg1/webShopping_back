package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User login(User user);
    Long signup(User user);
    User findById(@Param("id") Long id);
}
