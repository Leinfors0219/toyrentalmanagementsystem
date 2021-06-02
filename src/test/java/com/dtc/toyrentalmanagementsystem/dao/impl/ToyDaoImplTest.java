package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.Toys;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ToyDaoImplTest {
    Toys t=new Toys();
    @Autowired
    ToyDaoImpl toyDao;

    @Test
    public void addToys() {

        t.setT_price(100.00);
        t.setT_scrap("0");
        t.setT_name("象棋");
        t.setC_id("2");
        t.setT_introduce("好玩的棋类游戏");
        t.setT_num(200);
        toyDao.addToys(t);
    }

    @Test
    public void updateToys() {
        t.setT_num(20);
        t.setT_id(1);
        toyDao.updateToys(t);
    }

    @Test
    public void delete() {
    }

    @Test
    public void findToy() {
        List<Toys> list=toyDao.findToy(1);
        System.out.println(list.toString());
    }

    @Test
    public void findAll() {
        toyDao.findAll();
    }
}