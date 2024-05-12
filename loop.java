import java.util.Scanner;
public class loop{
	public static void main(String args[]){
		int fnum, snum, i=0, product=0, quotient=0, remainder=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input first num: ");
		fnum = input.nextInt();
		System.out.print("Input second num: ");
		snum = input.nextInt();
		
		int a=fnum;
		int b=snum;
		int x=a;
		int y=b;
		//Product
		for(i=1;i<b;i++){
			x=x+a;
		}
		product=x;
		//Quotient
		while(a>=b){
			a=a-b;
			quotient++;
		}
		//Remainder
		while(a>=b){
			a=a-b;
		}
		remainder=a;
		System.out.println("Product = " + product);
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}