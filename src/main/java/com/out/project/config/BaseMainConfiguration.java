package com.out.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * wechat 主要配置.
 *
 * @author zhoumeiqin
 * @date 2019/9/5 4:48 下午
 **/
@Configuration
@ComponentScan(value = {
        "com.out.project",
})
@Import({

})
public class BaseMainConfiguration {
//    @Bean
//    @ConfigurationProperties(prefix = "gugu.task.executor")
//    public ExecutorConfig executorConfig() {
//        return new ExecutorConfig();
//    }

//    /**
//     * 异步任务调用线程池配置.
//     *
//     * @param config
//     * @return
//     */
//    @Bean("taskExecutor")
//    public Executor taskExecutor(ExecutorConfig config) {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(config.getCorePoolSize());
//        executor.setMaxPoolSize(config.getMaxPoolSize());
//        executor.setQueueCapacity(config.getQueueCapacity());
//        executor.setKeepAliveSeconds(config.getKeepAliveSeconds());
//        executor.setThreadNamePrefix(config.getThreadNamePrefix());
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//        return executor;
//    }
//
//    @Bean
//    public TaskScheduler taskScheduler() {
//        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
//        taskScheduler.setThreadNamePrefix("gugu-task-scheduler");
//        taskScheduler.setPoolSize(Runtime.getRuntime().availableProcessors());
//        taskScheduler.initialize();
//        return taskScheduler;
//    }

}