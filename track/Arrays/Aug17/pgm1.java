package track.Arrays.Aug17;

import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];

        // Taking array input using for loop and a.length
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        // Displaying array elements using for loop and a.length
        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

