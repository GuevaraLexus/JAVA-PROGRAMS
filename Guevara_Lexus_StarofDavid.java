import java.util.Scanner;
public class Guevara_Lexus_StarofDavid{
	public static void main(String args[]){
		int num, num1, i, I, j, k;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number (must be Odd and 7 is the lowest number): ");
		num = input.nextInt();
		
		if(num%2==0){
			System.out.print("Invalid Number!");
			return;
		}
		System.out.println("STAR OF DAVID");
		for(i=1;i<num-5;i=i+2) {
			for(I=num-i;I>1;I=I-2) {
				System.out.print("_ ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* "); 
			}
			for(I=num-i;I>1;I=I-2) {
				System.out.print("_ ");
			}
			System.out.println(""); 
		}
		
			num1=num;
			i=1;
			k=i;
		for(i=num-2;i<=num;i=i+2){
			for(j=1;j<k;j++){
				System.out.print("_ ");
			}
			for(I=num1;I>=1;I--){
				System.out.print("* ");
			}
			for(j=1;j<k;j++){
				System.out.print("_ ");
			}
			System.out.println("");
			k++;
			num1=num1-2;
		}
		//2nd full line
		for(i=1;i<=num;i++){
			System.out.print("* ");
		}
		System.out.println("");
		
		num1=num;
		for(i=1;i<=num1/2;i++){
			if(i == 1)continue;
            if(i == 2)continue;
				for (I = 0; I < i ; I++){
        			System.out.print("_ ");
        		}
        		for (I = i; I < num1 / 2 ; I++){
        			System.out.print("* ");
        		}
        		for (I = i; I <= num1 / 2; I++){
        			System.out.print("* ");
        		}
        		for (I = 0; I < i ; I++){
        			System.out.print("_ ");
        		}
        			System.out.println();
    			}
		
	}
}