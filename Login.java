import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;



 public class Login extends JFrame implements ActionListener
{
	public Login()
	{
		JFrame f=new JFrame();
		f.setBounds(100,100,400,300);
		f.setBounds(100,100,500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel user=new JLabel("Username");
		user.setBounds(50,30,100,50);
		f.add(user);
		
		JLabel pass=new JLabel("Password");
		pass.setBounds(50,90,100,50);
		f.add(pass);
		
		JTextField jt1=new JTextField();
		jt1.setBounds(170,50,100,20);
		f.add(jt1);
		
		JTextField jt2=new JTextField();
		jt2.setBounds(170,100,100,20);
		f.add(jt2);
		
		JButton l=new JButton("Login");
		l.setBounds(100,150,100,30);
		l.addActionListner(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		//int a=Integer.parseInt(jt1.getText());
		//int b=Integer.parseInt(jt2.getText());
		//int c=a+b;
		System.out.println();
	}
	public static void main(String args[])
	{
		new Login();
		
		
	}
}