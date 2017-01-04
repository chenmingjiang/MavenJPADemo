package com.etyy.demo.controller;

import com.etyy.demo.entity.Myuser;
import com.etyy.demo.service.MyuserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by chenmingjiang on 2017/1/2.
 */
@Controller
public class MyuserController {

    @Resource
    private MyuserServiceImpl myuserService;

    @RequestMapping(value = "/findOne", method = RequestMethod.POST)
    public String findOne() {
//        myuserService.findOne(10);
        Myuser myuser = myuserService.findByName("chen");
        System.out.println(myuser.getDept());
//        Myuser myuser = new Myuser();
//        myuser.setName("chen");
//        myuser.setDept("xinxi");
//        Myuser myuser1 = myuserService.save(myuser);
        return null;
    }
}
