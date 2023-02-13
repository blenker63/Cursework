package Coursework;

public class coursework {
    public static void main (String[] args) {
        Employee employee = new Employee();
        employee.addEmployee("Иванов", "Иван", "Иванович", 1, 10000, 1);
//        employee.addEmployee("Петров", "Иван", "Иванович", 1, 10000, 2);
//        employee.addEmployee("Сидоров", "Иван", "Иванович", 1, 10000, 3);
//        Employee.printAllEmployees();
        System.out.println(employee.getName());
        System.out.println();
    }
}

