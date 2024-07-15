import java.util.Arrays;
// import java.*;
class Test{

    // public static int kSmallestElement(int arr[], int k, int size){
    //     if(size == k){
    //         return 1;
    //     }else{
    //         int greater = 0;
    //         if(arr[n] <= arr[k]){
    //             greater = 
    //         }
    //     }
    // }

    public static void main(String [] args){
        int arr[] = {7, 10, 4, 3 ,20, 15}; 
        int k = 3;
        // Arrays.sort(arr);
        // // k = arr.length - 1 - k; //for k largest element 
        // System.out.println("K Smallest Element is : " + arr[k-1]);

        int smallest = arr[0];
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(smallest >= arr[i]){
                smallest = arr[i];
                System.out.println(smallest);
                count += 1;
            }
            if(count == k){
                System.out.println(smallest);
            }
        }
    }
}