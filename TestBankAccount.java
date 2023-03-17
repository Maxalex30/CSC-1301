package Myjava;

public class TestBankAccount extends BankAccount {

	public static void main(String[] args) {

		BankAccount B1 = new BankAccount();
		B1.deposit(500);
		System.out.println(B1);
		B1.withdraw(300);
		System.out.println(B1);
		
		BankAccount B2 = new BankAccount();
		System.out.println(B2);
		B2.setName("Richard");
		B2.setbalance(350);
		System.out.println(B2);
	}
}
