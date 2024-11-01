package hw3;

import java.time.LocalDate;

public class Manager extends Employee {


    public Manager(String surname, String firstName, String lastName, LocalDate birthDate, String position, double salary) {
        super(surname, firstName, lastName, birthDate, position, salary);
    }


    public static void salaryIncrease(Employee[] employees, double percentage) {
        /* *Статический метод для повышения зарплаты* */
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double currentSalary = employee.getSalary();
                double newSalary = currentSalary * (1 + percentage / 100);
                employee.setSalary(newSalary);
            }
        }
    }

}
