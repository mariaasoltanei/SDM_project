package com.lab2.firstmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Conference {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String date;

    @OneToOne(fetch = FetchType.EAGER)
    private Organizer organizer;

    @OneToMany(mappedBy = "conference")
    Set<Track> tracks;
}
