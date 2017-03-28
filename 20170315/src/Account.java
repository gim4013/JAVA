
public class Account {

	private double balance;
	public final String account;
	
	Account(String accountant_,double balance_) {//������
		this.balance=balance_;
		this.account=accountant_;
	}
	
	public void credit(double money_input) {//�Ա� �޼ҵ�
		balance += money_input;
	}
	
	public double debit(double money_draw) {//��� �޼ҵ�
		if(balance-money_draw<=0) {
			System.out.printf("Enter withdrawal amount for %s : %f",this.account,money_draw);
			System.out.println();
			System.out.printf("Debit amount exceeded account balance.");
			return -1;
		}else {
			System.out.printf("Enter withdrawal amount for %s : %f",this.account,money_draw);
			System.out.println();
			System.out.printf("subtracting %f from %s balance",money_draw,this.account);
			balance-=money_draw;
			return money_draw;
		}
	}
	
	public void printBalance() {//���� ��� �޼ҵ�
		System.out.printf("%s balance: %f",this.account,this.balance);
	}
	
	public double getBalance() {//�ܾ� Ȯ�� �޼ҵ�
		return balance;
	}
	
	protected void setBalance(double set_Balance) {//�ܾ� ���� �޼ҵ�
		balance=set_Balance;
	}
}
