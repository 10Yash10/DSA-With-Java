import java.util.Arrays;

public class arrangeFromNegativeToPositive {
    
    // public static void move(int[] arr)
    // {
    // }
    public static void main(String[] args)
    {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        Arrays.sort(arr);
        // move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}

class arrangeFromNegativeToPositive2{

    public static void rearrange(int arr[]){
        int j = 0, temp;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                if(i != j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String [] args){
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        rearrange(arr);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}

class arrangeFromNegativeToPositive3{

    public static void reArrange(int arr[], int left, int right){
        int temp;
        while(left<right){
            if(arr[left] < 0 && arr[right] < 0){
                // System.out.println("left is increased");
                left++;
            }
            else if(arr[left] > 0 && arr[right] < 0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                // System.out.println("left is increased");
                // System.out.println("right is decreased");
                left++;
                right--;
            }
            else if(arr[left] > 0 && arr[right] > 0){
                // System.out.println("right is decreased");
                right--;
            }
            else{
                // System.out.println("left is increased");
                // System.out.println("right is decreased");
                left++;
                right--;
            }
        }
    }
    public static void main(String [] args){
        int arr[] = {  -12, 11, -13, -5, 
            6, -7, 5, -3, 11 };
        int left = 0;
        int right = arr.length - 1;
        reArrange(arr,left,right);
        for(int e: arr){
            System.out.print(e + " ");
        }
    }
}


class arrangeFromNegativeToPositive4 {

    public static void arrange(int [] arr){
        int left = 0;
        int right = arr.length -1 ;

        while(left<=right){
            if(arr[left] <= 0){
                left++;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }

    public static void main(String [] args){
        int arr[] = {  -12, 11, -13, -5, 
            6, -7, 5, -3, 11 };    
        
        arrange(arr);
        for(int e: arr){
            System.out.print(e+" ");
        }
        }
}

