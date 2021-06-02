package com.dtc.toyrentalmanagementsystem.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-28 10:43
 */
@Data
public class Lease implements Serializable {
    private static final long serialVersionUID = 1886177357590410292L;
    private Integer m_id;
    private Integer t_id;
    private String t_name;
    private String l_date;
    private Integer l_num;
}
