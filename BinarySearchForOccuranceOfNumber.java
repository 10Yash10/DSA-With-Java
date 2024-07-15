class Test{

    public static int firstOcc(int arr[], int l, int h, int x){
        if(h>=l){
            int mid = (l+h)/2;
            if((mid==0 || x>arr[mid-1]) && arr[mid]==x){
                return mid;
            }else if(x>arr[mid]){
                //search in right half
                return firstOcc(arr,mid+1,h,x);
            }else{
                //search in left half
                return firstOcc(arr,l,mid-1,x);
            }
        }
        return -1;
    }

    static int lastOcc(int arr[],int n, int l, int h, int x){
        if(h>=l){
            int mid = (l+h)/2;
            if((mid==n || x<arr[mid+1]) && arr[mid]==x){
                return mid;
            }else if(x<arr[mid]){
                //search in left half
                return lastOcc(arr,n,l,mid-1,x);
            }else{
                //search in right half
                return lastOcc(arr,n,mid+1,h,x);
            }
        }
        return -1;
    }

    static int countOccurance(int [] arr, int n, int x){
        int firstIndex = firstOcc(arr,0,n,x);

        if(firstIndex == -1){
            return -1;
        }

        int lastIndex = lastOcc(arr,n,0,n,x);
        return (lastIndex - firstIndex) + 1;
    }

    public static void main(String [] args){
        int arr[] = {1,1,2,2,2,2,3};
        int n = arr.length-1;
        int x = 3;

        int res = countOccurance(arr, n, x);
        System.out.println(res);
    }
}