package com.example.demo.dto;

import lombok.*;

import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO {
    private int id;
    private String firstName;
    private String lastName;

    @Positive
    private int age;

    private OffsetDateTime createdDate;
}
