class B 
{
	B()
	{
		System.out.println("B()");	
	}
	
	{
		System.out.println("IIB");	
	}
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println("--------");
		B b2=new B();
		System.out.println("--------");
	}
}
/*
IIB- Instance Initialization Block

IN ONE CLASS WE CAN WRITE ANY NUMBER OF IIB BLOCK

*IIB block can be developed outside any method and inside the class

*before the execution of the constructors IIB block is executing from top to bottom only once for one object creation

*IN ONE CLASS WE CAN CREATE ANY NUMBER OF IIB BLOCK

*if we are creating IIB blocks inside of any other blocks then that will be not considered as IIB block, it will be just a normal block

*Need of IIB blocks:
	if there is any common implementation is there for all the objects then we can keep that in IIB block.

IIB
B()
--------
IIB
B()
--------
*/
