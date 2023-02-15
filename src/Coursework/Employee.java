package Coursework;

import java.util.Arrays;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    static int counter = 0;
    private static int id;
    private int size = 0;


    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        Employee.id = id;
//        this.id = counter++;
//        counter++;
    }
    public Employee[] employees; {
    }

    public Employee() {
        this.employees = new Employee[10];
    }
    public String getSurname() {
        return this.surname;
    }
    public  String getName() {
        return this.name;
    }
    public String getPatronymic() {
        return this.patronymic;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addEmployee(String surname, String name, String patronymic, int department, int salary) {
        if (counter >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(surname, name, patronymic, department, salary);
        employees[counter++] = newEmployee;
        Employee.id = counter;
//        System.out.println(counter);
//        System.out.println(id);
//        System.out.println(this.name);
    }
    @Override
    public String toString() {
        return "ФИО: '" + getSurname() + '\''
                 + getName() + '\''
                 + getPatronymic() + '\'' +
                ", отдел - " + getDepartment() +
                ", зфплата - " + getSalary();
    }

    public void printAllEmployee() {
        for (int i = 0; i < counter; i++) {
        Employee employee = employees[i];
           System.out.println(employee);
        }
    }

    public int getCurrentSize() {
        return counter;
    }
}




