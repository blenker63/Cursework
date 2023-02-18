package Coursework;
public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    private static int counter = 0;
    private int id;


    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
//        System.out.println(counter); // проверка счетчика
//        System.out.println(id); // проверка id
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

//    public Employee[] employees;
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
    @Override
    public String toString() {
        return "id: " + getId() + "  " + "ФИО: '" + getSurname() + '\''
                + getName() + '\''
                + getPatronymic() + '\'' +
                ", отдел - " + getDepartment() +
                ", зарплата, рублей - " + getSalary() //+ ", id - " + getId() + ", counter - " + counter
     + ";";
    }
}
//    public void printAllEmployee() {
//        for (int i = 0; i < counter; i++) {
//            Employee employee = employees[i];
//            System.out.println(employee);
//        }
//    }
//    public int getCurrentSize() {
//        return counter;
//    }
//    public int sumSalary() {
//        int sumSalary = 0;
//        for (int i = 0; i < counter; i++) {
//            Employee employee = employees[i];
//            sumSalary = sumSalary + employees[i].getSalary();
//        }
//        return  sumSalary;
//    }
//    public void employeeMaxSalary() {
//        int maxSalaryMonth = 0;
//        int idMaxSalary  = 0;
//        Employee employeeMaxSalary = null;
//        for (int i = 0; i < counter; i++) {
//            if (employees[i].getSalary() > maxSalaryMonth) {
//                maxSalaryMonth = employees[i].getSalary();
//                idMaxSalary = employees[i].getId();
//            }
//        }
//            employeeMaxSalary  = employees[idMaxSalary - 1];
//            System.out.println("Сотрудник с самой высокой з/платой: " +  employeeMaxSalary);
//    }
//
//        public void employeeMinSalary () {
//            int minSalaryMonth = 1_000_000;
//            int idMinSalary  = 0;
//            Employee employeeMinSalary = null;
//            for (int i = 0; i < counter; i++) {
//                if (employees[i].getSalary() < minSalaryMonth) {
//                minSalaryMonth = employees[i].getSalary();
//                idMinSalary = employees[i].getId();
//            }
//        }
//            employeeMinSalary = employees[idMinSalary - 1];
//            System.out.println("Сотрудник с самой низкой з/платой: " + employeeMinSalary);
//    }
//    public String averageSalary() {
//        float average  =  (float) sumSalary() / counter ;
//        String averageSalary = String.format("%.2f", average);
//        return averageSalary;
//    }
//    public void employeeList() {
//        for (int i = 0; i < counter; i++) {
//            Employee employee = employees[i];
//
//            System.out.println("№ п/п " + employees[i].getId() + "    " + employees[i].getSurname() + " "
//                    +  employees[i].getName() + " " + employees[i].getPatronymic() + ";");
//        }
//    }
//}















