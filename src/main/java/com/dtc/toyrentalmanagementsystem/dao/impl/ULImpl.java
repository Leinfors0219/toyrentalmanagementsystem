package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.UL;
import com.dtc.toyrentalmanagementsystem.dao.ULDao;
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
 * @create: 2021-05-28 10:56
 */
@Component
public class ULImpl implements ULDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UL> findAll() {
        String sql="select m.m_id,m_name,m_address,m_tel,l_date,t_name,l_num from member m,lease l where l.m_id=m.m_id";
        List<UL>list=jdbcTemplate.query(sql, new RowMapper<UL>() {
            @Override
            public UL mapRow(ResultSet rs, int rowNum) throws SQLException {
                UL ul=new UL();
                ul.setM_id(rs.getInt("m_id"));
                ul.setM_name(rs.getString("m_name"));
                ul.setM_address(rs.getString("m_address"));
                ul.setM_tel(rs.getString("m_tel"));
                ul.setL_date(rs.getString("l_date"));
                ul.setT_name(rs.getString("t_name"));
                ul.setL_num(rs.getInt("l_num"));
                return ul;
            }
        });
        //System.out.println(list.toString());
        return list;
    }
}
