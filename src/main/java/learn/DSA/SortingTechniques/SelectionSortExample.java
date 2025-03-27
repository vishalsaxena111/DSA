package learn.DSA.SortingTechniques;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr= {1,2,6,5,3,4};
        for (int b : selectionSort(arr))
            System.out.print(b+" ");
    }

    public static int[] selectionSort(int[] arr){

        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int smallIdx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[smallIdx]){
                    smallIdx=j;
                }
            }
            swap(arr, i ,smallIdx);
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
