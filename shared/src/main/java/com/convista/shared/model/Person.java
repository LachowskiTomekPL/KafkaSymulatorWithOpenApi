package com.convista.shared.model;

import lombok.Data;

import java.util.UUID;


@Data

public class Person {


    private String firstName;
    private String lastName;

    private UUID uuid;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate dateOfBirth;


}
