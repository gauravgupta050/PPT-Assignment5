package Assignment5;
import java.util.*;


public class Q6 {

    public static List<Integer> duplicate(int[] arr){
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;++i){
        
            int index = Math.abs(arr[i]) - 1;
            if(arr[index] < 0){
                res.add(Math.abs(arr[i]));
            }
            arr[index] = -arr[index];
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("The output array is " + duplicate(arr));

    }
}
