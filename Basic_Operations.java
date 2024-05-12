import java.util.Scanner;
public class Basic_Operations{
	public static void main(String args[]){
	
	int Fnum, Snum, Op;
	String DisOp="";
	
	Scanner input= new Scanner(System.in);
	System.out.print("Enter First Number: ");
	Fnum = input.nextInt();
	System.out.print("Enter Second Number: ");
	Snum = input.nextInt();
	
	System.out.println("Operation");
	System.out.println("[1] Addition");
	System.out.println("[2] Subtraction");
	System.out.println("[3] Multiplication");
	System.out.println("[4] Division");
	System.out.println("[5] Modulus Division");
	System.out.print("Select Operation: ");
	Op = input.nextInt();
	// calling method
	//by calling variable
	String Result=Compute(Fnum, Snum, Op);
	System.out.println(Result);
	//direct calling
	System.out.println(Compute(Fnum, Snum, Op));
	
	}
	
	public static String Compute(int Fnum, int Snum, int Op){
		String Disp="", DisOp=""; int Ans=0;
		switch(Op){
		case 1: Ans = Fnum + Snum; DisOp="+"; break;
		case 2: Ans = Fnum - Snum; DisOp="-"; break;
		case 3: Ans = Fnum * Snum; DisOp="x"; break;
		case 4: Ans = Fnum / Snum; DisOp="/"; break;
		case 5: Ans = Fnum % Snum; DisOp="%"; break;
		default: 
		return "Invalid Operation";
		}
	Disp=Fnum + " " + DisOp + " " + Snum + " = " + Ans;
	
		return Disp;
	}
}