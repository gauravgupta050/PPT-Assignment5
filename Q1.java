package Assignment5;

public class Q1 {
    public static int[][] conversion(int[] arr,int m , int n ){
        int n1 = arr.length;
        if(n1 != m*n){
            return new int[0][0];
        }
        int[][] nums = new int[m][n];
        for(int i=0;i<n1;i++){
            int nr = i/2;
            int nc = i%2;
            nums[nr][nc] = arr[i];
        }
        return nums;
    }

    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int m=2;
        int n=2;
        int[][] result = conversion(arr,m,n);
        
        printArray(result);
    }


}
