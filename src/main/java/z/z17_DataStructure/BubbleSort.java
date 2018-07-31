package z.z17_DataStructure;

public class BubbleSort {

    // Bubble Sort is the one of the most simple algorithms
    // The idea is to go through the vector many times and each time float the greatest element of the sequence to the
    // top
    // It is not recommended to programs that need speed and work with a high amount of data

    public static void ascending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) { // These loops go through the array in n2 times: if the array
                                                       // have 5 numbers, it will iterate 25 times
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static void descending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) { // These loops go through the array in n2 times: if the array
                                                       // have 5 numbers, it will iterate 25 times
                if (arr[j] < arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 4, 9, 1, 2, 5 };

        BubbleSort.print(arr);

        System.out.println();

        BubbleSort.ascending(arr);

        BubbleSort.print(arr);

        System.out.println();

        BubbleSort.descending(arr);

        BubbleSort.print(arr);

    }

}
