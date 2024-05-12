import java.util.Date;
import java.util.Scanner;

public class BeautySaloon {
		
	static Scanner s = new Scanner(System.in);
	static String getMember = "";
	
	public class Customer{
		public static String name = "";
		boolean member = false;
		String memberType = "";
		
		public void getName(String name) {
			System.out.print("What is your name? : ");
			name = s.nextLine();
			System.out.println("Hello " + name + "! Welcome to Beauty Saloon");
		}
		
		public  boolean isMember(boolean member, String membership) {
			System.out.print("Are you a member? Type [Y] if yes or [N] if no : ");
			membership = s.nextLine();
			switch(membership) {
			case "Y":
				member = true;
				setMember();
				Visit.getOrder(null);
			break;
			case "N":
				member = false;
				Visit.getOrd(null);
			break;
			default:
				System.out.println("wrong input");
			}
			return member;
		}
		
		public void setMember() {
			System.out.print("What type of membership do you have? Type [Premium], [Gold], [Silver] : ");
			getMember = s.nextLine();
			BeautySaloon.Discount.get_productRate(getMember);
			BeautySaloon.Discount.get_serviceRate(getMember);
			System.out.println("Product Discount : " + BeautySaloon.Discount.get_productRate(getMember));
			System.out.println("Service Discount : " + BeautySaloon.Discount.get_serviceRate(getMember));
			
		}
		
	}
	public class Visit{
		double serviceExpense = 0;
		double productExpense = 0;
		static Date d = new Date();
		int order = 0;
		static double finalCost = 0;
		
		public static void getOrder(String order) {
			System.out.println("Hello " + Customer.name + "! Please type the number that you want");
			System.out.println("[1] PRODUCTS");
			System.out.println("[2] SERVICE");
			System.out.println("[3] BOTH");
			order = s.nextLine();
				switch(order) {
				case "1":
					getProducts();
					customerOut();
				break;
				case "2":
					getService();
					customerOut();
				break;
				case "3":
					getProducts();
					getService();
					customerOut();
				break;
				default:
					System.out.println("wrong input");
				}
		}
		
		public static void getProducts() {
			String buyProd = "";
			int qty = 0;
			int ans = 0;
			double cost = 0;
			
			
			System.out.println("PRODUCTS");
			do {
				System.out.println("Type the number of your chosen products");
				System.out.println("[1] makeups\n[2] skincare products\n[3] perfume");
				buyProd = s.next();
				System.out.println("How many?");
				qty = s.nextInt();
				System.out.println("Is there anything that you want to buy? Type 1 if Yes or 2 if No");
				ans = s.nextInt();
				switch(buyProd) {
				case "1":
					double makeup = 12.00;
					cost = (makeup * qty) - ((makeup * qty) * BeautySaloon.Discount.get_productRate(getMember));
				break;
				case "2":
					double skincare = 5.00;
					cost = (skincare * qty) - ((skincare * qty) * BeautySaloon.Discount.get_productRate(getMember));
				break;
				case "3":
					double perfume = 10.00;
					cost = (perfume * qty) - ((perfume * qty) * BeautySaloon.Discount.get_productRate(getMember));
				break;
				}
				finalCost += cost;
			}while(ans == 1);
		}
		
		public static void getService() {
			String getSvc = "";
			int ans = 0;
			double cost = 0;
			
			System.out.println("SERVICE	");
			do {
				System.out.println("Type the number of your chosen service");
				System.out.println("[1] massage\n[2] haircut\n[3] makeup");
				getSvc = s.next();
				System.out.println("Is there anything that you want to be done? Type 1 if Yes or 2 if No");
				ans = s.nextInt();
				switch(getSvc) {
				case "1":
					double massage = 12.00;
					cost = massage - (massage * BeautySaloon.Discount.get_serviceRate(getMember));
				break;
				case "2":
					double haircut = 5.00;
					cost = haircut - (haircut * BeautySaloon.Discount.get_serviceRate(getMember)) ;
				break;
				case "3":
					double makeup = 10.00;
					cost = makeup - (makeup * BeautySaloon.Discount.get_serviceRate(getMember)) ;
				break;
				}
				finalCost += cost;
			}while(ans == 1);
		}
		
