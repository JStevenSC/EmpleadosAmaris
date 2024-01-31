package com.Amaris.Amaris.web.Service;

import com.Amaris.Amaris.domain.dto.Employee;
import com.Amaris.Amaris.domain.dto.EmployeeData;
import com.Amaris.Amaris.domain.dto.EmployeesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service

public class EmpoyeeService {

    private final RestTemplate restTemplate;
    public List<Employee> buscarEmpoyee;

    @Autowired
    public EmpoyeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Employee buscarEmpoyee(String parametro) {
        String apiUrl = "http://dummy.restapiexample.com/api/v1/employee/" + parametro;
       EmployeeData respuetsa = restTemplate.getForObject(apiUrl, EmployeeData.class);

       Employee employee;
       employee = (respuetsa.getData());
       Integer salary= employee.employee_salary * 12;
       employee.setEmployee_salary_anual(salary);

       return  employee;
    }

    public EmployeesData buscarEmployees() {
        String apiUrl = "http://dummy.restapiexample.com/api/v1/employees";
        EmployeesData response = restTemplate.getForObject(apiUrl, EmployeesData.class);

        for (Employee employee : response.getData()) {
            int annualSalary = employee.getEmployee_salary() * 12;
            employee.setEmployee_salary_anual(annualSalary);
        }

        return response;
    }
}
