package com.out.project;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * FileName: BaseApplication
 * Description: 
 *
 * @author 林刚
 * date: 2020/11/23
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {})
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
        log.info("***************** 启动完成 *****************");
    }
}

