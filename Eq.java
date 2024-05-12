import java.util.Scanner;
public class Eq{
	public static void main(String args[]){
	
	int Grade;
	
	Scanner input= new Scanner(System.in);
	System.out.print("Enter your grade: ");
	Grade = input.nextInt();
	
	if(Grade >= 99 && Grade <= 100){  
		System.out.print("Equivalent: 1.00 A+ Excellent+");
	}
	else if(Grade >= 96 && Grade <= 98){  
		System.out.print("Equivalent: 1.25 A Excellent-");
	}
	else if(Grade >= 93 && Grade <= 95){  
		System.out.print("Equivalent: 1.50 A- Very Good+");
	}
	else if(Grade >= 90 && Grade <= 92){  
		System.out.print("Equivalent: 1.75 B+ Very Good-");
	}
	else if(Grade >= 87 && Grade <= 89){  
		System.out.print("Equivalent: 2.00 B Good+");
	}
	else if(Grade >= 84 && Grade <= 86){  
		System.out.print("Equivalent: 2.25 B- Good-");
	}
	else if(Grade >= 81 && Grade <= 83){  
		System.out.print("Equivalent: 2.50 C+ Fair+");
	}
	else if(Grade >= 78 && Grade <= 80){  
		System.out.print("Equivalent: 2.75 C Fair-");
	}
	else if(Grade >= 75 && Grade <= 77){  
		System.out.print("Equivalent: 3.00 C- Passed");
	}
	else if(Grade >= 72 && Grade <= 74){  
		System.out.print("Equivalent: 4.00 D Conditional");
	}
	else if(Grade <= 71){  
		System.out.print("Equivalent: 5.00 E Failed");
	}
	else{
		System.out.print("Error!");
	}
	}
}