package com.bjsxt.tb.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author lvyelanshan
 * @create 2019-11-03 9:27
 */
public class Topic implements Serializable {

    private int topic_id;
    private String title;
    private String content;
    private String author;
    private Date create_date;
    private int click_amount;

    private List<Reply> reply;

    public Topic(int topic_id, String title, String content, String author, Date create_date, int click_amount, List<Reply> reply) {
        this.topic_id = topic_id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.create_date = create_date;
        this.click_amount = click_amount;
        this.reply = reply;
    }

    public Topic(String title, String content, String author, Date create_date) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.create_date = create_date;
    }

    public Topic() {
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getClick_amount() {
        return click_amount;
    }

    public void setClick_amount(int click_amount) {
        this.click_amount = click_amount;
    }

    public List<Reply> getReply() {
        return reply;
    }

    public void setReply(List<Reply> reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topic_id=" + topic_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", create_date=" + create_date +
                ", click_amount=" + click_amount +
                ", reply=" + reply +
                '}';
    }
}
