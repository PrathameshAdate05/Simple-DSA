package dsa;

public class BillDivision {

    static void billDivision(int[] arr,int k,int n,int charged){
        int total = 0;
       for (int i=0;i<n;i++){
           if(i != k)
               total += arr[i];
       }
        System.out.println(total);
        System.out.println(total/2 == charged ? "Bon Appetit":charged-(total/2));

    }

    public static void main(String[] args) {
        int[] arr = {3 ,10 ,2 ,9};
        int k = 1;
        int n = 4;
        int charged = 12;
        billDivision(arr,k,n,charged);
    }
}
