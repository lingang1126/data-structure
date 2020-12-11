package com.out.project;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseTestConfiguration.class})
@Rollback(value = false)
@SpringBootTest
@Slf4j
public class BaseTest extends AbstractJUnit4SpringContextTests {
    /**
     * 日志打印.
     *
     * @param start
     * @param end
     * @param data
     */
    protected void echo(String prefix, long start, long end, Object data) {
        log.info("{}, 耗时：{}ms, 返回结果: {}", prefix, (end - start), data == null ? "无" : JSON.toJSONString(data));
    }
}
