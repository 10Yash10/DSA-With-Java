class GCDOfArray{

    static int gcdOfTwoNumber(int a, int b){
        while(a>0 && b>0){
            if(a>b){    
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a == 0){
            return b;
        }
        return a;
    }

    static int gcd(int [] arr){
        int gcd_val = 0;
        for(int i = 0; i<arr.length; i++){
            gcd_val = gcdOfTwoNumber(gcd_val,arr[i]);
        }

        return gcd_val;
    }

    public static void main(String [] args){
        int [] arr = { 2,3,6 };
        System.out.println(0%2);
        System.out.println(gcd(arr));
    }
}