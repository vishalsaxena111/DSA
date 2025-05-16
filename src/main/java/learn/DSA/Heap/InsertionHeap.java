package learn.DSA.Heap;

import java.util.Arrays;

public class InsertionHeap {

    // Inserts a value into the max-heap
    public static int insert(int[] arr, int n, int value) {
        n = n + 1;
        arr[n] = value;
        int i = n;

        while (i > 1) {
            int parent = i / 2;
            if (arr[parent] < arr[i]) {
                swap(arr, parent, i);
                i = parent;
            } else {
                break;
            }
        }
        return n; // return new heap size
    }

    // Swap two values in the array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        // Start with 0th index unused for easier heap index calculations
        int[] heap = new int[20];
        int size = 7;

        heap[1] = 50;
        heap[2] = 30;
        heap[3] = 40;
        heap[4] = 10;
        heap[5] = 5;
        heap[6] = 20;
        heap[7] = 30;

        size = insert(heap, size, 60); // Insert 60 into heap

        // Print the heap
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + ", ");
        }
    }
}
