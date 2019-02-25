package accountpack;


public class AccountAdd extends AccountReports {
	private	AccountList accountNumber;
	
	public AccountAdd() {
	     setAccountNumber(new AccountList());
	}

	public void setAccountNumber(AccountList accountNumber) {
		this.accountNumber=accountNumber;
	}

	public AccountList getAccountNumber() {
		return accountNumber;
	}
}
