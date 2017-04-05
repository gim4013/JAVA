public class SavingsAccount extends Account {
	
	private double interest;//��������
	private int totalTerm;
	SavingsAccount(double balance,double interest) {//������
		super(balance);
		this.interest = interest;
		this.totalTerm = 0;
	}

	@Override public void debit(double withdraw) {
		if(withdraw <= getWithdrawableAccount()) {
			super.debit(withdraw);
		}
	}
	@Override public double credit(double money){
		if(totalTerm>=12)
		{
			return super.credit(money);
		}
			return 0.0;
	}
	@Override
	double getWithdrawableAccount() {
		return (totalTerm>=12) ? getBalance() : 0.0;
	}

	@Override
	void passTime(int time) {//���� ���� 
		if(totalTerm < 12 && totalTerm + time >=12){
			setBalance( getBalance() * (Math.pow(1+interest, time)));
		}
		totalTerm +=time;
	}
}
