package Coursework;

import java.util.Arrays;

public class Employee {
    private static  Employee[] employees;
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private int id = 0;
    private static int counter = 0;

        public Employee() {
        this.employees = new Employee[10];
    }
//    public Employee(String surname, String name, String patronymic, int department, int salary, int id) {
//        this.surname = surname;
//        this.name = name;
//        this.patronymic = patronymic;
//        this.department = department;
//        this.salary = salary;
//        this.id = id;
//        employees = new Employee[10];
//    }

//    public Employee() {
//    }

    public void addEmployee(String surname, String name, String patronymic, int department, int salary, int id) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = id;
//        if (counter >= employees.length) {
//            System.out.println("Нельзя добавить сотрудника, закончилось место");
//        }
//        Employee newEmployee = new Employee(surname, name, patronymic, department, salary, id); //surname, name, patronymic, department, salary, id
        Employee newEmployee = new Employee(); //surname, name, patronymic, department, salary, id
        employees[counter++] = newEmployee;
        this.id = counter;

    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
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

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                ", counter=" + counter +
                '}';
    }

    public static void printAllEmployees() {
        for (int i = 0; i < 3; i++) {
        Employee employee = employees[i];
            System.out.println(employee.getName() + employee.getSurname());
        }

    }
}




