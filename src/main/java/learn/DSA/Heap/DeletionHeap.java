package learn.DSA.Heap;

public class DeletionHeap {

    public static int delete(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Heap is empty.");
            return 0;
        }

        // Step 1: Replace root with last element
        arr[1] = arr[n];
        n--; // Reduce heap size

        // Step 2: Heapify down from root
        int i = 1;

        while (i <= n) {
            int left = 2 * i;
            int right = 2 * i + 1;
            int largest = i;

            if (left <= n && arr[left] > arr[largest]) {
                largest = left;
            }

            if (right <= n && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest != i) {
                swap(arr, i, largest);
                i = largest;
            } else {
                break;
            }
        }

        return n; // Return new heap size
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] heap = new int[20];
        int size = 7;

        heap[1] = 60;
        heap[2] = 50;
        heap[3] = 40;
        heap[4] = 10;
        heap[5] = 5;
        heap[6] = 20;
        heap[7] = 30;

        size = delete(heap, size); // Delete max (root)

        // Print heap after deletion
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + ", ");
        }
    }
}
