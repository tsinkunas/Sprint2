package com.tsink.app;

public class Employee {
    private String name;
    private String surname;
    private double wage;

    public Employee() {

    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, double wage) {
        this.name = name;
        this.surname = surname;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Darbuotojas: " + name + ' ' + surname + "; darbo užmokestis: " + wage + "eur";
    }
}
