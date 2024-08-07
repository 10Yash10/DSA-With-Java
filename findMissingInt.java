public class findMissingInt {

    // static void find(int [] arr, int n){
    //     int count = 1;
            //using a for loop and comparing it with a count value if the count and number didnt match return the count
    //     for(int i = 0; i < n ; i++){
    //         if(count != arr[i]){
    //             System.out.print("Missing Value: " + count);
    //             break;
    //         }
    //         count++;
    //     }
    // }

    // static int find(int [] arr, int n){
    //     int [] hash = new int[n+1];
            //calculating the freq of all the values present in an array if number is 1 than in the frequency array the value at index 1 will be increased, if the value is 7 then in the frequncy array the count at index 7 will be increased. and so on
    //     for(int i=0; i<n-1; i++){
    //         hash[arr[i]]++;
    //     }

    //     for(int i=1; i<n; i++){
    //         if(hash[i] == 0){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    static int find(int [] arr, int n){
        //finding the sum of elements of array
        int sum = 0;
        for(int i=0; i<n-1; i++){
            sum += arr[i]; 
        }
        // System.out.println(sum);

        //find the sum of first n natural numbers
        int expectedSum = (n*(n+1))/2;
        // System.out.println(expectedSum);

        return expectedSum - sum;
    }

    public static void main(String [] args){
        int arr[] = { 1,2,3,4,6,7 };
        int n = arr.length+1;
        // System.out.println(n);
        System.out.println( find(arr, n));
        
    }
}
