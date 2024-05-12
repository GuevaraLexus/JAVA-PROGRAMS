import java.util.Scanner;
public class Odev{
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
		int num, num1, i;
		int flag=0;
		
		System.out.print("Input a number to determine if it is an Odd or Even and Prime or Composite: ");
		num = input.nextInt();
		
		if (num%2==0){
			System.out.print("Even");
			num1=num/2;
			if (num==0||num==1){
				System.out.print(" and Composite");
			}
			else{
				for(i=2;i<num1;i++){
					if(num%i==0){
				System.out.print(" and Composite");
				flag=1;
				break;
					}
				}
				if (flag==0){
				System.out.print(" and Prime");
			}
			}
			
		}
		else{
			System.out.print("Odd");
			num1=num/2;
			if (num==0||num==1){
				System.out.print(" and Composite");
			}
			else{
				for(i=2;i<num1;i++){
					if(num%i==0){
				System.out.print(" and Composite");
				flag=1;
				break;
					}
				}
				if (flag==0){
				System.out.print(" and Prime");
			}
			}
			
		}
		
	}
	
}