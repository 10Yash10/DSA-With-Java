import java.util.ArrayList;
import java.util.TreeSet;

class Test {

    public static ArrayList<Integer> union(int arr1 [], int arr2 []){
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i: arr1){
            // System.out.println("adding values to set for first time" + i);
            ts.add(i);
        }
        for(int i: arr2){
            // System.out.println("adding values to set for second time" + i);
            ts.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: ts){
            // System.out.println("adding values to list " + i);
            al.add(i);
        }
        return al;
    }

    public static ArrayList<Integer> intersection(int arr1[], int [] arr2){
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i: arr1){
            ts.add(i);
        }
        
        ArrayList<Integer> al= new ArrayList<>();
        for(int i: arr2){
            if(ts.contains(i)){
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String [] args){
        int arr1[] = { 1, 3, 4, 5, 7 };
        int arr2[] = { 2, 3, 5, 6 };

        ArrayList<Integer> al_union = union(arr1,arr2);
        System.out.print("Union: ");
        for(int i: al_union){
            System.out.print(i+" ");
        }
        System.out.println();
        ArrayList<Integer> al_intersection = intersection(arr1,arr2);
        System.out.println("Intersection: ");
        for(int i: al_intersection){
            System.out.print(i+ " ");
        }
    }
}
