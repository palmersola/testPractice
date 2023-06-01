package org.example;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static final Pattern DATE_PATTERN = Pattern.compile("^(0?[1-9]|1[0-2])[\\/](0?[1-9]|[12]\\d|3[01])[\\/](19|20)\\d{2}$");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = sum(3,5);
        System.out.println(sum);

        int[] arrOne = {4, 1, 3, 9, 7};
        int average = average(arrOne);
        System.out.println(average);

        System.out.println("First name:");
        String first = scanner.nextLine();
        System.out.println("Last name:");
        String last = scanner.nextLine();
        String fullName = fullName(first, last);
        System.out.println(fullName);

        bubbleSort(arrOne, arrOne.length);

        System.out.println("Valid date mm/dd/yyyy: " + validDate("05/03/1998"));

    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static int average(int[] arr){
        int x = 0;
        for(int i : arr){
            x += i;
        }
        return x / arr.length;
    }

    public static String fullName(String first, String last){
        return first + " " + last;
    }

    public static int[] bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int sort = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static boolean validDate(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }


}