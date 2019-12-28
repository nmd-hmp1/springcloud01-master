package com.zking.eurekaprovider.uitl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Jobs {  
    public final static long ONE_Minute =  60 * 1000;

    @Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
//        System.out.println(" >>fixedDelay执行....");
    }

    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
//        System.out.println(" >>fixedRate执行....");
    }

//    @Scheduled(cron="0 15 3 * * ?")
//    public void cronJob(){
//
//        System.out.println(Dates.format_yyyyMMddHHmmss(new Date())+" >>cron执行....");
//    }
}