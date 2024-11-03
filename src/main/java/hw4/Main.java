package hw4;

import java.util.Calendar;
import java.util.Scanner;

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
        Calendar calendar = Calendar.getInstance();
        String date = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
        String month = Integer.toString(calendar.get(Calendar.MONTH));
        String s = date + "." + month;
//        Scanner scanner = new Scanner("Введите число в формате дата.месяц: ");
//        String s = scanner.nextLine();

        if (s.equals("01.01")) {
            for (Buyer buyer : buyers) {
                System.out.println(buyer.name + " С новым годом!");
            }
        } else if (s.equals("23.02")) {
            for (Buyer buyer : buyers) {
                if (buyer.gender == Gender.MALE) {
                    System.out.println(buyer.name + " C 23 февраля");
                }
            }
        } else if (s.equals("08.03")) {
            for (Buyer buyer : buyers) {
                if (buyer.gender == Gender.FEMALE) {
                    System.out.println(buyer.name + " C 8 марта");
                }
            }
        } else {
            System.out.println("Сейчас нет праздника");
        }

    }

}

