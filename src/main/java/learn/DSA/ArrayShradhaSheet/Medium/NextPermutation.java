package learn.DSA.ArrayShradhaSheet.Medium;

public class NextPermutation {

    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3};
        nextPermutation(arr);

        for (int a : arr)
            System.out.print(a+",");
    }


    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        // find pivot
        for(int i=n-2; i>=0; i--){
            if( arr[i] < arr[i+1]){
                pivot = i;
                break;
            }

        }

        // if last permuation ust reverse the arr and return
        if(pivot == -1){
            int i=0, j=n-1;

            while(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =  temp;
                i++;
                j--;
            }
            return;
        }

        // next large element

        for(int i=n-1; i> pivot; i--){
            if(arr[i]> arr[pivot]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot]= temp;
                break;
            }

        }

        // 3 reverse sub arr pivot+1 to n-1

        int i=pivot+1, j=n-1;

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =  temp;
            i++;
            j--;
        }

    }
}
