package com.lab2.firstmvc.repositories;

import com.lab2.firstmvc.domain.Paper;
import org.springframework.data.repository.CrudRepository;

public interface PaperRepository extends CrudRepository<Paper,Long> {
}
