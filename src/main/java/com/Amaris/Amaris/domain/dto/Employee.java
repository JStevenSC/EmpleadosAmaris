package com.Amaris.Amaris.domain.dto;

public class Employee {

    public  String id;
    public  String employee_name;
    public Integer employee_salary;

    public Integer employee_salary_anual;
    public  String employee_age;
    public  String profile_image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Integer getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Integer employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(String employee_age) {
        this.employee_age = employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public Integer getEmployee_salary_anual() {
        return employee_salary_anual;
    }

    public void setEmployee_salary_anual(Integer employee_salary_anual) {
        this.employee_salary_anual = employee_salary_anual;
    }
}
