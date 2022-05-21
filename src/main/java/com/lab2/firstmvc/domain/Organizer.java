package com.lab2.firstmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Organizer {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToOne(mappedBy = "organizer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Conference conference;
}
