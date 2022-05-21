package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.Paper;

import java.util.List;

public interface PaperService {
    List<Paper> findAllPapers();

    Paper savePaper(Paper paper);
}
