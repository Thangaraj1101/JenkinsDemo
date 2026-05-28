package org.example;

import org.example.Employee;

public class EmployeeService {

    public String getEmployeeName(Employee employee) {
        return employee.getName();
    }

    public int calculateBonus(int salary) {
        return salary * 10 / 100;
    }
}