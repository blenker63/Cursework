package Coursework;

public class coursework {
    public static void main (String[] args) {
        Employee employee = new Employee();
        employee.addEmployee("Иванов", "Иван", "Иванович", 1, 10000, 0);
        employee.addEmployee("Петров", "Петр", "Петрович", 2, 20000, 0 );
        employee.addEmployee("Сидоров", "Сидор", "Сидорович", 3, 30000, 0);
        employee.addEmployee("Васильев", "Василий", "Иванович", 4, 40000, 0);
        employee.printAllEmployee();
        System.out.println(employee.getName());
        System.out.println(employee);
    }
}

