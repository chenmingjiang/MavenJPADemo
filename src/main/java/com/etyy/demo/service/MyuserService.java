package com.etyy.demo.service;

import com.etyy.demo.entity.Myuser;

/**
 * Created by chenmingjiang on 2017/1/2.
 */
public interface MyuserService {
    public Myuser findOne(int id);

    Myuser save(Myuser myuser);

    Myuser findByName(String chen);
}
