package com.lab2.firstmvc.repositories;

import com.lab2.firstmvc.domain.Track;
import org.springframework.data.repository.CrudRepository;

public interface TrackRepository extends CrudRepository<Track,Long> {
}
