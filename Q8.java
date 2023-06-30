package Assignment5;
import java.util.*;

public class Q8 {
    public static int[] findOriginal(int[] arr){
        int n = arr.length;
        if(n%2 != 0){
            return new int[0];
        }
        int[] nums = new int[n/2];
        int[] count = new int[100001];
        for(int i=0;i<arr.length;i++){
            count[i]++;
        }
        int idx = 0;
        for(int i = 0;i < 100001; i++){
            while(count[i] >0 && i*2 < 100001 && count[i*2] > 0){
                count[i]--;
                count[i*2]--;
                nums[idx] = i;
                idx++;
            }
        }

        for(int i=0;i<100001;i++){
            if( count[i] != 0){
                return new int[0];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,8};
        
        System.out.println("The original array is "+ Arrays.toString(findOriginal(arr)));
    }
    
}
