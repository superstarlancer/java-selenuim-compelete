package day13v2;

import day13.pack1.Test;

public class WrapperClassesDemo 
{
	public static void main(String[] args)
	{
		//int x=100; //x is primitive
		Integer x=100; //x is an object variable
	
	byte b=10;
	short s=20;
	int i=30;
	long l=40;
	float f=50.0F;
	double d=60.0D;
	char c='a';
	boolean b2=true;
	
	//Autoboxing: Converting primitives into objects
	
	Byte byteobj=b;
	Short shortobj=s;
	Integer intobj=i;
	Long longobj=l;
	Float floatobj=f;
	Double doubleobj=d;
	Character charobj=c;
	Boolean boolobj=b2;
	
	//Printing all the objects
	
	System.out.println(byteobj);
	System.out.println(shortobj);
	System.out.println(intobj);
	System.out.println(longobj);
	System.out.println(floatobj);
	System.out.println(doubleobj);
	System.out.println(charobj);
	System.out.println(boolobj);
	
	//Unboxing: Converting Objects into Primitives
	byte bytevalue = byteobj;
	short shortvalue = shortobj;
	
	
	//Printing Primitives
	System.out.println(byteobj);
	
	
	
	}
}
