import java.net.*;
import java.util.*;
import java.io.*;

public class Client 
{
	public static void main(String args[])
	{
		try{
			while(true)
			{
				Socket s=new Socket("127.0.0.1",1220);
				DataInputStream ip=new DataInputStream(s.getInputStream());
				DataOutputStream op=new DataOutputStream(s.getOutputStream());
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Type :");
				String clientmsg=sc.nextLine();
				
				op.writeUTF(clientmsg);
				
				String msg=(String)ip.readUTF();
				System.out.println("Server :"+msg);
				
				s.close();
				
				
			}
			
		}
		catch(Exception e)
		{}
		
	}
}