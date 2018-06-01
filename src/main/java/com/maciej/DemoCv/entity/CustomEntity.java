package com.maciej.DemoCv.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomEntity {

    private String email;
    private String firstName;
    private String lastName;
    private Cv cvAccepted;

    @Override
    public String toString() {
        return "email: " + email + " fn: " + firstName + " ln: " + lastName;
    }
}
