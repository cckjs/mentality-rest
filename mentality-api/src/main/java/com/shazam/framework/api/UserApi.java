package com.shazam.framework.api;

import com.shazam.framework.entity.common.RestResult;
import com.shazam.framework.entity.user.User;
import com.shazam.framework.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shazam
 * @DATE 2019/1/5
 */
@RestController(value = "/example")
public class UserApi {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{username}",method = RequestMethod.GET)
    public RestResult<User> getUser(
        @PathVariable(value = "username") String username) {
          User user = userService.getUser(username);
          return RestResult.success(user);
    }
    @RequestMapping(value = "/user",method = {RequestMethod.GET,RequestMethod.POST})
    @GetMapping
    public RestResult<Boolean> addUser(User user){
        if(user!=null){
            userService.addUser(user);
            return RestResult.success(true);
        }else{
            RestResult<Boolean> result = new RestResult<>(false);
            result.setStatus(404);
            result.setMessage("添加的用户不能为空");
            return result;
        }
    }
}
