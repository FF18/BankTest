package clientpack;

import java.util.Scanner;

public class Golds extends ClientsType {
	 int getID;
	 String getName;
	 double deposit;
	 protected double withdraw=60000;
	 protected double amount;
	private Scanner scan;
//	status(allowed, warned, blocked)
	
	public Golds() {
		if(withdraw>50000 && withdraw<100000) {
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
		this.ID=ID;
	}

	@Override
	public void setDeposit(double deposit) {
		this.deposit=deposit;
	}
	@Override
	public void setWithdraw(double withdraw) {
		this.withdraw=withdraw;
	}
	@Override
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	
}