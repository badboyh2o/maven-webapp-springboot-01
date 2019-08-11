package maven.webapp.badboyh2o.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import maven.webapp.badboyh2o.domain.User;
import maven.webapp.badboyh2o.service.impl.UserService;

/**
 * 用户控制器
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    
    /**
     *  用户登录
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json" )
    public User login(@RequestBody User model, HttpServletRequest request) {
        User user = userService.findUserByName(model.getUsername());
        return user;
    }
    
    
}