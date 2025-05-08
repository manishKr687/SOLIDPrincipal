package com.example.SRP;

public class EmployeeReportGenerator {
    public String generateReport(Employee employee) {
        return "Report: " + employee.getName() + " - " + employee.getRole();
    }
}
