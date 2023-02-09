package com.employee.card;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    @NotBlank(message = "The Name field must not be empty")
    private String name;
    @NotBlank(message = "The Surname field must not be empty")
    private String surname;
    @Max(value = 1200, message = "Max salary 1200")
    @Min(value = 500, message = "Min salary 500")
    private int salary;
    private String department;
    private String language;
    private Map<String, String> departments;
    private Map<String, String> languages;

    public Employee() {

        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resource", "HR");
        departments.put("Sales", "Sales");

        languages = new HashMap<>();
        languages.put("Yes", "YES");
        languages.put("No", "NO");

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", language='" + language + '\'' +
                ", departments=" + departments +
                ", languages=" + languages +
                '}';
    }
}
