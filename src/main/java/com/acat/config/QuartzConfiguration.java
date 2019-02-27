package com.acat.config;

import com.acat.job.WeatherDataSyncJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class QuartzConfiguration {

    //JobDeyail，定义一个特定的
    @Bean
    public JobDetail weatherDataSyncJobDetail(){
        return JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("WeatherDataSyncJob").storeDurably().build();
    }

    //Trigger触发
    @Bean
    public Trigger weatherDataSyncTrigger(){

        SimpleScheduleBuilder schedBuileder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();

        return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobDetail()).withIdentity("weatherDataSyncTrigger").withSchedule(schedBuileder).build();
    }
}
