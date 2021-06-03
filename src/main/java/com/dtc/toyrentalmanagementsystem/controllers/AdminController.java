package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.bean.Admin;
import com.dtc.toyrentalmanagementsystem.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-03 18:30
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminDao adminDao;

    @RequestMapping(value = "login")
    public List<Admin> login(Admin admin){
        //System.out.println(sales.toString());
        List<Admin> list=adminDao.login(admin);
        return list;
    }
}
