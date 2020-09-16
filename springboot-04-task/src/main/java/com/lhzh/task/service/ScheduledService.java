package com.lhzh.task.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

//    @Scheduled(cron = "0 * * * * MON-SAT")
//    @Scheduled(cron = "0,1,2,3,4,5,6,7,8 * * * * MON-SAT")
//    @Scheduled(cron = "0-50 * * * * MON-SAT")
    @Scheduled(cron = "0/4 * * * * MON-SAT")
    public void hello(){
        System.out.println("Hello!!!");
    }
}
