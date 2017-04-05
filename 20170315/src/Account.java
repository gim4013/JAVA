
public abstract class Account {
	
	abstract double getWithdrawableAccount();
	abstract void passTime(int time);
	 

	private double balance;
	
	
	Account(double balance) {//������
		this.balance=balance;
	}
	

	public double credit(double money_input) {//�Ա� �޼ҵ�
		return balance += money_input;
	}
	
	public void debit(double money_draw) {//��� �޼ҵ�
		if(money_draw > 0 && money_draw <= getWithdrawableAccount())
			balance = balance - money_draw;
	}
	
	public double getBalance() {//�ܾ� Ȯ�� �޼ҵ�
		return balance;
	}
	
	protected void setBalance(double set_Balance) {//�ܾ� ���� �޼ҵ�
		balance=set_Balance;
	}
}
