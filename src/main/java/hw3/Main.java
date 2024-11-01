package hw3;

import java.time.LocalDate;

import static hw3.Employee.birthDateComparator;

/**
 * 1. Написать прототип компаратора - метод внутри класса сотрудника,
 * сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 * 2. Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
 * чтобы он мог поднять заработную плату всем, кроме руководителей.
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 **/
public class Main {
    public static void main(String[] args) {
        Employee sergey = new Employee("Маликов", "Сергей", "Петрович", LocalDate.of(1980, 5, 15), "Менеджер проекта", 320);
        Employee natalia = new Employee("Степанова", "Наталья", "Ивановна", LocalDate.of(1988, 8, 24), "Бухгалтер", 110);
        Employee ivan = new Employee("Бутусов", "Иван", "Сергеевич", LocalDate.of(1990, 5, 15), "Менеджер продукта", 320);
        Employee viktoria = new Employee("Лобкова", "Виктория", "Игоревна", LocalDate.of(1992, 1, 8), "Эксперт по связям с общественностью", 170);
        Employee maksim = new Employee("Нестеров", "Максим", "Максимович", LocalDate.of(1999, 3, 8), "Программист", 235);
        Employee olga = new Employee("Прохоренко", "Ольга", "Алексеевна", LocalDate.of(2005, 12, 5), "Дизайнер", 210);
        Employee aleksey = new Employee("Петров", "Алексей", "Александрович", LocalDate.of(1974, 10, 10), "Главный бухгалтер", 180);
        Employee irina = new Employee("Красавина", "Ирина", "Ивановна", LocalDate.of(1992, 1, 8), "Экономист", 150);

        // Задача 1. Сравнение с использованием компаратора
        if (birthDateComparator().compare(sergey, olga) > 0) {
            System.out.println(sergey.getFirstName() + " " + sergey.getBirthDate() +
                    " младше, чем " + olga.getFirstName() + " " + olga.getBirthDate());
        } else if (birthDateComparator().compare(sergey, olga) < 0) {
            System.out.println(sergey.getFirstName() + " " + sergey.getBirthDate() + " старше, чем "
                    + olga.getFirstName() + " " + olga.getBirthDate());
        } else {
            System.out.println(sergey.getFirstName() + " " + sergey.getBirthDate()
                    + " и "
                    + olga.getFirstName() + " " + olga.getBirthDate() + " родились в один день");
        }

        // Задача 2. Пример использования в основной программе
        Manager stepin = new Manager("Степин", "Михаил", "Петрович", LocalDate.of(1938, 5, 9), "Руководитель организации", 410);

        // Создаем массив сотрудников, включая руководителя
        Employee[] employees = {sergey, natalia, ivan, viktoria, maksim, olga, aleksey, irina, stepin};

        // Выводим информацию о зарплате каждого сотрудника до повышения, для дальнейшего контроля
        for (Employee employee : employees) {
            System.out.println(
                    employee.getSurname()
                            + " "
                            + employee.getFirstName()
                            + ", '"
                            + employee.getPosition()
                            + "' "
                            + ": "
                            + "до повышения - "
                            + employee.getSalary());
        }


        // Повышаем зарплату всем сотрудникам
        Manager.salaryIncrease(employees, 10);

        // Выводим информацию о зарплате каждого сотрудника после повышения
        for (Employee employee : employees) {
            System.out.println(
                    employee.getSurname()
                            + " "
                            + employee.getFirstName()
                            + ", '"
                            + employee.getPosition()
                            + "' "
                            + ": "
                            + "после повышения - "
                            + employee.getSalary());
        }

    }
}
