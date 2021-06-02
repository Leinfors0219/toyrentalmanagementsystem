package com.dtc.toyrentalmanagementsystem.dao;

import com.dtc.toyrentalmanagementsystem.bean.User;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 21:56
 */
public interface UserDao {
    public void useradd(User user);

    public void userlease();

    public List<User> findusers();

    public List<User> finduser(String m_tel);

}
