package learn.DSA.SortingTechniques;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr= {5,6,3,2,4,1};
        mergeSort(arr);

        for(int a: arr)
            System.out.print(a+" ");
    }

    public static void mergeSort(int[] arr){

        helper(arr, 0, arr.length-1);
    }

    public static void helper(int arr[], int start, int end ){

        if(start< end){

            int mid = start + (end - start)/2;

            helper(arr, start, mid);
            helper(arr, mid+1, end);

            merger(arr, start, mid, end);

        }

    }

    public static void merger(int[] arr, int start, int mid, int end){

        int i= start;
        int j= mid+1;
        int k=0;
        int[] temp = new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]= arr[i++];
            }else{
                temp[k++] = arr[j++];
            }

        }

        while(i<=mid){
            temp[k++]= arr[i++];
        }
        while(j<=end){
            temp[k++]= arr[j++];
        }

        for(int idx=0; idx<temp.length;idx++){
            arr[idx+start] = temp[idx];
        }

    }

}
