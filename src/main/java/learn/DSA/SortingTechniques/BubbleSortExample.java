package learn.DSA.SortingTechniques;

public class BubbleSortExample {

    public static void main(String[] args) {

        int[] arr= {1,2,6,5,3,4};
        for (int b : bubbleSort(arr))
            System.out.print(b+" ");
    }

    public static int[] bubbleSort(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    swap(arr, j , j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
