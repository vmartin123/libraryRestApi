package com.martin.enterprises.library.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UserDto {

    @NotNull
    @Range(max=9)
    private int DNI;

    @NotNull
    @Size(min=1, max=30)
    @Pattern(regexp = "^[A-Za-z]*$")
    private String firstName;

    @Size(min=1, max=30)
    @Pattern(regexp = "^[A-Za-z]*$")
    private String lastName;

    @Range(min=2)
    private int age;

    public UserDto() {}

    public UserDto(int DNI, String firstName, String lastName, int age) {
        this.DNI = DNI;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
