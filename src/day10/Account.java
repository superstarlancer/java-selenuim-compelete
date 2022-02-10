package day10;

public class Account 
{
	private int acc_no; //for every variable need to create one set and one get variable
	private String name; //private variables cannot access through object
	private double amount;
	
	 //Set method assigns data into variable
	 //Get method returns value from variable
	public int getAcc_no() 
	{
		return acc_no;
	}
	
	public void setAcc_no(int acc_no) 
	{
		this.acc_no = acc_no;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public double getAmount() 
	{
		return amount;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	
	
	
	
	
}	
	
	
	


