package hw2;
//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.



import java.lang.reflect.Array;

public class task2 {
    public static int minNumArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    public static int maxNumArray(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}