package com.bjsxt.consumer.service;

import com.bjsxt.tb.pojo.Reply;

/**
 * @author lvyelanshan
 * @create 2019-11-03 15:38
 */
public interface ManagerReplyService {
    /**
     * 添加评论
     */
    public int addContent(Reply reply);
}
