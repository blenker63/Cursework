package Coursework;

import java.util.Arrays;

public class Employee {
    private  Employee[] employee = new Employee[10];
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private int id;
    private int counter =0;

//    public Employee() {
//        this.employee = Arrays.toString(new Employee[10]);
//    }
    public  Employee(String surname, String name, String patronymic, int department, int salary, int id) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }
    public Employee() {
    }

    public void addEmployee(String surname, String name, String patronymic, int department, int salary, int id) {
        if (counter >= employee.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(surname, name, patronymic, department, salary, id); //surname, name, patronymic, department, salary, id
        employee[counter++] = newEmployee;
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

//    public void printAllEmployee() {
//        for (int=0; )

    }




