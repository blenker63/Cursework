package Coursework;

public class coursework {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.addEmployee("Иванов", "Иван", "Иванович", 1, 10_000);
        employee.addEmployee("Петров", "Петр", "Петрович", 2, 40000);
        employee.addEmployee("Сидоров", "Сидор", "Сидорович", 3, 30000);
        employee.addEmployee("Васильев", "Василий", "Иванович", 4, 20000);
        employee.addEmployee("Соловьев", "Степан", "Васильевич", 2, 24000);
        employee.addEmployee("Степанов", "Григорий", "Михайлович", 1, 32000);
        System.out.println("Данные сотрудников");
        employee.printAllEmployee();
        System.out.println("Количество сотрудников - " + employee.getCurrentSize());
        System.out.println("Сумма затрат на з/плату в месяц -  " + employee.SumSalary() + " рублей.");
        employee.employeeMaxSalary();
        employee.employeeMinSalary();
    }
}

