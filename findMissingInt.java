public class findMissingInt {

    static void find(int [] arr, int n){
        int count = 1;
        for(int i = 0; i < n ; i++){
            if(count != arr[i]){
                System.out.print("Missing Value: " + count);
                break;
            }
            count++;
        }
    }

    public static void main(String [] args){
        int arr[] = { 1,2,3,4,6,7 };
        int n = arr.length;
        find(arr, n);
        
    }
}
