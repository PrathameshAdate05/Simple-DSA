import java.util.*;

public class sort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int temp;
		
		System.out.println("Enter the array elements :");
		for(int i=0;i<5;i++){
			a[i] = sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		//Arrays.sort(a);
		
		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
	}
}