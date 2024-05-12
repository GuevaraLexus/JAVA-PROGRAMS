import java.util.Scanner;

public class Act04_BeautySaloon {
	static String allowed = "";
	static Scanner s = new Scanner(System.in);
	
    public class Visit{
    	double finalProductCost = 0;
    	double finalServiceCost = 0;
    	
	        public class getProduct{
		        public String[] products = new String[]{"brush", "makeup", "perfume", "skincare", "cologne"};;
		        public double[] prices = new double[]{20.00, 50.00, 10.00, 5.00, 3.00};
		        boolean orderPlaced = false;
		        double cost;
		        //double finalCost;
		        int ans;
		        
		            public void placeOrder(String productName, int quantity){
		            	
			                for(int i = 0; i < products.length; i++){
			                    if(products[i].equals(productName)){
			                        cost = prices[i] * quantity;
			                        System.out.println("The cost of " + quantity + " " + productName + " product(s) is : $" + cost + ".");
			                        finalProductCost += cost;
			                        System.out.println("Is there anything you want to buy? Please type 1 if Yes and 2 if No.");
			                        ans = s.nextInt();
			                    	if(ans  == 1) {
			                    		getProduct gP = new getProduct();
			                    		gP.selectProduct();
			                    	}
			                    	if(ans == 2) {
			                    		orderPlaced = true;
			                            System.out.println("The cost of your purchased products is $" + (finalProductCost - (finalProductCost * Act04_BeautySaloon.Discount.get_pDcRate(allowed))));
			                    	}
			                    } 
			                }
		            }
		            
					public void selectProduct() {
						System.out.println("PRODUCTS: ");
	                    System.out.println("1. brush ");
	                    System.out.println("2. make up");
	                    System.out.println("3. perfume");
	                    System.out.println("4. skincare");
	                    System.out.println("5. cologne");
						System.out.println("Type the products then click [ENTER] then put the quantity of the product that you want to buy");
		            	String prdName = s.next();
		            	int qty = s.nextInt();
		            	getProduct gP = new getProduct();	    
		            	gP.placeOrder(prdName, qty);
					}	
				}
	        
	        public class getService{
		        public String[] service = new String[]{"manicure", "pedicure", "face massage", "body massage", "makeup"};;
		        public double[] prices = new double[]{20.00, 50.00, 10.00, 5.00, 3.00};
		        boolean orderPlaced = false;
		        double cost;
		        int ans;
		        
		            public void placeOrder(String serviceType, int level){
		            	
			                for(int i = 0; i < service.length; i++){
			                    if(service[i].equals(serviceType)){
			                        cost = prices[i] * level;
			                        System.out.println("The cost of " + serviceType + " is : $" + cost + ".");
			                        finalServiceCost += cost;
			                        System.out.println("Is there anything you want to be done? Please type 1 if Yes and 2 if No.");
			                        ans = s.nextInt();
			                    	if(ans  == 1) {
			                    		getService gS = new getService();
			                    		gS.selectService();
			                    	}
			                    	if(ans == 2) {
			                    		orderPlaced = true;
			                            System.out.println("The cost of the service is $" + (finalServiceCost - (finalServiceCost * Act04_BeautySaloon.Discount.get_sDcRate(allowed))));
			                    	}
			                    } 
			                }
		            }
		            
					public void selectService() {
						System.out.println("SERVICE: ");
	                    System.out.println("1. manicure ");
	                    System.out.println("2. pedicure");
	                    System.out.println("3. face massage");
	                    System.out.println("4. body massage");
	                    System.out.println("5. make up");
						System.out.println("Type the service type then click [ENTER] then type the level of the service you want to be done to you");
		            	String srcName = s.next();
		            	int drt = s.nextInt();
		            	getService gS = new getService();	    
		            	gS.placeOrder(srcName, drt);
					}	
				}
		        	
			        public void visitCustomer(){
			        	
			        	getProduct gP = new getProduct();
			        	getService gS = new getService();
			        	
			        	System.out.println("Good Day " + Act04_BeautySaloon.Customer.customerInfo() + "! Welcome to our Beauty Saloon.");
			            System.out.println("- Type 1 if you want to buy PRODUCTS ONLY");
			            System.out.println("- Type 2 if you want SERVICES ONLY");
			            System.out.println("- Type 3 if BOTH");
			            int option = s.nextInt();
			                
			            switch (option) {
			                case 1:
			                    gP.selectProduct();
			                break;
			                case 2:
			                    gS.selectService();
			                break;
			                case 3:
			                	gP.selectProduct();
			                	gS.selectService();
			                	double bothFinalCost = 0;
			                	bothFinalCost = (finalProductCost - (finalProductCost * Act04_BeautySaloon.Discount.get_pDcRate(allowed)) + (finalServiceCost - (finalServiceCost * Act04_BeautySaloon.Discount.get_sDcRate(allowed))));
			                	System.out.println("The final cost of both products and service is $" + bothFinalCost);
			                break;
			                default:
			                	System.out.println("INVALID INPUT!");
			                
			            }
		        }
    }
    
    
    public class Discount{
        
        private static double sDcPremium = 0.2;
        private static double sDcGold = 0.15;
        private static double sDcSilver = 0.1;
        private static double pDcPremium = 0.1;
        private static double pDcGold = 0.1;
        private static double pDcSilver = 0.1;
        
        public static double get_pDcRate(String type){
            switch(type){
                case "Premium" -> {
                    return pDcPremium;
                }
                case "Gold" -> {
                    return pDcGold;
                }
                case "Silver" -> {
                    return pDcSilver;
                }
                default ->{
                    throw new IllegalArgumentException("Wrong membership type!");
                }
            }
        }
        
        public static double get_sDcRate(String type){
            switch(type){
                case "Premium" -> {
                    return sDcPremium;
                }
                case "Gold" -> {
                    return sDcGold;
                }
                case "Silver" -> {
                    return sDcSilver;
                }
                default ->{
                    throw new IllegalArgumentException("Wrong membership type!");
                }
            }
        }
    }
    
    public class Customer{
    	
    	

		public static String customerInfo() {
			
    		String name = "";
    		
    		
    		System.out.print("Enter your Name: ");
	    		try {
					name = s.nextLine();
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	System.out.print("Do you have a membership? ");
	    	String membership = s.nextLine();
			switch(membership) {
			case "y":
				System.out.println("What type of membership do you have? \nPlease type 'Premium', 'Gold', or 'Silver' ONLY");
				allowed = s.nextLine();
				Act04_BeautySaloon.Discount.get_pDcRate(allowed);
				Act04_BeautySaloon.Discount.get_sDcRate(allowed);
				System.out.println(Act04_BeautySaloon.Discount.get_pDcRate(allowed));
			break;
			case "n":
			break;
			default:
				System.out.println("Invalid INPUT!");
			}
			return name;
    	}
        
    }

    public static void main(String[] args) {
        Act04_BeautySaloon bs = new Act04_BeautySaloon();
        Act04_BeautySaloon.Visit v = bs.new Visit();
        v.visitCustomer();
    }
}
