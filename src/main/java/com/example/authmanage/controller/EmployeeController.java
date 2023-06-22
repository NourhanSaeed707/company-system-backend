package com.example.authmanage.controller;

import com.example.authmanage.model.Employee;
import com.example.authmanage.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private DepartmentService.EmployeeService employeeService;

    public EmployeeController(DepartmentService.EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Employee createEmployee(@RequestBody Employee employee) {
        return  employeeService.saveEmployee(employee);
    }

    @GetMapping("/get-all")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN','ROLE_USER')" )
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/{id}")

    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = null;
        employee =  employeeService.getEmployeeById(id);
        return  ResponseEntity.ok(employee);
    }

    @PutMapping("/edit/{id}")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')" )
    public Employee updateEmployeeById(@PathVariable("id") Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping("/delete/{id}")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')" )
    public ResponseEntity<Map<String, Boolean>> deleteEmployeeById(@PathVariable("id") Long id ) {
        Boolean deleted = false;
        deleted = employeeService.deleteEmployeeById(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }
}
