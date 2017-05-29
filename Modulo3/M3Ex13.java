import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class M3Ex13
{
	public static void	main(String[] args)
	{
		if(args.length==10)
			inverteString(args);	
		else
			JOptionPane.showMessageDialog(null,"Erro");

	}

	public static void inverteString(String[] args)
	{
		StringBuilder input1 = new StringBuilder();
		for(int i=0;i<args.length;i++)
		{
			input1.append(args[i]);
			input1.append(" ");
		}
		
  		input1=input1.reverse(); 
  		System.out.println(""+input1);

	}
}