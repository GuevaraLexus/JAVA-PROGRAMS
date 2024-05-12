import java.util.Scanner;
public class Activity3{
	public static void main(String args[]){
	
	int Fnum, Snum, Ans;
	int Op = 0;
	
	Scanner input= new Scanner(System.in);
	System.out.print("\nEnter First Number: ");
	Fnum = input.nextInt();
	System.out.print("Enter Second Number: ");
	Snum = input.nextInt();
	
	System.out.println("\nPlease choose a number for the corresponding operator:");
	System.out.println("[1] Addition");
	System.out.println("[2] Subtraction");
	System.out.println("[3] Multiplication");
	System.out.println("[4] Division");
	System.out.println("[5] Modulus Division");
	System.out.print("\nSelect Operator: ");
	Op = input.nextInt();
	
	if(Op == 1){
		Ans = Fnum + Snum;
		System.out.println(Fnum + " " + "+" + " " + Snum + " = " + Ans);
	}
	else if(Op == 2){
		Ans = Fnum - Snum;
		System.out.println(Fnum + " " + "-" + " " + Snum + " = " + Ans);
	}
	else if(Op == 3){
		Ans = Fnum * Snum;
		System.out.println(Fnum + " " + "x" + " " + Snum + " = " + Ans);
	}
	else if(Op == 4){
		Ans = Fnum / Snum;
		System.out.println(Fnum + " " + "/" + " " + Snum + " = " + Ans);
	}
	else if(Op == 5){
		Ans = Fnum % Snum;
		System.out.println(Fnum + " " + "%" + " " + Snum + " = " + Ans);
	}
	else{
	System.out.println("Invalid Operator!");
		return;
	}
	
	}
}