package Assignment5;

public class Q5 {
    public static int distance(int[] arr1, int[] arr2, int d){
        int count = 0;
        
        for(int i=0;i<arr1.length;i++){
            boolean flag = false;
            int fst = arr1[i];
            for(int j=0; j<arr2.length; j++){
                int sec = arr2[j];
                if(Math.abs(sec - fst)  <= d){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                count++; 
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        System.out.println("The distance is "+ distance(arr1, arr2, d));
    }
}
