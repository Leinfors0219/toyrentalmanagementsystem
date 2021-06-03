package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.bean.Sales;
import com.dtc.toyrentalmanagementsystem.dao.SalesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-03 09:47
 */
@RestController
@RequestMapping("/sale")
public class SalesControllers {
    @Autowired
    public SalesDao salesDao;

    @RequestMapping(value = "login")
    public List<Sales> login(Sales sales){
        //System.out.println(sales.toString());
        List<Sales> list=salesDao.login(sales);
        return list;
    }
}
