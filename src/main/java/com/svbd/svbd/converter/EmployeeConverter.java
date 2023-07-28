package com.svbd.svbd.converter;

import com.svbd.svbd.dto.employee.EmployeeWithLastSalaryBO;
import com.svbd.svbd.entity.Employee;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public final class EmployeeConverter {

    private EmployeeConverter() {
    }

    public static EmployeeWithLastSalaryBO toEmployeeWithLastSalaryBO(Employee employee) {
        var employeeWithLastSalary = new EmployeeWithLastSalaryBO();
        employeeWithLastSalary.setId(employee.getEmployeeId());
        employeeWithLastSalary.setName(employee.getName());
        employeeWithLastSalary.setPhoneNumber(employee.getPhoneNumber());
        employeeWithLastSalary.setPerHour(employee.getSalaries().stream().findFirst().get().getAnHour());
        return employeeWithLastSalary;
    }

    public static Set<EmployeeWithLastSalaryBO> toEmployeeWithLastSalaryBOs(Collection<Employee> employees) {
        return employees.stream()
                .map(EmployeeConverter::toEmployeeWithLastSalaryBO)
                .collect(Collectors.toSet());
    }
}
