package clientpack;

import java.util.ArrayList;

public abstract class ClientsType extends MainTest implements clientFace {

public static int CType;
protected int ID;
private	ClientList clientsNames;
private double deposit;
protected double withdraw;
protected double amount;

public ClientsType() {
     clientsNames = new ClientList() {
	};

}

public enum CType {Regulars, Golds, Platinums;
	
}

public abstract void setID(int ID);

public int getID() {
	return ID;
}public abstract void setName(String name);

public ArrayList<String> getName() {
	return getName();
}

public double getDeposit() {
	return deposit;
}

public abstract void setDeposit(double deposit);


public double getWithdraw() {
	return withdraw;
}

public abstract void setWithdraw(double withdraw);


public double getAmount() {
	return amount;
}

public abstract void setAmount(double amount);
}