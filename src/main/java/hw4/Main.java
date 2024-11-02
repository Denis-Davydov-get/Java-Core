package hw4;

import hw3.Employee;
import hw3.Holidays;

/**
 * В класс покупателя добавить перечисление с гендерами,
 * добавить в сотрудника свойство «пол» со значением созданного перечисления.
 * Добавить геттеры, сеттеры.
 * Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
 * написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
 * а мужчин с 23 февраля, если сегодня соответствующий день.
 **/
public class Main {
    public static void main(String[] args) {
        Buyer sergey = new Buyer("Маликов", Gender.MALE);
        Buyer natalia = new Buyer("Степанова", Gender.FEMALE);
        Buyer ivan = new Buyer("Бутусов", Gender.MALE);
        Buyer viktoria = new Buyer("Лобкова", Gender.FEMALE);
        Buyer maksim = new Buyer("Нестеров", Gender.MALE);
        Buyer olga = new Buyer("Прохоренко", Gender.FEMALE);
        Buyer aleksey = new Buyer("Петров", Gender.MALE);
        Buyer irina = new Buyer("Красавина", Gender.FEMALE);

        Buyer[] buyers = {sergey, natalia, ivan, viktoria, maksim, olga, aleksey, irina};
        for (Holidays holidays : Holidays.values()) {
            System.out.println(System.lineSeparator()); // разделитель для удобства чтения
            System.out.println(holidays);  // объявление праздника

            if (holidays == Holidays.NewYear) {
                for (Buyer buyer : buyers) {
                    System.out.println(buyer.name + " С новым годом!");
                }
            } else if (holidays == Holidays.February23) {
                for (Buyer buyer : buyers) {
                    if (buyer.gender == Gender.MALE) {
                        System.out.println(buyer.name + " C 23 февраля");
                    }
                }
            } else if (holidays == Holidays.March8) {
                for (Buyer buyer : buyers) {
                    if (buyer.gender == Gender.FEMALE) {
                        System.out.println(buyer.name + " C 8 марта");
                    }
                }
            }
            else {
                System.out.println("Сейчас нет праздника");
            }

        }

    }
}
