package com.shop.controller;

import com.shop.entity.User;
import com.shop.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-10-24 15:07:41
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param tel 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{tel}")
    public User selectOne(@PathVariable("tel") String tel) {
        return this.userService.queryByTel(tel);
    }
    /**
     * 注册
     * */
    @PostMapping("saveUser")
    public boolean saveUser(User u) {
        List<User> users = userService.getAllUser();

        for (User use: users) {
            if((u.getTel()).equalsIgnoreCase(use.getTel())) {
                System.out.println("失败");
                return false;
            }
        }
        this.userService.insert(u);
        return true;
    }

    /**
     *登录
     * */
    @PostMapping("login")
    public User login(User u){
        List<User> users = userService.getAllUser();
        for (User user : users) {
            if((u.getTel()).equalsIgnoreCase(user.getTel())&&(u.getPass().equalsIgnoreCase(user.getPass()))){
                return this.userService.queryByTel(u.getTel());
            }
        }
        return null;
    }

    /**
     * 修改用户
     * */
    @PostMapping("Update")
    public User update(User u){


        return this.userService.update(u);
    }
    @GetMapping("getAll")
    public List<User> getAll(){

        return userService.getAllUser();
    }
}