package com.dtc.toyrentalmanagementsystem.dao;

import com.dtc.toyrentalmanagementsystem.bean.BadToys;
import com.dtc.toyrentalmanagementsystem.bean.Toys;

import java.util.List;

/**
 * @program: toyrentalmanagementsystem
 * @description:
 * @author: LQH
 * @create: 2021-05-06 12:26
 */
public interface ToysDao{

    public void addToys(Toys toy);

    public Toys updateToys(Toys toy);

    public void delete(int t_id);

    public List<Toys> findToy(int t_id);

    public List<Toys> findAll();

    public Toys toylease(Toys toys);

    public Toys toyreturn(Toys toys);

    public Toys badreturn(Toys toys);

    public List<BadToys> findAllbad();

}
