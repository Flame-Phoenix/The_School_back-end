package com.flamephoenix.school.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "announcement")
@NamedNativeQueries({
        @NamedNativeQuery(name = "Announcement.findByEmailAddress",
                query = "select a.* from announcement a order by a.date_created_announcement desc LIMIT 8",
                resultClass = Announcement.class)
})
public class Announcement {

    @Id
    @GeneratedValue
    private Integer id_announcement;
    private String title_announcement;
    // it has max chars capacity in database need to change in its need more
    private String description_announcement;
    @ManyToOne
    private UserEntity announcement_creator;
    private Date date_created_announcement;

    // constructor
    public Announcement() {
    }


    // setter getters
    public Date getDate_created_announcement() {
        return date_created_announcement;
    }

    public void setDate_created_announcement(Date date_created_announcement) {
        this.date_created_announcement = date_created_announcement;
    }

    public Integer getId_announcement() {
        return id_announcement;
    }

    public void setId_announcement(Integer id_announcement) {
        this.id_announcement = id_announcement;
    }

    public String getTitle_announcement() {
        return title_announcement;
    }

    public void setTitle_announcement(String title_announcement) {
        this.title_announcement = title_announcement;
    }

    public String getDescription_announcement() {
        return description_announcement;
    }

    public void setDescription_announcement(String description_announcement) {
        this.description_announcement = description_announcement;
    }

    public UserEntity getAnnouncement_creator() {
        return announcement_creator;
    }

    public void setAnnouncement_creator(UserEntity announcement_creator) {
        this.announcement_creator = announcement_creator;
    }
}
