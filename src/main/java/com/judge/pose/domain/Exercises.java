package com.judge.pose.domain;

public class Exercises {
    private Integer id;

    private String description;

    private String title;

    private String type;

    public Exercises(Integer id, String description, String title, String type) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.type = type;
    }

    public Exercises() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}