		public static void customerOut() {
			System.out.println("\n\n\nThank you for visiting!");
			System.out.println("Date of Visit : " + d.toString());
			System.out.println("Total Cost : $" + finalCost);
		}
		
		//THIS IS FOR THE CUSTOMER W/O MEMBERSHIP
		public static void getOrd(String order) {
			System.out.println("Hello " + Customer.name + "! Please type the number that you want");
			System.out.println("[1] PRODUCTS");
			System.out.println("[2] SERVICE");
			System.out.println("[3] BOTH");
			order = s.nextLine();
				switch(order) {
				case "1":
					getProd();
					customerOut();
				break;
				case "2":
					getSer();
					customerOut();
				break;
				case "3":
					getProd();
					getSer();
					customerOut();
				break;
				default:
					System.out.println("wrong input");
				}
		}
		
		public static void getProd() {
			String buyProd = "";
			int qty = 0;
			int ans = 0;
			double cost = 0;
			
			
			System.out.println("PRODUCTS");
			do {
				System.out.println("Type the number of your chosen products");
				System.out.println("[1] makeups\n[2] skincare products\n[3] perfume");
				buyProd = s.next();
				System.out.println("How many?");
				qty = s.nextInt();
				System.out.println("Is there anything that you want to buy? Type 1 if Yes or 2 if No");
				ans = s.nextInt();
				switch(buyProd) {
				case "1":
					double makeup = 12.00;
					cost = (makeup * qty);
				break;
				case "2":
					double skincare = 5.00;
					cost = (skincare * qty);
				break;
				case "3":
					double perfume = 10.00;
					cost = (perfume * qty);
				break;
				}
				finalCost += cost;
			}while(ans == 1);
		}
		
		public static void getSer() {
			String getSvc = "";
			int ans = 0;
			double cost = 0;
			
			System.out.println("SERVICE	");
			do {
				System.out.println("Type the number of your chosen service");
				System.out.println("[1] massage\n[2] haircut\n[3] makeup");
				getSvc = s.next();
				System.out.println("Is there anything that you want to be done? Type 1 if Yes or 2 if No");
				ans = s.nextInt();
				switch(getSvc) {
				case "1":
					double massage = 12.00;
					cost = massage;
				break;
				case "2":
					double haircut = 5.00;
					cost = haircut;
				break;
				case "3":
					double makeup = 10.00;
					cost = makeup;
				break;
				}
				finalCost += cost;
			}while(ans == 1);
		}
		
	}
		
	public class Discount{
		
		private static double svcPremium = 0.2;
        private static double svcGold = 0.15;
        private static double svcSilver = 0.1;
        private static double prdPremium = 0.1;
        private static double prdGold = 0.1;
        private static double prdSilver = 0.1;
        
        public static double get_productRate(String type){
            switch(type){
                case "Premium":
                    return prdPremium;
                case "Gold":
                    return prdGold;
                case "Silver":
                    return prdSilver;
                default:
                    throw new IllegalArgumentException("Wrong membership type!");
            }
        }
        
        public static double get_serviceRate(String type){
            switch(type){
                case "Premium":
                    return svcPremium;
                case "Gold":
                    return svcGold;
                case "Silver":
                    return svcSilver;
                default:
                    throw new IllegalArgumentException("Wrong membership type!");
            }
        }
	}
	
	
	
	public static void main(String[] args) {
        BeautySaloon bs = new BeautySaloon();
        BeautySaloon.Customer c = bs.new Customer();
        c.getName(null);
        c.isMember(false, null);
    }
}
