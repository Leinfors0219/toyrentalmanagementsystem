package com.dtc.toyrentalmanagementsystem.dao;

import com.dtc.toyrentalmanagementsystem.bean.Sales;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-03 09:37
 */
public interface SalesDao {
    public List<Sales> login(Sales sales);
}
