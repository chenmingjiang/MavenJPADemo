package com.etyy.demo.service;

import com.etyy.demo.entity.Myuser;
import com.etyy.demo.repository.MyuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenmingjiang on 2017/1/2.
 */
@Service("myuserService")
public class MyuserServiceImpl implements MyuserService {
    @Resource
    private MyuserRepository repository;

    public Myuser findOne(int id) {
        return repository.findOne(id);
    }

    @Override
    public Myuser save(Myuser myuser) {
        return repository.save(myuser);
    }

    @Override
    public Myuser findByName(String chen) {
        return repository.findByName(chen);
    }
}
