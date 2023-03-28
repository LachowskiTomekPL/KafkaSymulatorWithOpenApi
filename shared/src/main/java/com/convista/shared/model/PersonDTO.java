package com.convista.shared.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.UUID;


@Data
public class PersonDTO {
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private UUID uuid;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private LocalDate dateOfBirth;


}
