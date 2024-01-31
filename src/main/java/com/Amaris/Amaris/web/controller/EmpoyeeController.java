package com.Amaris.Amaris.web.controller;

import com.Amaris.Amaris.domain.dto.Employee;
import com.Amaris.Amaris.domain.dto.EmployeesData;
import com.Amaris.Amaris.web.Service.EmpoyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/empoyee")

public class EmpoyeeController {
    private final com.Amaris.Amaris.web.Service.EmpoyeeService empoyeeService;

    @Autowired
    public EmpoyeeController(EmpoyeeService empoyeeService) {
        this.empoyeeService = empoyeeService;
    }

    @GetMapping("/buscar-empoyee")
    public Employee buscarEmpoyee(@RequestParam Integer parametro) {
        return empoyeeService.buscarEmpoyee(String.valueOf(parametro));
    }

    @GetMapping("/buscar-empoyees")
    public EmployeesData buscarEmployees() {
        return empoyeeService.buscarEmployees();
    }


}
