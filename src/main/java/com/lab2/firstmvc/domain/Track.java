package com.lab2.firstmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Track {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @ManyToOne
    private Conference conference;

}