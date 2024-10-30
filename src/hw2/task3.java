package hw2;

import sun.font.TrueTypeFont;

/*Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.*/
public class task3 {
    public static boolean searchDoobleZero(int[] arr) {
            if (arr.length < 2) {
                return false;
            }

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0 && arr[i + 1] == 0) {

                    return true;
                }
            }

            return false;
    }
}
