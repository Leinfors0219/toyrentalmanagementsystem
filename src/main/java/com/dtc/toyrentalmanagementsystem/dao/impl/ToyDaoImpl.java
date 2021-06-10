package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.bean.BadToys;
import com.dtc.toyrentalmanagementsystem.bean.Toys;
import com.dtc.toyrentalmanagementsystem.dao.ToysDao;
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
 * @description:
 * @author: LQH
 * @create: 2021-05-06 12:42
 */
@Component
public class ToyDaoImpl implements ToysDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addToys(Toys toy) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql="insert into toys(date, t_price, t_scrap, t_name, c_id, t_introduce,t_num,t_sc) value (?,?,?,?,?,?,?,?);";
        jdbcTemplate.update(sql,df.format(new Date()),toy.getT_price(),0,toy.getT_name(),toy.getC_id(),toy.getT_introduce(),toy.getT_num(),0);
    }

    @Override
    public Toys updateToys(Toys toy) {
        String sql="update toys set t_num=? where t_id=?;";
        jdbcTemplate.update(sql,toy.getT_num(),toy.getT_id());
        return null;
    }

    @Override
    public void delete(int t_id) {

    }

    @Override
    public List<Toys> findToy(int t_id) {
        String sql="select t_id,t_name,date,t_price,t_scrap,c_id,t_num,t_introduce,t_sc from toys where t_id="+t_id+";";
        List<Toys> list= jdbcTemplate.query(sql, new RowMapper<Toys>() {
            @Override
            public Toys mapRow(ResultSet rs, int rowNum) throws SQLException {
                Toys toy=new Toys();
                toy.setT_id(rs.getInt("t_id"));
                toy.setT_name(rs.getString("t_name"));
                toy.setDate(rs.getString("date"));
                toy.setT_price(rs.getInt("t_price"));
                toy.setT_scrap(rs.getString ("t_scrap"));
                toy.setC_id(rs.getString("c_id"));
                toy.setT_num(rs.getInt("t_num"));
                toy.setT_introduce(rs.getString("t_introduce"));
                toy.setT_sc(rs.getString("t_sc"));
                return toy;
            }
        });
        return list;
    }

    @Override
    public List<Toys> findAll() {
        String sql="select t_id,t_name,date,t_price,t_scrap,c_name,t_num,t_introduce from toys,category where toys.c_id=category.c_id";
        List<Toys> list= jdbcTemplate.query(sql, new RowMapper<Toys>() {
            @Override
            public Toys mapRow(ResultSet rs, int rowNum) throws SQLException {
                Toys toy=new Toys();
                toy.setT_id(rs.getInt("t_id"));
                toy.setT_name(rs.getString("t_name"));
                toy.setDate(rs.getString("date"));
                toy.setT_price(rs.getInt("t_price"));
                toy.setT_scrap(rs.getString ("t_scrap"));
                toy.setC_id(rs.getString("c_name"));
                toy.setT_num(rs.getInt("t_num"));
                toy.setT_introduce(rs.getString("t_introduce"));
                //System.out.println(toy.toString());
                if(toy.getT_scrap().equals("0")){
                    toy.setT_scrap("否");
                }else{
                    toy.setT_scrap("是");
                }
                return toy;
            }
        });
        //System.out.println(list);
        return list;
    }

    @Override
    public Toys toylease(Toys toy) {
        String sql="update toys set t_num=t_num-? where t_id=?;";
        jdbcTemplate.update(sql,toy.getT_num(),toy.getT_id());
        return toy;
    }

    @Override
    public Toys toyreturn(Toys toys) {
        if(toys.getT_scrap().equals("0")){
            String sql="update toys set t_num=t_num+? where t_id=? and t_scrap=0;";
            jdbcTemplate.update(sql,toys.getT_num(),toys.getT_id());
        }else if(toys.getT_scrap().equals("1")){
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String sql="insert into badtoys(b_id,date,b_name,c_id,b_num) value (?,?,?,?,?);";
            jdbcTemplate.update(sql, toys.getT_id(),df.format(new Date()),toys.getT_name(),toys.getC_id(),toys.getT_num());
            String sql1="update toys set t_sc=1 where t_id=?";
            jdbcTemplate.update(sql1,toys.getT_id());
        }
        return null;
    }

    @Override
    public Toys badreturn(Toys toys) {
        String sql="update badtoys set b_num=b_num+? where b_id=?;";
        jdbcTemplate.update(sql,toys.getT_num(),toys.getT_id());
        return null;
    }

    @Override
    public List<BadToys> findAllbad() {
        String sql="select b_id,date,b_name,badtoys.c_id,b_num,c_name from badtoys,category where badtoys.c_id=category.c_id";
        List<BadToys> list=jdbcTemplate.query(sql, new RowMapper<BadToys>() {
            @Override
            public BadToys mapRow(ResultSet rs, int rowNum) throws SQLException {
                BadToys badToys=new BadToys();
                badToys.setB_id(rs.getInt("b_id"));
                badToys.setB_name(rs.getString("b_name"));
                badToys.setB_num(rs.getInt("b_num"));
                badToys.setC_id(rs.getString("c_name"));
                badToys.setDate(rs.getString("date"));
                return badToys;
            }
        });
        System.out.println(list.toString());
        return list;
    }

}
