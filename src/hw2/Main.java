package hw2;

public class Main {
    public static void main(String[] args) {
//        task1
        int[] arr = {2, 1, 2, 3, 4};
        int[] arrZerro = {2, 0, 0, 3, 4};
        System.out.println("task1");
        System.out.println(task1.countEvens(arr));
//      task2
        System.out.println("task2");
        System.out.println(task2.minNumArray(arr));
        System.out.println(task2.maxNumArray(arr));
        System.out.println("task3");
        System.out.println(task3.searchDoobleZero(arrZerro));
    }
}
