package com.csdn.course01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class LogController {

    private final static Logger logger  = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log")
    public String testLog() {
        logger.debug("=====测试日志debug级别打印====");
        logger.info("======测试日志info级别打印=====");
        logger.error("======测试日志error级别打印=====");
        logger.warn("======测试日志warn级别打印=====");

        // 使用占位符打印信息
        String str1 = "blog.csdn.com";
        String str2 = "blog/eson";
        logger.info("======个人博客:{}, 个人csdn:{}", str1, str2);

        return "success";
    }

}
