package com.hillel.lesson_04;

import java.util.Objects;

public class Student extends Stud {
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private Predmet predmet;

    public Student(String firstName, String lastName) {
        super(12);
        this.firstName = firstName;
        this.lastName = lastName;
        predmet = new Predmet("MATH");
    }

    public Student(String firstName, String lastName, int age, String phone) {
        super(12);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", predmet=" + predmet +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, phone);
    }
}
