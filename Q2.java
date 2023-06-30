package Assignment5;

public class Q2 {
    public static int totalRows(int n){
        int lo=0; 
        int hi =n;
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(n>=mid+(mid+1)/2){
                lo = mid+1; 
            }
            else{
                hi = mid-1;
            }


        }
        return (int) lo-1;

    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("The maximum number of rows are "+ totalRows(n));
    }
    
}
