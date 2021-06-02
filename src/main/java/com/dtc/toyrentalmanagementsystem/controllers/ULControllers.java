package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.bean.UL;
import com.dtc.toyrentalmanagementsystem.dao.ULDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-28 11:12
 */
@RestController
@RequestMapping("/ul")
public class ULControllers {
    @Autowired
    ULDao ulDao;

    @RequestMapping(value = "findall")
    public List<UL> findAll(){
        List<UL> list=ulDao.findAll();
        return list;
    }

}
