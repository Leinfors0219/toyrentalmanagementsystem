package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.User;
import com.dtc.toyrentalmanagementsystem.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoImplTest {
    User user=new User();
    @Autowired
    UserDao userDao;

    @Test
    public void useradd() {
        user.setM_name("用户0");
        user.setM_address("湖南");
        user.setM_tel("12345678910");
        user.setM_point(5000);
        userDao.useradd(user);
    }

    @Test
    public void userlease() {
    }

    @Test
    public void findusers() {
    }

    @Test
    public void finduser(){
        userDao.finduser("12345678910");
    }
}