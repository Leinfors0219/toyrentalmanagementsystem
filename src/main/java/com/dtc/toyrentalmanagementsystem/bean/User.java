package com.dtc.toyrentalmanagementsystem.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-27 21:53
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 4550084980988083201L;
    private Integer m_id;
    private String m_name;
    private String m_address;
    private String m_tel;
    private String m_date;
    private Integer m_point;
    private Integer m_deposit;
}
