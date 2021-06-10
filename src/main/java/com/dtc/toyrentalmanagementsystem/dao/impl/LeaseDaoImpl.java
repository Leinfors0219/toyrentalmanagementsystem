package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.dao.LeaseDao;
import com.dtc.toyrentalmanagementsystem.dao.UserDao;
import com.dtc.toyrentalmanagementsystem.vo.LeaseVO;
import com.dtc.toyrentalmanagementsystem.vo.ReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-06 15:09
 */
@Component
public class LeaseDaoImpl implements LeaseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    UserDao user;
    @Override
    public LeaseVO lease(LeaseVO leaseVO) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //System.out.println(user.findone(leaseVO.getM_name()).getM_id());
        String sql="insert into lease(m_id,t_id,t_name,l_date,l_num) values(?,?,?,?,?);";
        jdbcTemplate.update(sql,user.findone(leaseVO.getM_name()).getM_id(),leaseVO.getT_id(),leaseVO.getT_name(),df.format(new Date()),leaseVO.getL_num());
        return null;
    }

    @Override
    public ReturnVO returntoy(ReturnVO returnVO) {
        String sql="update lease set l_num=l_num-? where m_id=?";
        jdbcTemplate.update(sql,returnVO.getL_num(),user.findone(returnVO.getM_name()).getM_id());
        return null;
    }
}
