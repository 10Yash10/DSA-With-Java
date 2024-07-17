import java.util.ArrayList;

public class SubArrayWithGivenSum {
    // public static void main(String [] args){
    //     // int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
    //     // int arr[] = { 1, 4, 0, 0, 3, 10, 5 };
    //     int arr[] = { 1, 4 };
    //     int sum = 0,mySum=0;

    //     for(int i=0; i<arr.length; i++){
    //         if(sum <= 0){
    //             System.out.println("-1");
    //             return;
    //         }
    //         for(int j=i; j<arr.length; j++){
    //             mySum = arr[j] + mySum;
    //             // System.out.println("j: " + j + " mySum: " + mySum);
    //             if(mySum > sum){
    //                 mySum = 0;
    //                 break;
    //             }
    //             else if(mySum == sum){
    //                 System.out.println("indexes: " + (i+1) + ", " + (j+1));
    //             }
    //         }
    //     }
    // }

    // using sliding window
    public static ArrayList<Integer> subArraySum(int arr[], int n, long sum){
        ArrayList<Integer> res = new ArrayList<>();
        int start = 0, last = 0;
        long currSum = 0;
        boolean flag = false;
        
        for(int i =0; i<n; i++){
            currSum += arr[i];

            if(currSum >= sum){
                last = i;

                while(currSum > sum && start < last){
                    currSum -= arr[start];
                    ++start;
                }

                if(currSum == sum){
                    res.add(start+1);
                    res.add(last+1);
                    flag = true;
                    break;
                }
            }
        }
        
        if(!flag){
            res.add(-1);
        }
        return res;

    }
    public static void main(String [] args){
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length - 1;
        int sum = 23;
        ArrayList<Integer> output = subArraySum(arr,n,sum);
        for(int i : output){
            System.out.print(i + " ");
        }
    }
}
