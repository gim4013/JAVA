
public class CheckingAccount extends Account {
	
	private double credit_limit;//�����ѵ�
	private double interest;//��������
	private double interest_loan;//��������
	
	CheckingAccount(String accountant_,double balance_,double limit) { //������
		super(accountant_,balance_);
		this.credit_limit=limit;
		this.interest=0.1;
		this.interest_loan=0.07;
	}
	
	public double debit (double money_draw)
	{
		if(money_draw>credit_limit) {
			System.out.println("�ѵ��ʰ�");
		} else {
			
				if(money_draw>getBalance()) {
					setBalance(getBalance()-money_draw);
					return 0;
				} else {
					setBalance(getBalance()-money_draw);
					return 0;
				}
		}
		return 0;
	}
	public void nextMonth(double balance)
	{
		balance=getBalance();
		if(balance>0) {
			balance *= (1.0+interest);
			setBalance(balance);
		} else {
			balance *= (1.0+interest_loan);
			setBalance(balance);
		}
	}
}
