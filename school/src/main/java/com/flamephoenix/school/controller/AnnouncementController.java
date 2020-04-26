package com.flamephoenix.school.controller;

import com.flamephoenix.school.service.AnnouncementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("announcements")
@RestController
public class AnnouncementController {

    private AnnouncementService  announcementService;

    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @CrossOrigin
    @PostMapping
    public List allAnnouncements(){
        return announcementService.allAnnouncements();
    }
}
