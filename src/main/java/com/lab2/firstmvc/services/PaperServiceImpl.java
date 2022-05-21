package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.Paper;
import com.lab2.firstmvc.repositories.PaperRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService{
    private final PaperRepository paperRepository;

    public PaperServiceImpl(PaperRepository paperRepository) {
        this.paperRepository = paperRepository;
    }

    @Override
    public List<Paper> findAllPapers() {
        return (List<Paper>) paperRepository.findAll();
    }

    @Override
    public Paper savePaper(Paper paper) {
        return paperRepository.save(paper);
    }
}
