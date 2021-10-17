import java.util.*;

public class DuplicateInString{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String :");
        String ip=sc.nextLine();
        
        char words[]=ip.toCharArray();
        int count=0;

        for(int i=0;i<words.length-1;i++){
            for(int j=0;j<words.length-1;j++){
                if(words[i]==words[j]){
                    count+=1;

                    if(count>1){
                        System.out.println(words[i]);
                    }
                }
                
            }
            count=0;
        }
        
    }
}