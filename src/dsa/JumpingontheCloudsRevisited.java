package dsa;

public class JumpingontheCloudsRevisited {

    public static void main(String[] args) {
        int life=100;
        int k=2;
        int[] arr={0 ,0 ,1 ,0 ,0 ,1 ,1 ,0 };

        find(arr,life,k);
    }

    private static void find(int[] arr, int life, int k) {

        int pos=0;
        int length = arr.length/k;


        do{
            pos+=k;
            life--;
            if(arr[pos%arr.length]==1){
                life-=2;
            }

        }while (pos%arr.length !=0);
        System.out.println(life);
    }
}
