package com.dtc.toyrentalmanagementsystem.vo;

import lombok.Data;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-06 15:04
 */
@Data
public class LeaseVO {
    private Integer t_id;
    private String t_name;
    private String t_price;
    private int t_num;
    private int l_num;
    private String m_name;
}
