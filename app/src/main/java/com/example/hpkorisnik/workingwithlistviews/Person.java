package com.example.hpkorisnik.workingwithlistviews;

public class Person {

    private static int globalId = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String faculty;
    private String about;
    private int age;

    public Person(String firstName, String lastName, String faculty, String about, int age) {
        this.id = globalId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.about = about;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
