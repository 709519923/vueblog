package com.markerhub.controller;


import com.markerhub.common.lang.Result;
import com.markerhub.entity.User;
import com.markerhub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2023-10-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        User user = userService.getById(1L);
        return Result.succ(200, "success", user); // user就是data
    }
    @PostMapping("/save")
    public Object save(@Validated @RequestBody User user) {
        return Result.succ(user); // user就是data
    }

}

