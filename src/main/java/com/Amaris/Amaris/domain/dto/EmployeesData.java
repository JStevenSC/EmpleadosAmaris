package com.Amaris.Amaris.domain.dto;

import java.util.List;

public class EmployeesData {
    public Object status;
    public List<Employee> data;
    public Object message;

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public List<Employee> getData() {
        return data;
    }

    public void setData(List<Employee> data) {
        this.data = data;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
