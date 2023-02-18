package Coursework;

public class Coursework {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.addEmployee("Иванов", "Иван", "Иванович", 1, 11_000);
        employeeManagement.addEmployee("Петров", "Петр", "Петрович", 2, 15000);
        employeeManagement.addEmployee("Сидоров", "Сидор", "Сидорович", 3, 13000);
        employeeManagement.addEmployee("Васильев", "Василий", "Иванович", 4, 16000);
        employeeManagement.addEmployee("Соловьев", "Степан", "Васильевич", 2, 22000);
        employeeManagement.addEmployee("Степанов", "Григорий", "Михайлович", 5, 17000);

//            public Employee[] employees;
//    public Employee() {
//        this.employees = new Employee[10]; // объявление длины массива
//    }
//    public void addEmployee(String surname, String name, String patronymic, int department, int salary) {
//        if (counter >= employees.length) {
//            System.out.println("Нельзя добавить сотрудника, закончилось место");
//        }
//        Employee newEmployee = new Employee(surname, name, patronymic, department, salary);
//        employees[counter++] = newEmployee;
//    }
        System.out.println("Данные сотрудников");
        employeeManagement.printAllEmployee();
        System.out.println();
        System.out.println("Количество сотрудников - " + employeeManagement.getCurrentSize());
        System.out.println();
        System.out.println("Сумма затрат на з/плату в месяц -  " + employeeManagement.sumSalary() + " рублей.");
        System.out.println();
        employeeManagement.employeeMaxSalary();
        System.out.println();
        employeeManagement.employeeMinSalary();
        System.out.println();
        System.out.println("Среднее значение з/плат - " + employeeManagement.averageSalary() + " рублей.");
        System.out.println();
        System.out.println("Список сотрудников");
        employeeManagement.employeeList();
    }
}

