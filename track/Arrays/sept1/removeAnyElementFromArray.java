package track.Arrays.sept1;

import java.util.Scanner;

public class removeAnyElementFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index to remove: ");
        int index = sc.nextInt();

        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index!");
            return;
        }

        int[] arr2 = new int[arr.length - 1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            arr2[j] = arr[i];
            j++;
        }

        System.out.println("Array: ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        sc.close();
    }
}
