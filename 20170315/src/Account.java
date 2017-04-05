
public abstract class Account {
	
	abstract double getWithdrawableAccount();
	abstract void passTime(int time);
	 

	private double balance;
	
	
	Account(double balance) {//생성자
		this.balance=balance;
	}
	

	public double credit(double money_input) {//입금 메소드
		return balance += money_input;
	}
	
	public void debit(double money_draw) {//출금 메소드
		if(money_draw > 0 && money_draw <= getWithdrawableAccount())
			balance = balance - money_draw;
	}
	
	public double getBalance() {//잔액 확인 메소드
		return balance;
	}
	
	protected void setBalance(double set_Balance) {//잔액 수정 메소드
		balance=set_Balance;
	}
}
