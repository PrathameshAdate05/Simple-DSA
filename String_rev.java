import java.util.*;

public class String_rev{
	public static void main(String args[])throws ArrayIndexOutOfBoundsException{
		
		Scanner sc = new Scanner(System.in);
		
		String a;
		String rev="";
		char original[];
		System.out.println("Enter the String:");
		a = sc.nextLine();
		int j=0;
		original = a.toCharArray();
		for(int i=original.length-1;i>=0;i--){
			rev+=original[i];
			
		}
		
		System.out.println(rev);
		
		System.out.println(StringFormatter.reverseString(a));
		
	}
}