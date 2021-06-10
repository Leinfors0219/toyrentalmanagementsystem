package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.Sales;
import com.dtc.toyrentalmanagementsystem.dao.SalesDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SalesDaoImplTest {
    @Autowired
    private SalesDao salesDao;

    @Test
    public void login() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findone() {
        Sales sales=new Sales();
        sales.setS_name("营业员1");
        salesDao.findone(sales.getS_name());
    }

    @Test
    public void addsale() {
    }
}