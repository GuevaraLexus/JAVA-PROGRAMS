import java.util.Scanner;
public class lexus
{
	public static void main(String []args)
	{
  Scanner lex = new Scanner(System.in);
 System.out.print("Input  grade in Intermediate Programming : ");
    int a = lex.nextInt();
 System.out.println("Input  grade in Rhythmic Activities : ");
    int b = lex.nextInt();
 System.out.println("Input  grade in Web Systems : ");
    int c = lex.nextInt();
 System.out.println("Input  grade in College Algebra : ");
    int d = lex.nextInt();
 System.out.println("Input  grade in Contemporary World : ");
    int e = lex.nextInt();
		
  int a, b, c, d, e, sum, average;

  sum = a + b + c + d + e;
  average = sum / 3;

  System.out.println("Your average is" + average) 		 
		
		
	}
}