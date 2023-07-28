package com.svbd.svbd.service;

import com.svbd.svbd.dao.employee.EmployeeDaoImpl;
import com.svbd.svbd.entity.Employee;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {

    private EmployeeDaoImpl repository = new EmployeeDaoImpl();

    public Long createEmployee(Employee employee) throws SQLException {
        return repository.createEmployee(employee);
    }

    public List<Employee> getAllEmployee() {
        return repository.findAll();
    }
}
