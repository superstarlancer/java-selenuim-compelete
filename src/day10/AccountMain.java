package day10;

public class AccountMain {

	public static void main(String[] args) 
	{
		Account accobj=new Account();
		//calling setters
		accobj.setAcc_no(123456);
		accobj.setName("Kim");
		accobj.setAmount(150.15);
		
		//calling getters
		System.out.println(accobj.getAcc_no());
		System.out.println(accobj.getName());
		System.out.println(accobj.getAmount());
	}

}
