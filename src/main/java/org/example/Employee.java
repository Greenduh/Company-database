package org.example;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String position;
    private float salary;

    public Employee(int id, String name, int age, String position, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, int age, String position, float salary) {
        this(0, name, age, position, salary);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPosition() { return position; }
    public float getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " | Name: " + name + " | Age: " + age + " | Position: " + position + " | Salary: " + salary;
    }
}
