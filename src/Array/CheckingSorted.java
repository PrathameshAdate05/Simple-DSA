package Array;

public class CheckingSorted {

    public static void main(String[] args) {

        int[] arr = {1,2,3,6,5,6};

        System.out.println(checkSortedOrNot(arr));
    }

    private static String checkSortedOrNot(int[] arr) {

        String res = "sorted";

        for (int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                res = "sorted";
            }
            else {
                res = "Not sorted";
                break;
            }
        }
        return res;
    }
}
