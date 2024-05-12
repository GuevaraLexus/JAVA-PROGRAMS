import java.util.Random;
import java.util.Scanner;
public class Act6{
	
	public static void main(String args[]){
		String playAgain = "";
		Scanner scan = new Scanner(System.in);
		
		do{
			cls();
			guess();
			System.out.println("Do you want to play again?");
			System.out.println("Type 'Y' if YES or 'N' if NO.: ");
			playAgain=scan.nextLine();
		}
		while(playAgain.equalsIgnoreCase("Y"));
		System.out.println("Thanks for Playing");
	}
	
	public static void cls(){
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
	
	public static void guess(){
		Random num = new Random();
		Scanner input = new Scanner(System.in);
		int n=num.nextInt(1000), x=0;

		System.out.println("\t\t\t\t\t\t\t\t\tWelcome to GUESS THE NUMBER GAME!");
		System.out.println("\nInstructions:");
		System.out.println("-The player should guess a number from 1-1000.");
		System.out.println("-The player must guess it right to win.");
		System.out.println("\nGoodluck and have fun :) ");
		
		while(n!=x){	
			System.out.print("\nGuess a number : ");
			x = input.nextInt();
				if (x>1000){
				System.out.println("Error input!");
				}
				else if (n>x){
					System.out.println("Keep up! the number must be higher");
				}
				else if(n<x){
				System.out.println("Keep up! the number must be lower");
				}
		}
		System.out.println("Congrats! You guess it right!");
	}	
}