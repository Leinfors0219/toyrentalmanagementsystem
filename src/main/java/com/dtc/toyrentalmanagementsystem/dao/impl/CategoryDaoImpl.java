package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.Category;
import com.dtc.toyrentalmanagementsystem.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 23:22
 */
@Component
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> findAll() {
        String sql="select * from category";
        List<Category>list=jdbcTemplate.query(sql, new RowMapper<Category>() {
            @Override
            public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
                Category category=new Category();
                category.setC_id(rs.getInt("c_id"));
                category.setC_name(rs.getString("c_name"));
                return category;
            }
        });
        //System.out.println(list.toString());
        return list;
    }
}
