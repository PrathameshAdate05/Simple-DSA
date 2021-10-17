import java.util.*;

public class SpaceBetString{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:");
		String a=sc.nextLine();
		
		char[] b=a.toCharArray();
		
		int count=0;
		//char c='';
		
		for(int i=0;i<b.length-1;i++){
			if(Character.isSpaceChar(b[i])){
				count++;
			}
			
		}
		System.out.println(count);
	}
	
}
	