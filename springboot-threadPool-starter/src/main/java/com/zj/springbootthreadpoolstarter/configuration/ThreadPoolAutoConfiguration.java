package com.zj.springbootthreadpoolstarter.configuration;

import com.zj.springbootthreadpoolstarter.SpringbootThreadPoolStarterApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.nio.ch.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhengjian
 * @date 2023-07-17 16:24
 */
@Configuration
public class ThreadPoolAutoConfiguration {

    @Bean
    @ConditionalOnClass(String.class) //String 一定存在，该bean一定会加入
//    @ConditionalOnBean(SpringbootThreadPoolStarterApplication.class) //不会存在该bean，则不会加载myThreadPool
    public ExecutorService myThreadPool(){
        return Executors.newFixedThreadPool(5);
    }
}
