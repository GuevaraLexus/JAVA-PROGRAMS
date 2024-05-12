import java.util.Scanner;
import java.util.Random;
public class random
{
	public static void cls()
	{
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
	public static void Ingame(int num)
	{	
		System.out.println("\n");
		Scanner g = new Scanner(System.in);
		int ans = 0;
		while(ans > num || ans < num)
		{
			
			System.out.print("Guess: ");
			ans = g.nextInt();
			if(ans < num)
			{
				System.out.println("Machine: Higher");
			}
			else if(ans>num)
			{
				System.out.println("Machine: Lower");
			}
			else if(ans == num)
			{
				System.out.println("\n\n");
				System.out.println("\t\t\t\t\t\t\t============================================================");
				System.out.println("\t\t\t\t\t\t\t================ CONGRATULATIONS! YOU WIN!! ================");
				System.out.println("\t\t\t\t\t\t\t============================================================");
			}
		}
	
	}
	public static void NumberGenerator()
	{
		int num = 100;
		Random numg = new Random();	
		int numfinal = numg.nextInt(num);
		Ingame(numfinal);
	}
	public static void main(String []args)
	{
		cls();
		System.out.println("\n\n");
		System.out.println("\t\t\t\t\t\t\t============================================================");
		System.out.println("\t\t\t\t\t\t\t===================== GUESS THE NUMBER =====================");
		System.out.println("\t\t\t\t\t\t\t============================================================");
		System.out.println();
		System.out.println("\nINSTRUCTION:"); 
		System.out.println("-The Machine will generate random number from 1-100.");
		System.out.println("-You will input a number based on your guessed.");
		System.out.println("-The machine will tell either your number is to low or to high.");
		System.out.println("-The game will run until you get the correct answer.");	
		NumberGenerator();
		
	}
}