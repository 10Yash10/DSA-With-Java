class Test {

    // by using simple approach -- good approach O(2 * n) time complexity and O(1)
    // one is to use sort function for array and sort it -- naive approach
    // one is best approach by using Dutch National Flag alogrithm - One pass - O(N)
    // time and O(1) space

    // static void Sort012(int [] arr, int n){
    // int c0=0,c1=0,c2=0;

    // //loop to calcuate total no. of zeros
    // for(int i=0; i<=n; i++){
    // if(arr[i] == 0) c0 += 1;
    // else if(arr[i] == 1) c1 += 1;
    // else c2 += 1;
    // }

    // int indx = 0;
    // for(int i=0; i<c0; i++){
    // arr[indx++] = 0;
    // }

    // for(int i=0; i<c1; i++){
    // arr[indx++] = 1;
    // }

    // for(int i=0; i<c2; i++){
    // arr[indx++] = 2;
    // }

    // }

    static void sort012(int[] arr) {
        int n = arr.length - 1;
        int l = 0, mid = 0;
        int h = n;
        int temp = 0;

        while (mid <= h) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[l];
                    arr[l] = arr[mid];
                    arr[mid] = temp;
                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[h];
                    arr[h] = arr[mid];
                    arr[mid] = temp;
                    h--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 0, 1, 2, 0, 1, 2 };
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length - 1;

        sort012(arr);
        for (int i = 0; i <= n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}