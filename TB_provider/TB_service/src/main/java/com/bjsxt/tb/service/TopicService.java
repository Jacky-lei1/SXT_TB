package com.bjsxt.tb.service;

import com.bjsxt.tb.pojo.Topic;

import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-03 10:16
 */
public interface TopicService {
    /**
     * 查询所有帖子
     * @return
     */

    List<Topic> findAll();

    /**
     * 根据ID查询指定的帖子
     * @param id
     * @return
     */

    Topic findById(int id);


    /**
     * 添加帖子
     * @return
     */
    int addTopic(Topic topic);

    /**
     * 更新访问次数
     * @param clickNum
     * @return
     */

    int update(int clickNum,int topic_id);
}
