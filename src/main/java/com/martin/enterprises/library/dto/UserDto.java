package com.martin.enterprises.library.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UserDto {

    @NotNull
    private int dni;

    @NotNull
    @Size(min=1, max=30)
    @Pattern(regexp = "^[A-Za-z]*$")
    private String firstName;

    @Size(min=1, max=30)
    @Pattern(regexp = "^[A-Za-z]*$")
    private String lastName;

    @Range(min=18, max=200)
    private int age;

    public UserDto() {
    }

    public UserDto(int dni, String firstName, String lastName, int age) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
