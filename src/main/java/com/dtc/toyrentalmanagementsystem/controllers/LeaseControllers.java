package com.dtc.toyrentalmanagementsystem.controllers;

import com.dtc.toyrentalmanagementsystem.dao.LeaseDao;
import com.dtc.toyrentalmanagementsystem.vo.JsonModel;
import com.dtc.toyrentalmanagementsystem.vo.LeaseVO;
import com.dtc.toyrentalmanagementsystem.vo.ReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: toyrentalmanagementsystem
 * @author: LQH
 * @create: 2021-06-07 18:43
 */
@RestController()
@RequestMapping("/lease")
public class LeaseControllers {
    @Autowired
    private LeaseDao leaseDao;

    @RequestMapping(value = "toylease", method = {RequestMethod.POST})
    public JsonModel lease(JsonModel jm, LeaseVO lease){
        //System.out.println(lease.toString());
        leaseDao.lease(lease);
        jm.setCode(1);
        jm.setMsg("出租成功");
        return jm;
    }

    @RequestMapping(value = "toyreturn", method = {RequestMethod.POST})
    public JsonModel returntoy(JsonModel jm, ReturnVO returnvo){
        leaseDao.returntoy(returnvo);
        jm.setCode(1);
        jm.setMsg("归还成功");
        return jm;
    }

}
