import  java.util.Scanner;

public class AccountTest {

	public static void main(String[] args)
	{
		//��ü���� 
		CheckingAccount account1= new CheckingAccount("account1",100.00,1000.00);
		CheckingAccount account2= new CheckingAccount("account2",100.00,1000.00);
		Scanner input = new Scanner(System.in);
		
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		System.out.println();
		//account1�� �����Ա�
		double num1=input.nextDouble();
		account1.credit(num1);System.out.println();
		
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		//account2�� �������
		double num2=input.nextDouble();
		account2.debit(num2);System.out.println();
		
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		//�Ѵ��� ���ڻ���ɷ� �ٽ� �ܾ׼���
		System.out.println("next month!");
		account1.nextMonth(account1.getBalance());
		account2.nextMonth(account1.getBalance());
		account1.printBalance();System.out.println();
		account2.printBalance();System.out.println();
		


	}
}