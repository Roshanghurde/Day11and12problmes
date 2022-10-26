
	package Day11_12problems;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class Day11and12prblm_account {
	    
	    ArrayList<Day11and12prblm_stock> stockAccount = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);
	    
	    Day11and12prblm_stock data = new Day11and12prblm_stock();

	   
	    public void addFund() {
	        System.out.print("Enter Amount=");
	        double amount = sc.nextDouble();
	        data.setAccountBalance(amount + data.getAccountBalance());
	        System.out.println(amount + " Rs" + " Fund credit in your account");
	        System.out.println("Bank Balance: Rs."+data.getAccountBalance());
	      
	        System.out.println();
	    }

	    public void buyStock() {
	        System.out.println();
	        System.out.println("Account Balance: " + data.getAccountBalance() + "Rs");
	        System.out.print("Enter Stock Name: ");
	        String stockName = sc.next();

	        System.out.print("Enter Price of Stock: ");
	        double sharePrice = sc.nextDouble();

	        System.out.print("How much  shares do you want to buy: ");
	        int shareQuantity = sc.nextInt();

	        double totalSharePrice = sharePrice * shareQuantity;
	        System.out.println("Total Share Price is " + totalSharePrice + "Rs");
	        System.out.println();
	        double remaningBalance = data.getAccountBalance() - totalSharePrice;
	        if (totalSharePrice <= data.getAccountBalance()) {
	        	Day11and12prblm_stock stockData = new Day11and12prblm_stock(stockName, sharePrice, shareQuantity, totalSharePrice, remaningBalance);
	            stockAccount.add(stockData);
	            System.out.println(stockName + " Stock added Successfully in Your portfalio ");
	            double accountBalance = remaningBalance;
	            data.setAccountBalance(accountBalance);
	            System.out.println("Remaining Account Balance: " + data.accountBalance + "Rs");
	        } else {
	            System.out.println("Insufficient balance.. \nYou Can Not buy This stock \nPlease select another stock \n Or Reduce the shears Quantity");
	        }
	        System.out.println();
	    }


	    
	    public void showNifty() {
	        if (stockAccount.size() == 0) {
	            System.out.println("Empty portfalio");
	            System.out.println();
	        } else {
	            System.out.println();
	            System.out.println(stockAccount.size() + " Company Stocks available in portfalio");
	            for (int i = 0; i < stockAccount.size(); i++) {
	                System.out.println(stockAccount.get(i));
	                System.out.println(" ");
	            }
	        }
	        System.out.println("Account Balance: " +data.getAccountBalance());
	        System.out.println();
	    }

	    
	    public void sellStock() {
	        if (stockAccount.size() == 0) {
	            System.out.println("Empty portfalio");
	            System.out.println();
	        } else {
	            System.out.print("Enter The Stock Name You want to Sell from Your Holdings: ");
	            String sname = sc.next();
	            for (int i = 0; i < stockAccount.size(); i++) {
	            	Day11and12prblm_stock stockdata = stockAccount.get(i);
	                if (!sname.equals(stockdata.stockName)) {
	                    System.out.println("Stock does not exist");
	                } else {
	                    double acbalance =  data.accountBalance + stockdata.totalSharePrice;
	                    data.setAccountBalance(acbalance);

	                    
	                    stockAccount.remove(i);
	                    System.out.println();
	                    System.out.println("Successfully to sell stock...\n Successfully added to Your account \n please check Your portfalio");
	                }
	            }
	        }
	        System.out.println();
	    }

	    public void withdrawsMoney(){
	        if (data.getAccountBalance() == 0) {
	            System.out.println("Insufficient balance \n please Add Fund");
	            System.out.println();
	        } else {
	            System.out.println();
	            System.out.println("Account Balance: " +data.getAccountBalance());
	            System.out.println("How much Money You want to withdraws?");
	            System.out.print("Enter Amount: ");
	            double amount = sc.nextDouble();
	            if (amount <= data.getAccountBalance()) {
	                System.out.println(amount+ "Rs successfully Withdraw");
	                System.out.println("The amount of Rs." +amount+ " has been initiated to your bank account and will reflect in 1 working day");
	                double remaning = data.getAccountBalance() - amount;
	                data.setAccountBalance(remaning);

	                System.out.println();
	                System.out.println("Now Your Demat Account Balance: " +data.getAccountBalance());
	                System.out.println();
	            } else {
	                System.out.println("Insufficient balance");
	            }
	        }
	        System.out.println();
	    }
	}
		
