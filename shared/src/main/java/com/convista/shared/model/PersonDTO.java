package com.convista.shared.model;

import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
