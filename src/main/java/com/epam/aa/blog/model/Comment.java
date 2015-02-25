package com.epam.aa.blog.model;

public class Comment {
    private Integer id;
    private String text;
    private Integer userId;
    private Integer postId;

    public Comment() {
        super();
    }

    public Comment(Integer id, String text, Integer userId, Integer postId) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}