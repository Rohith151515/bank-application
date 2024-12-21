package javaproject;

public class bank {
	private String accountno;
	private String name;
	private double bal;
	private int pin;
	static String loginid;
	static String loginpass;
	bank(String accountno,String name,double bal,int pin){
		setAccountno(accountno);
		setName(name);
		setBal(bal);
		setPin(pin);
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	

}
