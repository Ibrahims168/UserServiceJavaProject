package com.userServiceProject.model;
import java.time.LocalDate;

public class User {
    private Long id;
    private  String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String address;
    private LocalDate joiningDate;
    private Boolean status;

    public User(Long id, String firstName, String lastName, String email, Integer age, String address, LocalDate joiningDate, Boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.address = address;
        this.joiningDate = joiningDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
