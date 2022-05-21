package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.Conference;
import com.lab2.firstmvc.repositories.ConferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceServiceImpl implements ConferenceService{
    private final ConferenceRepository conferenceRepository;

    public ConferenceServiceImpl(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @Override
    public Conference save(Conference conference) {
        return conferenceRepository.save(conference);
    }

    @Override
    public List<Conference> findAllConferences() {
        return (List<Conference>) conferenceRepository.findAll();
    }
}
