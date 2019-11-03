package com.bjsxt.consumer.controller;

import com.bjsxt.consumer.service.ManagerTopicService;
import com.bjsxt.tb.pojo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-03 11:04
 */
@Controller
public class TopicController {

    @Autowired
    private ManagerTopicService managerTopicService;

    /**
     * 查询所有帖子
     * @param req
     * @return
     */

    @RequestMapping(value = "/findAll",
            produces = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
    public String showAllTopics(HttpServletRequest req){
        List<Topic> topList = managerTopicService.findAllTopics();
        System.out.println(topList);
        req.setAttribute("topList",topList);
        return "topList";
    }

    /**
     * 根据id查询帖子
     */
    @RequestMapping(value = "/findById",
            produces = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
    public String showDetails(HttpServletRequest req){
        //获得请求数据
        int id = Integer.parseInt(req.getParameter("topic_id"));
        System.out.println("根据id查询帖子的id："+id);
        int clickNum = Integer.parseInt(req.getParameter("click_amount"));
        managerTopicService.update(++clickNum,id);

        //调用业务层查询所有信息
        Topic topic = managerTopicService.showDetails(id);
        req.setAttribute("topic",topic);
        req.setAttribute("topic_id", id);

        return "details";
    }

    /**
     * 添加帖子
     */
    @RequestMapping(value = "/addTopic",
            produces = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
    public String addTopic(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        //获取请求数据
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String author = req.getParameter("author");

        Date sdate = new Date();

        Topic topic = new Topic(title,content,author,sdate);

        //调用业务层添加帖子
        int i = managerTopicService.addTopic(topic);
        if (i>0){
            resp.sendRedirect("/findAll");
        }else{
            req.setAttribute("error", "添加失败");
        }
        return "addList";
    }

   /* *//**
     * 更新帖子点击数
     * @param req
     *//*

    public synchronized void update(HttpServletRequest req){
        //获取请求信息
        int clickNum =  (int) req.getAttribute("clickNum");
        System.out.println("update中的点击数："+clickNum);
        int topic_id = (int) req.getAttribute("topic_id");
        managerTopicService.update(clickNum, topic_id);
    }*/


}
