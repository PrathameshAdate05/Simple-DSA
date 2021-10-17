import java.net.*;
import java.util.*;
import java.io.*;

public class Server 
{
	public static void main(String args[])
	{
		try{
			while(true)
			{
				ServerSocket ss=new ServerSocket(1220);
				Socket s1=ss.accept();
				
				DataInputStream ip=new DataInputStream(s1.getInputStream());
				DataOutputStream op=new DataOutputStream(s1.getOutputStream());
				
				Scanner sc=new Scanner(System.in);
				
				String msg=(String)ip.readUTF();
				System.out.println("Client :"+msg);
				System.out.println("Type :");
				String servermsg=sc.nextLine();
				op.writeUTF(servermsg);
				
				s1.close();
				ss.close();
			}
		}
		catch(Exception e)
		{}
	}
}