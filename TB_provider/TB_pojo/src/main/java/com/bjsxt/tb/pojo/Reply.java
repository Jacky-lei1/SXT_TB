package com.bjsxt.tb.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lvyelanshan
 * @create 2019-11-03 9:27
 */
public class Reply implements Serializable {

    private int reply_id;
    private int topic_id;
    private String author;
    private String content;
    private Date create_date;

    public Reply(int reply_id, int topic_id, String author, String content, Date create_date) {
        this.reply_id = reply_id;
        this.topic_id = topic_id;
        this.author = author;
        this.content = content;
        this.create_date = create_date;
    }

    public Reply(int topic_id, String author, String content) {
        this.topic_id = topic_id;
        this.author = author;
        this.content = content;
    }

    public Reply(int topic_id, String author, String content, Date create_date) {
        this.topic_id = topic_id;
        this.author = author;
        this.content = content;
        this.create_date = create_date;
    }

    public Reply() {
    }

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "reply_id=" + reply_id +
                ", topic_id=" + topic_id +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
