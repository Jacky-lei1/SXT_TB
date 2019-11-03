package com.bjsxt.tb.service.impl;

import com.bjsxt.tb.mapper.TbReplyMapper;
import com.bjsxt.tb.pojo.Reply;
import com.bjsxt.tb.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 添加评论
 * @author lvyelanshan
 * @create 2019-11-03 10:17
 */
@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private TbReplyMapper tbReplyMapper;

    @Override
    public int addReply(Reply reply) {
        reply.setCreate_date(new java.sql.Timestamp(reply.getCreate_date().getTime()));
        return tbReplyMapper.addReply(reply);
    }
}
