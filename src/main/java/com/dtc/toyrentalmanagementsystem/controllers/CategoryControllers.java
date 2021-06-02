package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.bean.Category;
import com.dtc.toyrentalmanagementsystem.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 23:29
 */
@RestController
@RequestMapping("/category")
public class CategoryControllers {
    @Autowired
    CategoryDao categoryDao;

    @RequestMapping(value = "findall")
    public List<Category> findAll(){
        List<Category> list=categoryDao.findAll();
        return list;
    }
}
