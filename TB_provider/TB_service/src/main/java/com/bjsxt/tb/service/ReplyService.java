package com.bjsxt.tb.service;

import com.bjsxt.tb.pojo.Reply;

/**
 * @author lvyelanshan
 * @create 2019-11-03 10:15
 */
public interface ReplyService {

    /**
     * 完成添加评论操作
     * @return
     */

    int addReply(Reply reply);
}
