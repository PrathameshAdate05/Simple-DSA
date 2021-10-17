import java.util.*;

public class PalindromeNo{
	
	public void palindrome(){
		int i;
		for(i=100;i<=1000;i++){
		
		int sum=0,rem,n;
		n=i;
		
		while(n!=0){
			rem=n%10;
			sum=sum*10+rem;
			n/=10;
		}
		if(sum==i)
			System.out.println(sum);
		
		}
	}
	
	public static void main(String args[]){
		
		PalindromeNo p = new PalindromeNo();
		p.palindrome();
		
	}
}