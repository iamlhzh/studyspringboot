package com.example.ticketdeal.mapper;

import com.example.ticketdb.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserByLoginName(String loginName);
}
