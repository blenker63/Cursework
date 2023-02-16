package Coursework;

public class Employee {
    public Employee[] employees;
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private int counter = 0;
    private  int id;
//    private int size = 0;
    private int i;
//    private int indexMaxSalary;
     private static int x = 0;
    private Employee employee;



    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        counter = 1 + x++;
        id = counter;

    }
    public Employee() {
        this.employees = new Employee[10];
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

    public void addEmployee(String surname, String name, String patronymic, int department, int salary) {
        if (counter >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(surname, name, patronymic, department, salary);
        employees[counter++] = newEmployee;
    }

    @Override
    public String toString() {
        return "ФИО: '" + getSurname() + '\''
                + getName() + '\''
                + getPatronymic() + '\'' +
                ", отдел - " + getDepartment() +
                ", зарплата - " + getSalary() + ", id - " + getId() + ", counter - " + counter;
    }

    public void printAllEmployee() {
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
//            System.out.println("Сотрудник с самой высокой з/платой - " + employees.employeeMaxSalary());
    }

    public int getCurrentSize() {
        return counter;
    }

    public int SumSalary() {
        int sumSalary = 0;
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            sumSalary = sumSalary + employee.getSalary();
        }
        return sumSalary;
    }

//    public int MaxSalaryMonth() {
//        int maxSalaryMonth = 0;
//        int idMaxSalary = 0;
//        for (int i = 0; i < counter; i++) {
//            if (employees[i].getSalary() > maxSalaryMonth) {
//                maxSalaryMonth = employees[i].getSalary();
//                idMaxSalary = employees[i].getId();
//            }
//            System.out.println(idMaxSalary);
//            System.out.println(employees[i].getId());
//        }
//        System.out.println(maxSalaryMonth);
//        System.out.println(employees[idMaxSalary - 1]);
//        return maxSalaryMonth;
//    }

    public void employeeMaxSalary() {
        int maxSalaryMonth = 0;
        int idMaxSalary  = 0;
        Employee employeeMaxSalary = null;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getSalary() > maxSalaryMonth) {
                maxSalaryMonth = employees[i].getSalary();
                idMaxSalary = employees[i].getId();
            }
//            System.out.println(idMaxSalary);  // проверка определения id сотрудника с максимальной з/платой
        }
            employeeMaxSalary  = employees[idMaxSalary - 1];
            System.out.println("Сотрудник с самой высокой з/платой - " +  employeeMaxSalary);
    }

        public void EmployeeMinSalary () {
            int minSalaryMonth = 1_000_000;
            Employee employeeMinSalary = null;
            for (int i = 0; i < counter; i++) {
                Employee employee = employees[i];
                if (employee.getSalary() < minSalaryMonth) ;
               employeeMinSalary = employees[i];
            }
            System.out.println("Сотрудник с самой низкой з/платой - " + employeeMinSalary);
        }
    }















