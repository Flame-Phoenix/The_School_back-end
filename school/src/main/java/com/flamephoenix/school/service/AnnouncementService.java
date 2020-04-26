package com.flamephoenix.school.service;

import com.flamephoenix.school.model.Announcement;
import com.flamephoenix.school.repository.AnnouncementRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AnnouncementService {

    private AnnouncementRepository announcementRepository;

    public AnnouncementService(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }


    public List<Announcement> allAnnouncements(){

        return  announcementRepository.findByEmailAddress();

    }
}
