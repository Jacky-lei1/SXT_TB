package com.bjsxt.consumer.service.impl;

import com.bjsxt.consumer.service.ManagerTopicService;
import com.bjsxt.tb.pojo.Topic;
import com.bjsxt.tb.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-03 11:13
 */
@Service
public class ManagerTopicServiceImpl implements ManagerTopicService {

    @Autowired
    private TopicService topicServiceProxy;

    @Override
    public List<Topic> findAllTopics() {
        return topicServiceProxy.findAll();
    }

    @Override
    public Topic showDetails(int id) {
        Topic topic = topicServiceProxy.findById(id);
        System.out.println("服务消费者通过ID获取到的集合："+topic);
        return topic;
    }

    @Override
    public int addTopic(Topic topic) {
        return topicServiceProxy.addTopic(topic);
    }

    @Override
    public int update(int clickNum, int topic_id) {
        return topicServiceProxy.update(clickNum,topic_id);
    }
}
