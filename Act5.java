import java.util.Scanner;
public class Act5{
	public static void main(String args[]){
		int num, num1, num2, Shape, i, I, j, k;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nSHAPE DRAWING");
		System.out.println("		[ 1] Draw Line");
		System.out.println("		[ 2] Draw Stripe Line");
		System.out.println("		[ 3] Draw Square");
		System.out.println("		[ 4] Draw Parallelogram");
		System.out.println("		[ 5] Draw Triangle");
		System.out.println("		[ 6] Draw Reverse Triangle");
		System.out.println("		[ 7] Draw Isosceles Triangle");
		System.out.println("		[ 8] Draw Reverse Isoceles Triangle");
		System.out.println("		[ 9] Draw Hour Glass");
		System.out.println("		[10] Draw Diamond");
		System.out.println("		[11] Draw Zero");
		System.out.println("		[12] Draw Arrow Up");
		System.out.println("		[13] Draw Arrow Down");
		System.out.println("		[14] Draw X");
		System.out.println("		[15] Draw BowTie");
		
		System.out.print("Enter a number: ");
		num=input.nextInt();
		System.out.print("Select a number: ");
		Shape=input.nextInt();
		switch(Shape){
			case 1 -> {
                    
                            System.out.println("LINE");
                            for(i=1;i<=num;i++){
                                System.out.print("* ");
                            }
                }
			case 2 -> {
                            
                            System.out.println("STRIPE LINE");
                            num=num/2;
                            for(i=1;i<=num;i++){
                                System.out.print("*");
                                System.out.print("_");
                            }
                            System.out.print("*");
                }
			case 3 -> {
                 
                            System.out.println("SQUARE");
                            for(i=1;i<=num;i++){
                                for(I=1;I<=num;I++){
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                }
			case 4 -> {
                            
                            System.out.println("PARALLELOGRAM");
                            num1=num;
                            for(i=1;i<=num;i++){
                                for(I=1;I<=num1;I++){
                                    System.out.print("_ ");
                                }
                                for(I=1;I<=num;I++){
                                    System.out.print("* ");
                                }
                                for(j=1;j<i;j++){
                                    System.out.print("_ ");
                                }
                                System.out.println("");
                                num1--;
                            }
                }
			case 5 -> {
                            
                            System.out.println("TRIANGLE");
                            num1=num;
                            for(i=1;i<=num;i++){
                                for(I=1;I<=num1;I++){
                                    System.out.print("* ");
                                }
                                for(I=1;I<i;++I){
                                    System.out.print("_ ");
                                }
                                System.out.println("");
                                num1--;
                            }
                }
			case 6 -> {
                            
                            System.out.println(" REVERSE TRIANGLE");
                            num1=num;
                            for(i=1;i<=num;i++){
                                num1--;
                                for(I=1;I<=i;++I){
                                    System.out.print("* ");
                                }
                                for(I=1;I<=num1;I++){
                                    System.out.print("_ ");
                                }
                                System.out.println("");
                            }
                }
			case 7 -> {
                            
                            System.out.println("ISOSCELES TRIANGLE");
                            for(i=1;i<=num;i=i+2) {
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
                }
			case 8 -> {
                            
                            System.out.println("REVERSE ISOSCELES TRIANGLE");
                            num1=num;
                            i=1;
                            k=i;
                            for(i=1;i<=num;i=i+2){
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
                }
			case 9 -> {
                            
                            System.out.println("HOUR GLASS");
                            num1=num;
                            i=1;
                            k=i;
                            for(i=1;i<num;i=i+2){
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
                            for(i=1;i<=num;i=i+2){
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
                }
			case 10 -> {
                            
                            System.out.println("DIAMOND");
                            for(i=1;i<num;i=i+2) {
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
                            for(i=1;i<=num;i=i+2){
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
                }
			case 11 -> {
                            
                            System.out.println("ZERO");
                            
                            for(i=1;i<=num;i++){
                                for(I=1;I<=num;I++){
                                    if(i==1||I==1||i==num||I==num){
                                        System.out.print("* ");
                                    }
                                    else{
                                        System.out.print("_ ");
                                    }
                                }
                                System.out.println("");
                            }
                }
			case 12 -> {
                            
                            System.out.println("ARROW UP");
                            for(i=1;i<=num;i=i+2){
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
                            num1=num1/2;
                            for(i=1;i<=num1;i++){
                                for(I=1;I<=num;I++){
                                    if(I<=2||i==num||I>=num-1){
                                        System.out.print("_ ");
                                    }
                                    else{
                                        System.out.print("* ");
                                    }
                                }
                                System.out.println("");
                            }
                }
			case 13 -> {
                            
                            System.out.println("ARROW DOWN");
                            num1=num;
                            num1=num1/2;
                            for(i=1;i<=num1;i++){
                                for(I=1;I<=num;I++){
                                    if(I<=2||i==num||I>=num-1){
                                        System.out.print("_ ");
                                    }
                                    else{
                                        System.out.print("* ");
                                    }
                                }
                                System.out.println("");
                            }
                            num2=num;
                            i=1;
                            k=i;
                            for(i=1;i<=num;i=i+2){
                                for(j=1;j<k;j++){
                                    System.out.print("_ ");
                                }
                                for(I=num2;I>=1;I--){
                                    System.out.print("* ");
                                }
                                for(j=1;j<k;j++){
                                    System.out.print("_ ");
                                }
                                System.out.println("");
                                k++;
                                
                                num2=num2-2;
                            }
                }
			case 14 -> {
                            
                            System.out.println("X");
                            num1=num;
                            for (i=1;i<=num;i++){
                                for (I=1;I<=num1;I++){
                                    if((i==I)||(I==num1-i+1)){
                                        System.out.print("* ");
                                    }
                                    else{
                                        System.out.print("_ ");
                                    }
                                }
                                System.out.println();
                            }
                }
			case 15 -> {
                            
                            System.out.println("BOW TIE");
                            num=num/2;
                            for (i = -num; i <= num; i++) {
                                for (j = -num; j <= num; j++) {
                                    if (i*i <= j*j)
                                        System.out.print("* ");
                                    else
                                        System.out.print("_ ");
                                }
                                System.out.println();
                            }
                }
			default -> {
                                return;
                }
		}
	}
}