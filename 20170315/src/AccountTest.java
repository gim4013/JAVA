import  java.util.Scanner;

public class AccountTest {

	public static void main(String[] args)
	{
		Account account1= new Account("account1",50.00);
		Account account2= new Account("account2",0.00);
		Scanner input = new Scanner(System.in);
		
		account1.balance();System.out.println();
		account2.balance();System.out.println();
		System.out.println();
		double num1=input.nextDouble();
		account1.debit(num1);System.out.println();
		
		account1.balance();System.out.println();
		account2.balance();System.out.println();
		double num2=input.nextDouble();
		account2.debit(num2);System.out.println();
		
		account1.balance();System.out.println();
		account2.balance(); 
		


	}
}