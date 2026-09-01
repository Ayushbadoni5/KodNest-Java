package track.Arrays.sept1;

public class addAnElemntInBetween {

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 40, 50 };
        int element = 30;
        int index = 2;

        int[] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr2.length; i++) {
            if (i < index) {
                arr2[i] = arr[i];
            }

            if (i == index) {
                arr2[i] = element;
            }
            if (i > index) {
                arr2[i] = arr[i - 1];
            }

        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
