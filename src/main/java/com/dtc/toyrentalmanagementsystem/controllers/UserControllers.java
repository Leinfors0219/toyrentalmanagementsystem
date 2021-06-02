package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.bean.User;
import com.dtc.toyrentalmanagementsystem.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 22:15
 */
@RestController()
@RequestMapping("/user")
public class UserControllers {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "findusers")
    public List<User> findusers(){
        List<User> list=userDao.findusers();
        return list;
    }

    @RequestMapping(value = "finduser")
    public List<User> finduser(User u){
        List<User> list=userDao.finduser(u.getM_tel());
        //System.out.println(list.toString());
        return list;
    }

    @RequestMapping(value = "useradd")
    public User useradd(User user){
        userDao.useradd(user);
        return user;
    }
}
