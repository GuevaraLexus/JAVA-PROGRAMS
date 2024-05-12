import java.util.Scanner;
public class Equivalent{
	public static void main (String args[]){
	float Grade;
	
	Scanner input= new Scanner(System.in);
	System.out.print("Enter your Grade: ");
	Grade = input.nextFloat();
	
	//this grading system can accept 2 decimal values
	// that's why I put .44 and .45 to round off the grades between the two equivalents like 98 and 99
	
	if(Grade >= 98.46 && Grade <= 100){  
		System.out.print("Equivalent: 1.00 A+ Excellent+");
	}
	else if(Grade >= 95.44 && Grade <= 98.45){  
		System.out.print("Equivalent: 1.25 A Excellent-");
	}
	else if(Grade >= 92.44 && Grade <= 95.45){  
		System.out.print("Equivalent: 1.50 A- Very Good+");
	}
	else if(Grade >= 89.44 && Grade <= 92.45){  
		System.out.print("Equivalent: 1.75 B+ Very Good-");
	}
	else if(Grade >= 86.44 && Grade <= 89.45){  
		System.out.print("Equivalent: 2.00 B Good+");
	}
	else if(Grade >= 83.44 && Grade <= 86.45){  
		System.out.print("Equivalent: 2.25 B- Good-");
	}
	else if(Grade >= 80.44 && Grade <= 83.45){  
		System.out.print("Equivalent: 2.50 C+ Fair+");
	}
	else if(Grade >= 77.44 && Grade <= 80.45){  
		System.out.print("Equivalent: 2.75 C Fair-");
	}
	else if(Grade >= 74.44 && Grade <= 77.45){  
		System.out.print("Equivalent: 3.00 C- Passed");
	}
	else if(Grade >= 71.44 && Grade <= 74.45){  
		System.out.print("Equivalent: 4.00 D Conditional");
	}
	else if(Grade <= 71.44){  
		System.out.print("Equivalent: 5.00 E Failed");
	}
	else{
		System.out.println("Invalid Grade!");
	}
	}
}