package com.example.demo.Service.impl;

import com.example.demo.Dao.HelloDao;
import com.example.demo.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author admin
 * @Date 2020/6/11
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloDao helloDao;
    @Cacheable(value="common",key = "#id") //加入缓存
    @Override
    public String getValue(String id) {
        String value=helloDao.getSomeThing(id);
        return value;
    }
}
