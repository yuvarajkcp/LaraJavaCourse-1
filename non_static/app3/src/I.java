class I
{
	I()
	{
		//IIB
		//this()
		System.out.println("I()");	
	}
	{
		System.out.println("IIB");	
	}
	static
	{
		System.out.println("SIB");	
	}
	
	public static void main(String[] args) 
	{
		I obj1=new I();
		System.out.println("--------");
		I obj2=new I();
		System.out.println("--------");
		I obj3=new I();
		System.out.println("--------");
	}
}
/*

when a class have both static & IIB, first static is executed then IIB, one static block is executed only once in a class but IIB block is executed whenever object is created

SIB
IIB
I()
--------
IIB
I()
--------
IIB
I()
--------
*/
