import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Task 1

        int[] intArr = new int[]{1, 2, 3};
        double[] doubleArr = {1.57, 7.654, 9.986};
        String[] stringArr = {"one", "two", "three", "four"};

//        Task 2

        System.out.println("Задание 2");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if ( i < intArr.length - 1 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.print(doubleArr[i]);
            if ( i < doubleArr.length -1 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < stringArr.length; i++) {
            System.out.print(stringArr[i]);
            if ( i < stringArr.length -1 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

//        Task 3
        System.out.println("Задание 3");
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i]);
            if ( i > 0 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            System.out.print(doubleArr[i]);
            if ( i > 0 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = stringArr.length - 1; i >= 0; i--) {
            System.out.print(stringArr[i]);
            if ( i > 0 ){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

//        Task 4
        System.out.println("Задание 4");
        for (int i = 0; i < intArr.length; i++) {
            if ( intArr[i] % 2 != 0 ){
                intArr[i]++;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}