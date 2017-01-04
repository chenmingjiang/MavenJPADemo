package com.etyy.demo.repository;

import com.etyy.demo.entity.Myuser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenmingjiang on 2017/1/2.
 */
public interface MyuserRepository extends JpaRepository<Myuser, Integer> {
    Myuser findByName(String name);
}
