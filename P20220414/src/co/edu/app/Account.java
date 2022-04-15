package co.edu.app;

public class Account {
	//Account 클래스 : [필드] 계좌번호(유일함, 12-3432-43422), 예금주, 잔액
	private String accountNo;
	private String accountOwn;
	private int accountMon;
	
	public Account(String accountNo, String accountOwn, int accountMon) {
		this.accountMon =accountMon;
		this.accountNo = accountNo;
		this.accountOwn = accountOwn;
	}

	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountOwn() {
		return accountOwn;
	}

	public void setAccountOwn(String accountOwn) {
		this.accountOwn = accountOwn;
	}

	public int getAccountMon() {
		return accountMon;
	}

	public void setAccountMon(int accountMon) {
		if(accountMon < 0) {
			accountMon = 0;
		}
		this.accountMon = accountMon;
	}
	
	public void getInfo() {
		System.out.printf("%-13s   %-3s   %-5d\n",accountNo,accountOwn,accountMon);
	}
	
	

}
