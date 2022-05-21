package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.Conference;
import com.lab2.firstmvc.domain.User;

import java.util.List;

public interface ConferenceService {
    Conference save(Conference conference);
    List<Conference> findAllConferences();
}
