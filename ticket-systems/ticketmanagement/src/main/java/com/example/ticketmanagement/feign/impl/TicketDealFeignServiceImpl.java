package com.example.ticketmanagement.feign.impl;

import com.example.ticketdb.bean.User;
import com.example.ticketmanagement.feign.TicketDealFeignService;
import org.springframework.stereotype.Service;

/**
 * 。
 *
 * @author 卢宏政
 */
@Service
public class TicketDealFeignServiceImpl implements TicketDealFeignService {
    /**
     * 。
     *
     * @param loginName
     * @return
     */
    @Override
    public User getUserByLoginName(String loginName) {
        return null;
    }
}
