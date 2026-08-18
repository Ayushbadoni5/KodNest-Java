package track.Arrays.Aug18;

public class KeySearch {

    String search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return "Element Found at index: " + i;

            }
        }
        return "Element Not Found";
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        KeySearch ks = new KeySearch();
        System.out.println(ks.search(arr, 30));
    }

}
