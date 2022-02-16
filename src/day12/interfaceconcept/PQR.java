package day12.interfaceconcept;

public class PQR extends MNO implements ABC, XYZ
{

	
	public void m1()
	{
		System.out.println("m1 from ABC");
	}
	
	public void m2()
	{
		System.out.println("m2 from XYZ");
	}
	
	public static void main(String[] args)
	{
		PQR obj=new PQR();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
