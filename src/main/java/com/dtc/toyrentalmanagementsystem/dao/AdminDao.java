package com.dtc.toyrentalmanagementsystem.dao;

import com.dtc.toyrentalmanagementsystem.bean.Admin;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-03 18:26
 */
public interface AdminDao {
    public List<Admin> login(Admin admin);
}
