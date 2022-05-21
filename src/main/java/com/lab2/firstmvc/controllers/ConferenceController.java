package com.lab2.firstmvc.controllers;

import com.lab2.firstmvc.domain.Conference;
import com.lab2.firstmvc.services.ConferenceService;
import com.lab2.firstmvc.services.TrackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conference")
public class ConferenceController {
    private final ConferenceService conferenceService;

    public ConferenceController(ConferenceService conferenceService) {
        this.conferenceService = conferenceService;
    }

    @GetMapping("/newConf")
    public String showAddConf(Model model){
        model.addAttribute("conference",new Conference());
        return "addconference";
    }

    @PostMapping("/newConf")
    public String addConf(Conference conference){
        conferenceService.save(conference);
        return "index";
    }
}
