import java.util.*;

public class String_sort{
	
	public String sort_String(String a){
		int i,j;
		char temp;
		char b[]=a.toCharArray();
		
		for(i=0;i<b.length;i++){
			for(j=0;j<b.length-1;j++){
				if(b[j]>b[j+1]){
					temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
			
		}
		
		a=String.valueOf(b);
		return a;
		
	}
	public static void main(String args[])throws ArrayIndexOutOfBoundsException{
		
		String_sort s = new String_sort();
		
		Scanner sc = new Scanner(System.in);
		
		String a = null;
		
		System.out.println("Entee the string :");
		a = sc.nextLine();
		System.out.println(s.sort_String(a));
		
		
	}
}