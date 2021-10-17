import java.util.*;

public class PalindromeString{
	
	public void palindrome(String a){
		
		String rev="";
		char[] ori=a.toCharArray();
		for(int i=ori.length-1;i>=0;i--){
			rev+=ori[i];
		}
		
		if(rev.equals(a))
			System.out.println("Palindrome");
		else
			System.out.println("No Palindrome");
		
	}
	
	public static void main(String args[]){
		PalindromeString p = new PalindromeString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String a=sc.nextLine();
		p.palindrome(a);
	}
}