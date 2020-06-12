package com.example.demo.Dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Author admin
 * @Date 2020/6/11
 */
@Mapper
public interface HelloDao {
    String getSomeThing(String id);
}
