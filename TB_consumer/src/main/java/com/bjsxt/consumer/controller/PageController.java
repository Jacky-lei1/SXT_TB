package com.bjsxt.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lvyelanshan
 * @create 2019-11-03 10:54
 */
@Controller
public class PageController {
    /**
     * 加载首页
     */
    @RequestMapping("/")
    public String showIndex(){
        return "main";
    }
    /**
     * 添加评论页面跳转
     */
    @RequestMapping("/addList")
    public String addList(){
        return "addList";
    }
}
