package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeServiceTest {

    @Test
    void testEmployeeName() {

        Employee employee = new Employee(1, "John");

        EmployeeService service = new EmployeeService();

        assertEquals("John", service.getEmployeeName(employee));
    }

    @Test
    void testBonusCalculation() {

        EmployeeService service = new EmployeeService();

        assertEquals(1000, service.calculateBonus(10000));
    }
}