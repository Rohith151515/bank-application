package javaproject;

public class bankcontroller {
	
	static int c;
	static bank b;
	static String generateAccountno() {
	
		long no =9705155230l*++c;

		String acc= "1023" +no;

		String accountno=" ";

		for (int i=0; i < 11; i++) {

		accountno+=acc.charAt(1);
		}

		return accountno;
	}

		static void openAccount() {

		System.out.println("Enter Name");
		String name=bankview.sc.next(); 
		System.out.println("Enter Pin"); 
		int pin=bankview.sc.nextInt(); 
		b=new bank(generateAccountno(), name, 5000, pin); 
		System.out.println("Account Created Successfully...!");
		}

		static void deposite() 
		{

		System.out.println("enter Account Number");
		String accountno=bankview.sc.next(); 
		if(accountno.equals(b.getAccountno()))
		 System.out.println("Enter Amount"); 
		double amount= bankview.sc.nextDouble();
		b.setBal(b.getBal()+amount);
		

		System.out.println("Transaction Successfull...!");

		System.out.println("Invalid Account Number");
		}

		static void withdraw() 
		{
			
		

		System.out.println("enter Amount");
		double amount =bankview.sc.nextDouble(); 
		System.out.println("Enter Pin");
		int pin=bankview.sc.nextInt();
		if(b.getPin()==pin) 
		if(amount<-b.getBal()) 

			System.out.println("Transaction Successfull...1");

		else

		System.out.println("Insufficient Balance...!");


		else

		System.out.println("Wrong Pin");
		}

		static double checkBalance() {
			
		

		return b.getBal();
		}

		static void changePin() {

		System.out.println("Enter Old Pin");
		int oldPin=bankview.sc.nextInt();
		if(oldPin==b.getPin()) 
		{ 
			System.out.println("Enter new Pin");
			b.setPin(bankview.sc.nextInt());
			System.out.println("Pin Changed Successfully...!");
		}

		else

		System.out.println("Invalid Pin");
		
	}

}
