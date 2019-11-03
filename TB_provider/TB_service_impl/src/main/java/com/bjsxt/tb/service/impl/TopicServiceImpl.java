package com.bjsxt.tb.service.impl;

import com.bjsxt.tb.mapper.TbTopicMapper;
import com.bjsxt.tb.pojo.Topic;
import com.bjsxt.tb.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-03 10:20
 */
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TbTopicMapper tbTopicMapper;

    /**
     * 查询所有帖子
     */

    @Override
    public List<Topic> findAll() {

        List<Topic> all = this.tbTopicMapper.findAll();
        /*for(Topic topic:all){
            System.out.println("服务提供者中遍历的集合："+topic);
        }*/
        return all;
    }
    /**
     * 根据ID查询指定的帖子
     */

    @Override
    public Topic findById(int id) {
        // TODO Auto-generated method stub
        Topic topic = this.tbTopicMapper.findById(id);
        System.out.println("服务提供者的topic："+topic);
        return topic;

    }

    /**
     * 添加帖子
     */
    @Override
    public int addTopic(Topic topic) {
        topic.setCreate_date(new java.sql.Timestamp(topic.getCreate_date().getTime()));
        return this.tbTopicMapper.addTopic(topic);
    }

    /**
     * 更新访问次数
     */
    @Override
    public int update(int clickNum,int topic_id) {

        return this.tbTopicMapper.update(clickNum,topic_id);
    }

}
