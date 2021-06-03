package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.Sales;
import com.dtc.toyrentalmanagementsystem.dao.SalesDao;
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
 * @create: 2021-06-03 09:39
 */
@Component
public class SalesDaoImpl implements SalesDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public List<Sales> login(Sales sales) {
        String sql="select * from sales where s_name='"+sales.getS_name()+"' and s_pwd=MD5('"+sales.getS_pwd()+"')";
        List<Sales> list=jdbcTemplate.query(sql, new RowMapper<Sales>() {
            @Override
            public Sales mapRow(ResultSet rs, int rowNum) throws SQLException {
                Sales sales=new Sales();
                sales.setS_id(rs.getInt("s_id"));
                sales.setS_name(rs.getString("s_name"));
                sales.setS_pwd(rs.getString("s_pwd"));
                return sales;
            }
        });
        return list;
    }
}
