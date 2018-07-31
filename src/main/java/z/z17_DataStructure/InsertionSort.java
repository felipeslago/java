package z.z17_DataStructure;

public class InsertionSort {

    public static void ascending(int[] arr) {

        int i;
        int j;
        int key;

        for (j = 1; j < arr.length; j++) {

            key = arr[j];

            for (i = j - 1; i >= 0 && arr[i] > key; i--) {

                arr[i + 1] = arr[i];

            }

            arr[i + 1] = key;
        }
    }

    public static void descending(int[] arr) {

        int i;
        int j;
        int key;

        for (j = 1; j < arr.length; j++) {

            key = arr[j];

            for (i = j - 1; i >= 0 && arr[i] < key; i--) {

                arr[i + 1] = arr[i];

            }

            arr[i + 1] = key;
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 4, 9, 1, 2, 5 };

        InsertionSort.print(arr);

        System.out.println();

        InsertionSort.ascending(arr);

        InsertionSort.print(arr);

        System.out.println();

        InsertionSort.descending(arr);

        InsertionSort.print(arr);

    }

}
