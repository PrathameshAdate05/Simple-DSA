import java.util.*;

public class Big_no_array{
	public static void main(String args[])throws ArrayIndexOutOfBoundsException{
		
		Scanner sc=new Scanner(System.in);
		
		int a[] = new int[5];
		int i,j,temp;
		
		System.out.println("Enter array ele :");
		for(i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++){
			for(j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] =a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Big no is :"+a[5-1]);
		System.out.println("Small no is :"+a[0]);
		
		
	}
}