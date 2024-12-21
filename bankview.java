package javaproject;
import java.util.Scanner;
public class bankview 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		while(true) 
		{
			System.out.println("1.Register \n2.login \n3.exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("enter login id");
				bank.loginid=sc.next();
				System.out.println("enter password");
				bank.loginpass=sc.next();
				System.out.println("REgistration Successfull");
				break;
			}
			case 2:
			{
				
				System.out.println("enter login id");
				String id=sc.next();
				System.out.println("enter password");
				String pass=sc.next();
				
				if(bank.loginid.equals(id) && bank.loginpass.equals(pass))
				{
					System.out.println("login Successfull");
					boolean check=true;
					while(check) 
					{
						System.out.println("welcome to Rohith bank");
						System.out.println("1.open account \n2.deposite \n3. withdraw \n4.check balance \n5.changepin \n6.passbook \n7.logout");
						int choice=sc.nextInt();
						switch(choice)
						{
						case 1:
						{
							bankcontroller.openAccount();
							break;
						}
						case 2:
						{
							bankcontroller.deposite();
							break;
						}
						case 3:
						{
							
						
							bankcontroller.withdraw();
							break;
						}
							
						case 4:
						{
							System.out.println("balance:"+	bankcontroller.checkBalance());
							break;
						}
							
						case 5:
						{
							bankcontroller.changePin();
							break;
						}
						case 6:
						{
							System.out.println("name:"+bankcontroller.b.getName()+"\naccount number: "+bankcontroller.b.getAccountno()+"\nbalance: "+bankcontroller.b.getBal()+"\n pin:"+bankcontroller.b.getPin());
							break;
						}
							
						case 7:
						{
							System.out.println("logout succesfull...!");
								check=false;
						}
							
							 
						}
					}
					
				}
				
				else
					System.out.println("invalid crendential");
				break;
			}
			case 3:{
				System.out.println("thank you visit again");
				
			return;
			}
			
			}
		}
	}
}
