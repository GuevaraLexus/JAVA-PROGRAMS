import java.util.Scanner;
public class average
{
	public static void main(String []args)
	{
  Scanner lex = new Scanner(System.in);
 System.out.print("Input  grade in Intermediate Programming : ");
    float a = lex.nextFloat();
 System.out.print("Input  grade in Rhythmic Activities : ");
    float b = lex.nextFloat();
 System.out.print("Input  grade in Web Systems : ");
    float c = lex.nextFloat();
 System.out.print("Input  grade in College Algebra : ");
    float d = lex.nextFloat();
 System.out.print("Input  grade in Contemporary World : ");
    float e = lex.nextFloat();
		
  float average;

  average = (a + b + c + d + e) / 5;
  

  System.out.println("Your average is " + average); 
	}
}	 
		