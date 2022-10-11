package lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        changeArray();
        System.out.println();
        fillDiagonal();
        System.out.print(Arrays.toString(fillArray(10, 3)));
        System.out.println();
        MinMaxArr();
        int[] arr = {2, 2, 2, 1, 2, 2, 4, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(checkBalance(arr));
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(disPlace(arr2, -2)));
    }
// 1)
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.print(Arrays.toString(arr));
    }
// 2)
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));
    }
// 3)
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
// 4)
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = arr[i][arr.length - 1 - i] = 1;
        }
        for (int[] arri : arr) {
            System.out.print(Arrays.toString(arri));
            System.out.println();
        }
    }
// 5)
    public static int[] fillArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
 // 6)
     public static void MinMaxArr() {
         int[] arr = { 10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         int min = arr[0];
         int max = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = arr[i];
             }
             if (arr[i] > max) {
                 max = arr[i];
             }
         }
         System.out.printf("min=%d, max=%d%n", min, max);
     }
// 7)
    public static boolean checkBalance(int[] arr) {
        int sum = 0 ;
        for (int j : arr) {
            sum += j;
        }

        if (sum % 2 != 0) {
            return false;
        }
        int leftSum = 0;
        for (int j : arr) {
            leftSum += j;
            if (leftSum == sum / 2) {
                return true;
            }
        }
        return false;
    }
// 8)
    public static int[] disPlace(int[] arr, int n) {
        n %= arr.length;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = a;
            }
        } else if (n < 0) {
            for (int i = 0; i < -n; i++) {
                int a = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = a;
            }
        }
        return arr;
    }
}
