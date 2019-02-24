package clientpack;

import java.util.Scanner;

public class Platinums extends ClientsType {
	 int getID;
	 String getName;
	 double deposit;
	 protected double withdraw=110000;
	 protected double amount;
	private Scanner scan;
//	status(allowed, warned, blocked)
	
	public Platinums() {
		if(withdraw>100000) {
	scan = new Scanner(System.in);
	getID = scan.nextInt();
	getName = scan.toString();
	deposit = scan.nextDouble();
	withdraw = scan.nextDouble();
	amount = scan.nextDouble();
	
	}else{
		
	}

	{
		System.out.println("Please input ID number : "+ getID);
		System.out.println("Please input your name : "+ getName);}

	System.out.println("Deposit operation - please input money : "+ deposit);
	System.out.println("Withdraw money : "+ withdraw);
	System.out.println("Your amount : "+ amount);
	}
		
		@Override
		public void setID(int ID) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void setName(String name) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void setDeposit(double deposit) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void setWithdraw(double withdraw) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void setAmount(double amount) {
			// TODO Auto-generated method stub
			
		}
		
		public double getWithdraw() {
			return withdraw;
		}

	}
