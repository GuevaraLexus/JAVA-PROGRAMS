package Pizza;

import java.util.Arrays;
import java.util.Scanner;

public class Pizza {

	static Scanner sc = new Scanner(System.in);
	private static String size;
	private static int cheese, pepperoni, ham, ans, x = 3, xCounter;
	
	public static void getOrder() {
		System.out.println("************PIZZA SHOP**************");
		System.out.println("What size do you want?");
		System.out.println("[1] 'small' = $10.00");
		System.out.println("[2] 'medium' = $12.00");
		System.out.println("[3] 'large' = $14.00");
		size = sc.next();
		System.out.println("Please input the quantity of your Cheese toppings : ");
		cheese = sc.nextInt();
		System.out.println("Please input the quantity of your Pepperoni toppings : ");
		pepperoni = sc.nextInt();
		System.out.println("Please input the quantity of your Ham toppings : ");
		ham = sc.nextInt();
	}
	public static void askAgain() {
		System.out.println("Do you want to add another pizza?");
		System.out.println("1 for YES");
		System.out.println("2 for NO");
		ans = sc.nextInt();
		xCounter++;
	}
	
	public Pizza(String s, int c, int p, int h) {
		size = s;
		cheese = c;
		pepperoni = p;
		ham = h;
	}
	
	void setSize(String s) {
		size = s;
	}
	
	void setCheese(int c) {
		cheese = c;
	}
	
	void setPepperoni(int p) {
		pepperoni = p;
	}
	
	void setHam(int h) {
		ham = h;
	}
	
	String getSize(){
		return size;
	    }
	
	int getCheese(){
	       return cheese;
	    }
	
	int getPepperoni(){
	       return pepperoni;
	    }
	
	int getHam(){
	       return ham;
	    }
	
	static double calcCost() {
		switch(size) {
		case "small":
			return (10 + (ham + cheese + pepperoni) * 2);
		case "medium":
			return (10 + (ham + cheese + pepperoni) * 2);
		case "large":
			return (10 + (ham + cheese + pepperoni) * 2);
		}
		return 0;
	}
	
	static String getDescription()
	   {
	       return ("A "+size+" pizza with " + cheese + " cheese, " + pepperoni + " pepperoni, and " + ham + " ham should cost a total of : $"+calcCost());
	   }
	
	public class PizzaOrder {
		
	    public double calcTotal()
	    {
	        double price=0;
	        for(int i =0;i<xCounter;i++)
	         price+=Pizza.calcCost();
	        return price;
	    }
	    
	    Pizza[] pi = new Pizza[x];
	    public int getPizza() {
	    	
	    	pi[0] = new Pizza(size, cheese, pepperoni, ham);
	    	pi[1] = new Pizza(size, cheese, pepperoni, ham);
	    	pi[2] = new Pizza(size, cheese, pepperoni, ham);
	    	
	    	/*for(int i = 0; i < pi.length; i++) {
	    		System.out.println(pi[i]);
	    	}*/
	    	
	    	return 1;
	    }
	    
	}
	public static void main(String[] args) {
		do{
			getOrder();
			askAgain();
			System.out.println(getDescription());
		}while(ans == 1);
		Pizza pizza = new Pizza(size, cheese, pepperoni, ham);
		Pizza.PizzaOrder po = pizza.new PizzaOrder();
		System.out.println("Total Cost : $" + po.calcTotal());
	}
}

