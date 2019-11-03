package com.bjsxt.tb.mapper;

import com.bjsxt.tb.pojo.Topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-03 9:45
 */
public interface TbTopicMapper {
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

    Topic findById(@Param("id") int id);

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

    int update(@Param("clickNum") int clickNum,@Param("topic_id") int topic_id);
}
