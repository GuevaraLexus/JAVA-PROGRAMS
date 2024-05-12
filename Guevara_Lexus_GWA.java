import java.util.Scanner;
public class Guevara_Lexus_GWA{
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception E){
			System.out.println(E);
		}
	}
	public static void eQ(float subs){
		if(subs >= 98.46 && subs <= 100){  
			System.out.println("Equivalent: 1.00 A+ Excellent+");
			System.out.println("");
		}
		else if(subs >= 95.44 && subs <= 98.45){  
			System.out.println("Equivalent: 1.25 A Excellent-");
			System.out.println("");
		}
		else if(subs >= 92.44 && subs <= 95.45){  
			System.out.println("Equivalent: 1.50 A- Very Good+");
			System.out.println("");
		}
		else if(subs >= 89.44 && subs <= 92.45){  
			System.out.println("Equivalent: 1.75 B+ Very Good-");
			System.out.println("");
		}
		else if(subs >= 86.44 && subs <= 89.45){  
			System.out.println("Equivalent: 2.00 B Good+");
			System.out.println("");
		}
		else if(subs >= 83.44 && subs <= 86.45){  
			System.out.println("Equivalent: 2.25 B- Good-");
			System.out.println("");
		}
		else if(subs >= 80.44 && subs <= 83.45){  
			System.out.println("Equivalent: 2.50 C+ Fair+");
			System.out.println("");
		}
		else if(subs >= 77.44 && subs <= 80.45){  
			System.out.println("Equivalent: 2.75 C Fair-");
			System.out.println("");
		}
		else if(subs >= 74.44 && subs <= 77.45){  
			System.out.println("Equivalent: 3.00 C- Passed");
			System.out.println("");
		}
		else if(subs >= 71.44 && subs <= 74.45){  
			System.out.println("Equivalent: 4.00 D Conditional");
			System.out.println("");
		}
		else if(subs <= 71.44){  
			System.out.println("Equivalent: 5.00 E Failed");
			System.out.println("");
		}
		else{
			System.out.println("Invalid Grade!");
			System.out.println("");
		}
	}
	public static void main(String args[]){	
		Scanner input = new Scanner(System.in);
	
	float itc, cp, dr, uts, mmw, pe, nstp;
		System.out.println("		Code 	Unit		Description");
		System.out.print(" 1   CSS 101	  3		INTRODUCTION TO COMPUTING: ");
			itc = input.nextFloat();
		System.out.print(" 2   CCS 102	  5		COMPUTER PROGRAMMING 1: ");
			cp = input.nextFloat();
		System.out.print(" 3   EMC 101	  3		DRAFTING: ");
			dr = input.nextFloat();
		System.out.print(" 4   GEC 101	  3		UNDERSTANDING THE SELF: ");
			uts = input.nextFloat();
		System.out.print(" 5   GEC 104	  3		MATHEMATICS IN THE MODERN WORLD: ");
			mmw = input.nextFloat();
		System.out.print(" 6   PE 111	  2		PHYSICAL FITNESS AND WELLNESS: ");
			pe = input.nextFloat();
		System.out.print(" 7   NSTP 111	  3		NSTP (CWTS) 1: ");
			nstp = input.nextFloat();
		
		cls();
		
	//grEq
	float itc1, cp1, dr1, uts1, mmw1, pe1, nstp1;
		
		System.out.println("INTRODUCTION TO COMPUTING: ");
			eQ(itc);
		System.out.println("COMPUTER PROGRAMMING 1: ");
			eQ(cp);
		System.out.println("DRAFTING: ");
			eQ(dr);
		System.out.println("UNDERSTANDING THE SELF: ");
			eQ(uts);
		System.out.println("MATHEMATICS IN THE MODERN WORLD: ");
			eQ(mmw);
		System.out.println("PHYSICAL FITNESS AND WELLNESS: ");
			eQ(pe);
		System.out.println("NSTP (CWTS) 1: ");
			eQ(nstp);
		
		itc1=itc*3;
		cp1=cp*5;
		dr1=dr*3;
		uts1=uts*3;
		mmw1=mmw*3;
		pe1=pe*2;
		nstp1=nstp*3;
		float tGrEq;
		float GWA;
		
		tGrEq=itc1+cp1+dr1+uts1+mmw1+pe1;
		GWA=tGrEq/19;
		System.out.println("GWA: " + String.format("%.2f", GWA));
		eQ(GWA);
	}
}