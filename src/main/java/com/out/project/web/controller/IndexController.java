package com.out.project.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: IndexController
 * Description:
 *
 * @author 林刚
 * date: 2020/11/2
 */
@Slf4j
@RestController
@RequestMapping("/api/poker")
public class IndexController {

    /**
     * index mapping.
     *
     * @return
     */
    @GetMapping({"/index/", "/index"})
    // @ResponseJson
    public String index() {
        // TODO: 2020/11/2 自己之后要定义responseJson
        //  构建一套自己的util 工具类
        //  构建一套自己的core 基础类
        return "欢迎访问服务";
    }
}
