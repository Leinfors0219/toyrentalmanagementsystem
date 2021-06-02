package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.bean.Toys;
import com.dtc.toyrentalmanagementsystem.dao.impl.ToyDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-17 20:47
 */
@RestController()
@RequestMapping("/toy")
public class ToysControllers {
    @Autowired
    private ToyDaoImpl toyDao;


    @RequestMapping(value = "toysadd")
    public Toys toysadd(Toys toys){
        //System.out.println(toys.toString());
        toyDao.addToys(toys);
        return toys;
    }

    @RequestMapping(value = "findtoys")
    public List<Toys> findtoys(){
        List<Toys> list=toyDao.findAll();
        return list;
    }

    @RequestMapping(value = "findtoy")
    public List<Toys> findtoy(Toys toys){
        List<Toys> list=toyDao.findToy(toys.getT_id());
        return list;
    }

    @RequestMapping(value = "toyslease")
    public Toys toyslease(Toys toys){
        toyDao.toylease(toys);
        return toys;
    }
}
