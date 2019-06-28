package kr.hs.dgsw.shopping_back.Service;

import kr.hs.dgsw.shopping_back.Domain.User;

public interface UserService {
    User login(User user);
    Long signup(User user);
}
