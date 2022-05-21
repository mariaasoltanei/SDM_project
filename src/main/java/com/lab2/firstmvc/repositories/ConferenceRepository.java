package com.lab2.firstmvc.repositories;

import com.lab2.firstmvc.domain.Conference;
import org.springframework.data.repository.CrudRepository;

public interface ConferenceRepository extends CrudRepository<Conference,Long> {
}
