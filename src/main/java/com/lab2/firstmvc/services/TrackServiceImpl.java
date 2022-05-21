package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.Track;
import com.lab2.firstmvc.repositories.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService{
    private final TrackRepository trackRepo;

    public TrackServiceImpl(TrackRepository trackRepo) {
        this.trackRepo = trackRepo;
    }

    @Override
    public Track save(Track track) {
        return trackRepo.save(track);
    }

}
