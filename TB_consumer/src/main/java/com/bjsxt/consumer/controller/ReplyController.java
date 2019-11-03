package com.bjsxt.consumer.controller;

import com.bjsxt.consumer.service.ManagerReplyService;
import com.bjsxt.consumer.service.ManagerTopicService;
import com.bjsxt.tb.pojo.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author lvyelanshan
 * @create 2019-11-03 11:41
 */
@Controller
public class ReplyController {

    @Autowired
    private ManagerReplyService managerReplyService;

    @Autowired
    private ManagerTopicService managerTopicService;

    @RequestMapping(value = "/addReply",
            produces = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8")
    public void addReply(HttpServletRequest req, HttpServletResponse rep){

        //获取请求数据
        String name = req.getParameter("name");
        String message = req.getParameter("message");
        int topic_id = Integer.parseInt(req.getParameter("topic_id"));
        int clickNum = Integer.parseInt(req.getParameter("click_amount"));
        int i = managerTopicService.update(++clickNum, topic_id);
        System.out.println("是否有执行="+i);

        Reply reply = new Reply(topic_id,name,message,new Date());

        int n = managerReplyService.addContent(reply);

        try {
            //响应
            if(n>0){
                rep.getWriter().print("success");
            }else{
                rep.getWriter().print("fail");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
