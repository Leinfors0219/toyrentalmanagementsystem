package com.dtc.toyrentalmanagementsystem.dao;

import com.dtc.toyrentalmanagementsystem.vo.LeaseVO;
import com.dtc.toyrentalmanagementsystem.vo.ReturnVO;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-05-28 10:45
 */
public interface LeaseDao {
    public LeaseVO lease(LeaseVO leaseVO);

    public ReturnVO returntoy(ReturnVO returnVO);
}
