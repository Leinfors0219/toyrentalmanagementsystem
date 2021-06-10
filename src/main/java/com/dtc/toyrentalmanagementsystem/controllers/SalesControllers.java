package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.bean.Sales;
import com.dtc.toyrentalmanagementsystem.dao.SalesDao;
import com.dtc.toyrentalmanagementsystem.vo.JsonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "find")
    public List<Sales> findAll(){
        List list=salesDao.findAll();
        return list;
    }

    @RequestMapping(value = "reg",method = {RequestMethod.POST})
    public JsonModel addsale(JsonModel jm,Sales sales){
        salesDao.addsale(sales);
        jm.setCode(1);
        return jm;
    }

    @RequestMapping(value = "findsale")
    public Sales findsale(Sales sales){
        Sales sales1=salesDao.findone(sales.getS_name());
        return sales1;
    }

}
