package hw3;

import lombok.Data;
import java.time.LocalDate;
import java.util.Comparator;

@Data
public class Employee {
    /* * Класс сотрудника * */
    private String surname;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String position;
    private double salary;

    public Employee(String surname, String firstName, String lastName, LocalDate birthDate, String position, double salary) {
        /* * Конструктор класса сотрудника * */
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
        this.salary = salary;
    }

    public static Comparator<Employee> birthDateComparator() {
        /* *Прототип компаратора для сравнения двух дат рождения сотрудников * */
        return Comparator.comparing(employee -> employee.birthDate);
    }
}