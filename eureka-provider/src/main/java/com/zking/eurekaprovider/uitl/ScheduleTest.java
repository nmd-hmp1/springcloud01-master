package com.zking.eurekaprovider.uitl;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleTest.class);

    @Scheduled(cron = "0/5 * * * * ?")
    public void test() {
        System.out.println("55555555555554567");

        LOGGER.info(new DateTime().toString()+"123q");
    }
}