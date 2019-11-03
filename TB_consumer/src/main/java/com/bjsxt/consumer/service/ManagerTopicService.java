package com.bjsxt.consumer.service;

import com.bjsxt.tb.pojo.Topic;

import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-03 11:12
 */
public interface ManagerTopicService {

    /**
     * 查询所有帖子
     * @return
     */
    List<Topic> findAllTopics();

    /**
     * 根据id查询帖子信息
     * @param id
     * @return
     */
    Topic showDetails(int id);

    /**
     * 添加帖子
     * @param topic
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
