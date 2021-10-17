import java.awt.*;
import javax.swing.*;

public class demo
{
	public static void main(String args[])
	{
		JFrame f=new JFrame("Demo");
		JButton btn =new JButton("Click Me");
		btn.setBounds(50,50,80,20);
		f.add(btn);
		
		f.setBounds(100,100,400,550);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}