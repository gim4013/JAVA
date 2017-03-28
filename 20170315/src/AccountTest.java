import  java.util.Scanner;

public class AccountTest {

	public static void main(String[] args)
	{
		//객체생성 
		CheckingAccount account1= new CheckingAccount("account1",100.00,1000.00);
		CheckingAccount account2= new CheckingAccount("account2",100.00,1000.00);
		Scanner input = new Scanner(System.in);
		
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		System.out.println();
		//account1에 예금입금
		double num1=input.nextDouble();
		account1.credit(num1);System.out.println();
		
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		//account2에 예금출금
		double num2=input.nextDouble();
		account2.debit(num2);System.out.println();
		
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		//한달후 이자생긴걸로 다시 잔액수정
		System.out.println("next month!");
		account1.nextMonth(account1.getBalance());
		account2.nextMonth(account1.getBalance());
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		


	}
}