package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.RowMapper.UserRowMapper;
import com.dtc.toyrentalmanagementsystem.bean.User;
import com.dtc.toyrentalmanagementsystem.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 22:00
 */
@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void useradd(User user) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql="insert into member (m_name,m_address,m_tel,m_date,m_point,m_deposit) values (?, ?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql,user.getM_name(),user.getM_address(),user.getM_tel(),df.format(new Date()),user.getM_point(),0);
    }

    @Override
    public User userlease(User user) {
        String sql="update member set m_point=m_point-? where m_name=?;";
        jdbcTemplate.update(sql,user.getM_point(),user.getM_name());
        return user;
    }

    @Override
    public User recharge(User user) {
        String sql="update member set m_point=m_point+? where m_id=?";
        jdbcTemplate.update(sql,user.getM_point(),user.getM_id());
        return user;
    }


    @Override
    public List<User> findusers() {
        String sql="select m_id,m_name,m_address,m_tel,m_date,m_point from member;";
        List<User> list=jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user=new User();
                user.setM_id(rs.getInt("m_id"));
                user.setM_name(rs.getString("m_name"));
                user.setM_address(rs.getString("m_address"));
                user.setM_tel(rs.getString("m_tel"));
                user.setM_date(rs.getString("m_date"));
                user.setM_point(rs.getInt("m_point"));
                return user;
            }
        });
        return list;
    }

    @Override
    public List<User> finduser(String m_tel) {
        String sql="select m_id,m_name,m_address,m_tel,m_date,m_point from member where m_tel="+m_tel+";";
        List<User> list=jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user=new User();
                user.setM_id(rs.getInt("m_id"));
                user.setM_name(rs.getString("m_name"));
                user.setM_address(rs.getString("m_address"));
                user.setM_tel(rs.getString("m_tel"));
                user.setM_date(rs.getString("m_date"));
                user.setM_point(rs.getInt("m_point"));
                return user;
            }
        });
        //System.out.println(list.toString());
        return list;
    }

    @Override
    public List<User> finduser1(String m_name) {
        String sql="select m_id,m_name,m_address,m_tel,m_date,m_point from member where m_name='"+m_name+"';";
        List<User> list=jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user=new User();
                user.setM_id(rs.getInt("m_id"));
                user.setM_name(rs.getString("m_name"));
                user.setM_address(rs.getString("m_address"));
                user.setM_tel(rs.getString("m_tel"));
                user.setM_date(rs.getString("m_date"));
                user.setM_point(rs.getInt("m_point"));
                return user;
            }
        });
        //System.out.println(list.toString());
        return list;
    }

    @Override
    public User findone(String m_name) {
        String sql="select m_id from member where m_name=?;";
        User user=jdbcTemplate.queryForObject(sql,new UserRowMapper(),m_name);
        //System.out.println(user.getM_id());
        return user;
    }
}
