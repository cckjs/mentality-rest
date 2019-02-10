package com.shazam.framework.api;

import com.shazam.framework.entity.common.RestResult;
import com.shazam.framework.entity.user.User;
import com.shazam.framework.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
@RestController
public class UserApi {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public RestResult<User> getUser(
        @RequestParam(value = "username", defaultValue = "input username") String username,
        @RequestParam(value = "password", defaultValue = "input password")
            String password) {
          User user = userService.getUser(username,password);
          RestResult<User> result = new RestResult<>();
          RestResult.success(user,result);
          return result;
    }
}
