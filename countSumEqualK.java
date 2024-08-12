import java.util.Arrays;

class Main{
    static int getPairsCount(int[] arr, int sum) {
        // code here
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i != arr.length-1){
            if(i<j){
                if((arr[i] + arr[j] == sum)){
                    count++;
                }
                j--;
            }else{
                i++;
                j = arr.length-1;
            }
        }
        return count;
    }

    static int lowerBound(int arr[], int start, int end, int key){
        while (start<end){
            int mid = start + (end - start)/2;
            System.out.println("mid: " + mid);
            if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int upperBound(int [] arr, int start, int end, int key){
        while (start<end){
            int mid = start + (end - start)/2;
            System.out.println("mid: " + mid);
            if(arr[mid] <= key){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int getPairCount(int [] arr, int k){
        int c = 0;
        Arrays.sort(arr);
        int n = arr.length - 1;
        for(int i=0; i<n; i++){
            int x = k - arr[i];
            System.out.println("x" + " " + x);
            int y = lowerBound(arr, i+1, n, x);
            System.out.println("lower bound:"+y);
            int z = upperBound(arr, i+1, n, y);
            System.out.println("upper bound" + z);
            c = c + z-y;
            System.out.println("c: " + c);
        }
        return c;
    }
    
    public static void main(String [] args){
        // int arr[] = {1, 1, 1, 1};
        // int k = 2;
        int arr[] = {1, 5, 7, 1};
        int k = 6;
        // int res = getPairsCount(arr,k);
        // System.out.println(res);
        System.out.println(getPairCount(arr, k));
    }
}