package kr.hs.dgsw.shopping_back.Controller;

import kr.hs.dgsw.shopping_back.Domain.User;
import kr.hs.dgsw.shopping_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/signup")
    public Long addUser(@RequestBody User user){
        return this.userService.signup(user);
    }

    @PostMapping(value= "/user/login")
    public User login(@RequestBody User user){
        return this.userService.login(user);
    }
}
