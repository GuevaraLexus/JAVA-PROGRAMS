import java.util.Scanner;
public class Loop{
	public static void main(String args[]){
		int num, i, I;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=input.nextInt();
		
		//forLoop parameters: initialization, condition, step
		
		//Incremental Loop
		/*System.out.println("Incremental");
		for(i=1;i<=num;i++){
			for(I=1;I<=num;I++){
				System.out.print("* ");
			}
			System.out.println("");
		}*/
		//Decremental Loop
		System.out.println("Decremental");
		for(i=num;i>=1;i--){
		System.out.println(i);
		}
	}
}