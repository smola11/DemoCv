package com.maciej.DemoCv.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    //@Fetch(value = FetchMode.JOIN)
    private Employee employee;

    private String email;
    private String firstName;
    private String lastName;

}
