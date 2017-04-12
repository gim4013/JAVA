
public class CheckingAccount extends Account implements Valuable {
	
	private double credit_limit;//�����ѵ�
	private double interest;//��������
	private double loan_interest;//��������
	
	public CheckingAccount(double balance,double limit,double interest,double loan_interest) { //������
		super(balance);
		this.credit_limit=limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
		this.setBalance(balance);
	}
	
	public void debit (double amount)throws Exception {
		
			if( amount<0)throw new Exception("�����Է�!");
			if(this.getBalance()+credit_limit<amount) {
				throw new Exception("Debit amount exceeded account balance");
			} else {
				this.setBalance(this.getBalance()-amount);
			}
	}
	public void nextMonth()
	{
		if(this.getBalance()>0) {
			this.setBalance(this.getBalance()*(1+interest));
		} else {
			this.setBalance(this.getBalance()*(1+loan_interest));
		}
	}
	public boolean isBankrupted()
	{
		if(this.getWithdrawableAccount() <= 0){
			System.out.println("Bankrupted!");
			return true;
		}
		else {
			return false;
		}
			
	}
	@Override
	public double getWithdrawableAccount() {
		if(this.getBalance()+credit_limit<0) {
			return 0;
		}else{
			return this.getBalance()+credit_limit;
		}
	}

	@Override
	public void passTime(int time) {
		
		this.setBalance( this.getBalance() *(Math.pow(1+interest, time)));
	}
	
	@Override
	public double EstimateValue(int month) {
		passTime(month);
		return getBalance(); 
	}
	@Override
	public String toString()
	{
		return String.format("Checkingaccount_Balance:%s",getBalance());
		
		
	}
	
}
