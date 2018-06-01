package com.maciej.DemoCv.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
public class Cv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String userDescription;

    private Timestamp lastUpdated;

    @OneToMany(mappedBy = "cv")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Skill> skills;

}
