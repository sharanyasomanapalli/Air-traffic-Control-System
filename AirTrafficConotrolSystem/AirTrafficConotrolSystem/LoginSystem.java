package main;
import java.util.*;
import color.*;
public class LoginSystem
{
	private static String username="admin";
	private static String password="1234";
	private static int attempts=3;
	
	public static boolean login(Scanner sc)
	{
		
		int at=0;
		while(at<attempts){
		System.out.print("Username : ");
		String us=sc.nextLine().trim();
		System.out.print("Password : ");
		String ps=sc.nextLine().trim();
		
		if(username.equals(us) && password.equals(ps))
		{
			System.out.println();
			System.out.println(ConsoleStyle.getBRIGHT_GREEN() + ConsoleStyle.getBOLD() +"Login Successful"+ ConsoleStyle.RESET);
			System.out.println();
			return true;
		}
		else
		{
			System.out.println(ConsoleStyle.getRED()+ConsoleStyle.getBOLD()+"Invalid username or password"+ ConsoleStyle.RESET);
			at++;
		}
		}
	return false;
	}
}
