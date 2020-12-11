package com.out.project;

import com.out.project.config.BaseMainConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
// @PropertySource({"classpath:application.yml"})
@Import({BaseMainConfiguration.class})
// @EnableScheduling
public class BaseTestConfiguration {

}
