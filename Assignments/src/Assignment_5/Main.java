package Bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account Balance: ");
		double balance = sc.nextDouble();
		System.out.println("Enter account Password: ");
		String pass = sc.next();
		Account acc = new Account(balance, pass);
		acc.displayAccount(acc);
		sc.close();
	}
}
