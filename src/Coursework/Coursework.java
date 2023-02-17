package Coursework;

public class Coursework {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.addEmployee("Иванов", "Иван", "Иванович", 1, 11_000);
        employee.addEmployee("Петров", "Петр", "Петрович", 2, 15000);
        employee.addEmployee("Сидоров", "Сидор", "Сидорович", 3, 13000);
        employee.addEmployee("Васильев", "Василий", "Иванович", 4, 16000);
        employee.addEmployee("Соловьев", "Степан", "Васильевич", 2, 22000);
        employee.addEmployee("Степанов", "Григорий", "Михайлович", 5, 17000);
        System.out.println("Данные сотрудников");
        employee.printAllEmployee();
        System.out.println();
        System.out.println("Количество сотрудников - " + employee.getCurrentSize());
        System.out.println();
        System.out.println("Сумма затрат на з/плату в месяц -  " + employee.sumSalary() + " рублей.");
        System.out.println();
        employee.employeeMaxSalary();
        System.out.println();
        employee.employeeMinSalary();
        System.out.println();
        System.out.println("Среднее значение з/плат - " + employee.averageSalary() + " рублей.");
        System.out.println();
        System.out.println("Список сотрудников");
        employee.employeeList();
    }
}

