package com.dtc.toyrentalmanagementsystem.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-28 10:55
 */
@Data
public class UL implements Serializable {
    private static final long serialVersionUID = 2796399999535422358L;
    private Integer m_id;
    private String m_name;
    private String m_address;
    private String m_tel;
    private String m_date;
    private Integer m_point;
    private Integer m_deposit;

    private Integer t_id;
    private String t_name;
    private String l_date;
    private Integer l_num;
}
