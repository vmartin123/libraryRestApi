package com.martin.enterprises.library.dto;

public class UserDto {

    private int DNI;
    private String firstName;
    private String lastName;
    private int age;

    public UserDto(int DNI, String firstName, String lastName, int age) {
        this.DNI = DNI;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
