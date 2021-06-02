package com.dtc.toyrentalmanagementsystem.dao;

import com.dtc.toyrentalmanagementsystem.bean.Category;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 23:22
 */
public interface CategoryDao {
    public List<Category> findAll();
}
