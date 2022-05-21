package com.lab2.firstmvc.controllers;

import com.lab2.firstmvc.domain.Conference;
import com.lab2.firstmvc.domain.Paper;

import com.lab2.firstmvc.services.PaperService;
import org.attoparser.dom.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/paper")
public class PaperController {
    private final PaperService paperService;

    public PaperController(PaperService paperService) {
        this.paperService = paperService;
    }

    @GetMapping("/newPaper")
    public String showAddPaper(Model model) {
        model.addAttribute("paper", new Paper());
        return "addpaper";
    }

    @PostMapping("/newPaper")
    public String uploadPaper(@RequestParam("paper") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        Paper paper = new Paper();
        paper.setFileName(fileName);
        paper.setContent(multipartFile.getBytes());
        paper.setSize(multipartFile.getSize());
        //paper.setTitle();
        paperService.savePaper(paper);
        return "index";
    }

}
