package com.example.SRP;

public class EmployeeRepository {
    public void save(Employee employee) {
        // Save employee to the database
        System.out.println("Saving employee: " + employee.getName());
    }
}
