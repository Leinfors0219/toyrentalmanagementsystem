package com.dtc.toyrentalmanagementsystem.RowMapper;

import com.dtc.toyrentalmanagementsystem.bean.Sales;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-09 20:59
 */
public class SaleRowMapper implements RowMapper<Sales>{
     @Override
     public Sales mapRow(ResultSet resultSet, int i) throws SQLException {
        //获取结果集中的数据
        Integer s_id = resultSet.getInt("s_id");
        //把数据封装成User对象
        Sales sales=new Sales();
        sales.setS_id(s_id);
        return sales;
     }
}
