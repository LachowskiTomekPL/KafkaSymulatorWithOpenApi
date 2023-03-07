package com.convista.kafkaconsumerdatabase.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;


@Data

public class Person {


    private String firstName;
    private String lastName;

    private UUID uuid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;


}
