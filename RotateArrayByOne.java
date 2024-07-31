public class RotateArrayByOne {

    // public static void rotate(int [] arr){
    //     //Time Complexity - O(N) | Auxilary Space - O(1)
    //     int last_el = arr[arr.length - 1];
    //     for(int i = arr.length-1; i > 0; i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0] = last_el;
    // }

    public static void rotate(int [] arr){
        int low = 0;
        int high = arr.length-1;
        // int last_el = arr[high];

        while(low!=high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
        }
    }

   public static void  main(String [] args){
    int arr [] = new int[]{1,2,3,4,5};
    rotate(arr);
    rotate(arr);

    for(int i: arr){
        System.out.print(i + " ");
    }
   } 
}
