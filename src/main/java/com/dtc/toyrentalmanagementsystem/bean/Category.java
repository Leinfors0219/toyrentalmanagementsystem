package com.dtc.toyrentalmanagementsystem.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 23:20
 */
@Data
public class Category implements Serializable {
    private static final long serialVersionUID = 2430137165868625438L;
    private Integer c_id;
    private String c_name;
}
