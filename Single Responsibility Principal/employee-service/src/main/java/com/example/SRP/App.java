package com.example.SRP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Example of Single Responsibility Principal" );
        Employee Emp = new Employee("Manish", "Engineer 1");
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(Emp);

    }
}
