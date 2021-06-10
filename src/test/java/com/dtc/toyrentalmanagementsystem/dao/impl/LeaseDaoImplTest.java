package com.dtc.toyrentalmanagementsystem.dao.impl;

import com.dtc.toyrentalmanagementsystem.dao.LeaseDao;
import com.dtc.toyrentalmanagementsystem.vo.LeaseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LeaseDaoImplTest {
    @Autowired
    LeaseDao leaseDao;

    @Test
    public void lease() {
        LeaseVO lease=new LeaseVO();
        lease.setM_name("用户5");
        lease.setT_id(5);
        lease.setT_name("高达");
        lease.setL_num(100);
        leaseDao.lease(lease);
    }
}