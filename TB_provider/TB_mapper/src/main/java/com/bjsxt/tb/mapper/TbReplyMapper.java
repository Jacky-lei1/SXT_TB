package com.bjsxt.tb.mapper;

import com.bjsxt.tb.pojo.Reply;

/**
 * @author lvyelanshan
 * @create 2019-11-03 9:44
 */
public interface TbReplyMapper {
    /**
     * 添加评论
     * @return
     */

    int addReply(Reply reply);
}
