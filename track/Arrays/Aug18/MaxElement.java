package track.Arrays.Aug18;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements to find the maximum amoungst them: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println();
        System.out.println("Max element: " + max);
    }
}
