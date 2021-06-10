package com.dtc.toyrentalmanagementsystem.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: toyrentalmanagementsystem
 * @description:
 * @author: LQH
 * @create: 2021-05-06 12:17
 */
@Data
public class Toys implements Serializable {
    private static final long serialVersionUID = 4134517087210603450L;
    private Integer t_id;//玩具编号
    private String t_name;//玩具名称
    private String date;//日期
    private double t_price;//价格
    private String t_scrap;//是否报废，1位为是，2为否
    private String c_id;//类型id
    private String t_introduce;//玩具介绍
    private int t_num;//库存
    private String t_sc;//是否损坏
}
