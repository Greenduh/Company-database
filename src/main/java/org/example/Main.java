package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();

        try {
            Connection conn = dbConnector.connect();
            EmployeeDAO employeeDAO = new EmployeeDAO(conn);

            // додавання
            Employee emp1 = new Employee("Nikita", 19, "Developer", 4000);
            employeeDAO.addEmployee(emp1);

            // виведення
            List<Employee> employees = employeeDAO.getAllEmployees();
            System.out.println("Всі співробітники:");
            employees.forEach(System.out::println);

            // оновлення
            Employee updatedEmp = new Employee(employees.get(0).getId(), "Nikita", 20, "Senior Developer", 5000);
            employeeDAO.updateEmployee(updatedEmp);
            System.out.println("Після оновлення:");
            employeeDAO.getAllEmployees().forEach(System.out::println);

            // видалення
            employeeDAO.deleteEmployee(updatedEmp.getId());
            System.out.println("Після видалення:");
            employeeDAO.getAllEmployees().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
