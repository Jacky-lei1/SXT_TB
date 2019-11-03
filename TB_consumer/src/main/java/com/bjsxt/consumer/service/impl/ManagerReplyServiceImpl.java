package com.bjsxt.consumer.service.impl;

import com.bjsxt.consumer.service.ManagerReplyService;
import com.bjsxt.tb.pojo.Reply;
import com.bjsxt.tb.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lvyelanshan
 * @create 2019-11-03 15:39
 */
@Service
public class ManagerReplyServiceImpl implements ManagerReplyService {

    @Autowired
    private ReplyService replyServiceProxy;

    @Override
    public int addContent(Reply reply) {
      return replyServiceProxy.addReply(reply);
    }
}
