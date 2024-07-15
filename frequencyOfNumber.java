import java.util.Arrays;

class Test{
    public static void main(String [] args){
        Integer[] arr = {1, 1, 2, 2, 2, 2, 3};
        Integer N = 7, X = 5;

        Integer greatest = arr[N - 1];
        Integer [] freq = new Integer[greatest + 1];
        Arrays.fill(freq, 0);
        for(Integer i : arr){
            freq[i]++;
        }   
        for(Integer i : arr){
            if(X != i){
                System.out.println("0");
                return ;
            }
        }
        System.out.println("Max frequency: " + freq[X]);
    }
}