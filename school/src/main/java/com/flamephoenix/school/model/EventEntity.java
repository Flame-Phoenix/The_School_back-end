package com.flamephoenix.school.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class EventEntity {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String username;

    public EventEntity() {

    }

    public EventEntity(String title, String description, String username) {
        this.title = title;
        this.description = description;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
