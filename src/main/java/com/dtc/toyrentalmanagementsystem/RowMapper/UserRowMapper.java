package com.dtc.toyrentalmanagementsystem.RowMapper;

import com.dtc.toyrentalmanagementsystem.bean.User;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-09 20:59
 */
public class UserRowMapper implements RowMapper<User>{
     @Override
     public User mapRow(ResultSet resultSet, int i) throws SQLException {
        //获取结果集中的数据
        Integer m_id = resultSet.getInt("m_id");
        //把数据封装成User对象
        User user = new User();
        user.setM_id(m_id);
        return user;
     }
}
