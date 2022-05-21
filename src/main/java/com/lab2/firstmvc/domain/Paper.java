package com.lab2.firstmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Paper {
    @Id
    @GeneratedValue
    private Long id;
    private String fileName;
    private String title;
    private int noPages;
    private boolean status = false;
    private long size;
    private byte[] content;
}
