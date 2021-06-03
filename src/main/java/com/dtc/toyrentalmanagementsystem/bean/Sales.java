package com.dtc.toyrentalmanagementsystem.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-28 10:47
 */
@Data
public class Sales implements Serializable {
    private static final long serialVersionUID = -3589944733118102660L;
    private Integer s_id;
    private String s_name;
    private String s_pwd;
}
