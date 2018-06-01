package com.maciej.DemoCv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CustomEntity {

    private String email;
    private String firstName;
    private String lastName;
    private Cv cvAccepted;

}
