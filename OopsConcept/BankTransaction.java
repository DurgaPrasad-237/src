package OopsConcept;
import java.util.Scanner;
public class BankTransaction {
	static String bankName;
	int accNO;
	int cbal;
	public static void setBankName() {
		bankName = "ICIC";
	}
	public static void printBankName() {
		System.out.println("bankName:"+bankName);
	}
	public void setCusData(int no, int bal) {
		accNO = no;
		cbal = bal;
	}
	public void deposit(int amt) {
		cbal += amt;
	}
	public void withDraw(int amt) {
		cbal -= amt;
	}
	public void printCbal() {
		System.out.println("Cbal:"+cbal);
	}
	public static void main(String[] args) {
		BankTransaction obj = new BankTransaction();
		BankTransaction obj2 = new BankTransaction();
		setBankName();
		printBankName();
		obj.setCusData(1001, 5000);
		System.out.println("account "+obj.accNO+"-------------");
		System.out.println("before deposit cbal:"+obj.cbal);
		obj.deposit(3000);
		System.out.print("after deposit ");
		obj.printCbal();
		printBankName();
		obj2.setCusData(1002, 6000);
		System.out.println("account "+obj2.accNO+"-------------");
		System.out.println("before withdrawl cbal:"+obj2.cbal);
		obj2.withDraw(3000);
		System.out.println("after withdrawl:");
		obj2.printCbal();
	}
}
