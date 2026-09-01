package track.Arrays.sept1;

public class addElementToArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 50, 70 };
        int[] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = 90;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

    }

}
