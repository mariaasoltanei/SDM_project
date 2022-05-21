package com.lab2.firstmvc.controllers;

import com.lab2.firstmvc.domain.Conference;
import com.lab2.firstmvc.domain.Track;
import com.lab2.firstmvc.services.ConferenceService;
import com.lab2.firstmvc.services.TrackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/track")
public class TrackController {
    private final TrackService trackService;
    private  final ConferenceService conferenceService;

    public TrackController(TrackService trackService, ConferenceService conferenceService) {
        this.trackService = trackService;
        this.conferenceService = conferenceService;
    }

    @GetMapping("/newTrack")
    public String showAddTrack(Model model){
        Iterable<Conference> listConf = conferenceService.findAllConferences();
        model.addAttribute("track",new Track());
        model.addAttribute("listConf", listConf);
        return "addtrack";
    }

    @PostMapping("/newTrack")
    public String addTrack(Track track){
        trackService.save(track);
        return "index";
    }
}
