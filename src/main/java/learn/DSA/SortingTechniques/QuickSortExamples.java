package learn.DSA.SortingTechniques;

public class QuickSortExamples {
    public static void main(String[] args) {

        int[] arr= {5,6,3,2,4,1};
        quicksort(arr);

        for(int a: arr)
            System.out.print(a+" ");
    }

    public static void quicksort(int[] arr){

        helper(arr, 0, arr.length-1);
    }

    public static void helper(int[] arr, int start, int end){

        if(start<end){

            int pivotIdx = partition(arr, start, end);

            helper(arr, start, pivotIdx-1 );
            helper(arr, pivotIdx+1, end);



        }

    }

    private static int partition(int[] arr, int start, int end) {

        int idx=start-1;
        int pivot=arr[end];

        for(int j=start; j< end; j++){
            if(arr[j]<pivot){
                idx++;
                swap(arr, j, idx);

            }
        }

        idx++;
        swap(arr, end, idx);

        return idx;

    }

    private static void swap(int[] arr, int j, int idx) {
        int temp = arr[j];
        arr[j] = arr[idx];
        arr[idx] = temp;

    }

}
