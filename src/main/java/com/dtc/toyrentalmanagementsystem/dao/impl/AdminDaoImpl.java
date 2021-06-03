package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.Admin;
import com.dtc.toyrentalmanagementsystem.dao.AdminDao;
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
 * @create: 2021-06-03 18:26
 */
@Component
public class AdminDaoImpl implements AdminDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public List<Admin> login(Admin admin) {
        String sql="select * from administrators where a_name='"+admin.getA_name()+"' and a_pwd=MD5('"+admin.getA_pwd()+"')";
        List<Admin> list=jdbcTemplate.query(sql, new RowMapper<Admin>() {
            @Override
            public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
                Admin admin=new Admin();
                admin.setA_id(rs.getInt("a_id"));
                admin.setA_name(rs.getString("a_name"));
                admin.setA_pwd(rs.getString("a_pwd"));
                return admin;
            }
        });
        return list;
    }
}
