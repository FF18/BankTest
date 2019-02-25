package clientpack;

public  class ClientsType extends MainTest implements clientFace {

public static int CType;
protected int ID;
private	ClientList clientsNames;
private double deposit;
protected double withdraw;
protected double amount;

public ClientsType() {
     setClientsNames(new ClientList());
}

public enum CType {Regulars, Golds, Platinums}

public void setID(int ID) {
	this.ID=ID;
}

public int getID() {
	return ID;
}

public double getDeposit() {
	return deposit;
}

public void setDeposit(double deposit) {
	this.deposit=deposit;
}

public double getWithdraw() {
	return withdraw;
}

public void setWithdraw(double withdraw) {
	this.withdraw=withdraw;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount=amount;
}

public ClientList getClientsNames() {
	return clientsNames;
}

public void setClientsNames(ClientList clientsNames) {
	this.clientsNames = clientsNames;
}
}