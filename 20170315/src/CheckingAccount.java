
public class CheckingAccount extends Account {
	
	private double credit_limit;//대출한도
	private double interest;//예금이자
	private double interest_loan;//대출이자
	
	CheckingAccount(String accountant_,double balance_,double limit) { //생성자
		super(accountant_,balance_);
		this.credit_limit=limit;
		this.interest=0.1;
		this.interest_loan=0.07;
	}
	
	public double debit (double money_draw)
	{
		if(money_draw>credit_limit) {
			System.out.println("한도초과");
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
