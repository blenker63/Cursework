package Coursework;

public class coursework {
    public static void main (String[] args) {
        Employee employee = new Employee();
        employee.addEmployee("Иванов", "Иван", "Иванович", 1, 10000);
        employee.addEmployee("Петров", "Петр", "Петрович", 2, 20000);
        employee.addEmployee("Сидоров", "Сидор", "Сидорович", 3, 30000);
        employee.addEmployee("Васильев", "Василий", "Иванович", 4, 40000);
        employee.printAllEmployee();
        System.out.println("Количество сотрудников - " + employee.getCurrentSize());
    }
}

