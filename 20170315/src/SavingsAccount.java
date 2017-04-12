public class SavingsAccount extends Account implements Valuable{
	
	private double interest;//��������
	private int totalTerm;
	SavingsAccount(double balance,double interest) {//������
		super(balance);
		this.interest = interest;
		this.totalTerm = 0;
	}

	@Override public void debit(double amount) throws Exception{
		if(amount<0) {
			throw new Exception("�����Է�!");
		}else if( amount >getWithdrawableAccount()){
			throw new Exception("Debit amount exceeded account balance");
		} else {
			super.debit(amount);
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

	@Override
	public double EstimateValue(int month) {
		
			setBalance( getBalance() * (Math.pow(1+interest, month)));
		
		return getBalance();
	}
	@Override
	public String toString()
	{
		return String.format("Savingaccount_Balance:%s",getBalance());
		
		
	}
}
