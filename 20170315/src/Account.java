
public class Account {

	private double money;
	public final String account;
	
	public void credit(double m){
		money += m;
	}
	public double debit(double d){
		if(money-d<=0){
			System.out.printf("Enter withdrawal amount for %s : %f",this.account,d);
			//System.out.println("there is no money");
			System.out.printf("subtracting %f from %s balance",d,this.account);
			System.out.println();
			System.out.printf("Debit amount exceeded account balance.");
			return -1;
		}
			
		else{
			System.out.printf("Enter withdrawal amount for %s : %f",this.account,d);
			money-=d;
			return d;
		}
	}
	public void balance(){
		System.out.printf("%s's balance: %f",this.account,this.money);
		
	}
	public Account(String account,double money)
	{
		this.account = account;
		this.money = money;
	}


}
