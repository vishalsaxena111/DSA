package learn.DSA.SortingTechniques;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr= {1,2,6,5,3,4};
        for (int b : insertionSort(arr))
            System.out.print(b+" ");
    }

    public static int[] insertionSort(int[] arr){

        int n=arr.length;

        for (int i=1; i<n; i++ ){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=curr;

        }

        return arr;
    }
}
