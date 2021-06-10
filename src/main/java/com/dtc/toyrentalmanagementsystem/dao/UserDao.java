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

    public User userlease(User user);

    public User recharge(User user);

    public List<User> findusers();

    public List<User> finduser(String m_tel);

    public List<User> finduser1(String m_name);

    public User findone(String m_name);

}
