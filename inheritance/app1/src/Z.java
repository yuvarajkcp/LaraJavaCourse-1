class A 
{
	static
	{
		System.out.println("A-SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("B-SIB");
	}
}
class Z extends C
{
	static
	{
		System.out.println("Z-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes Z.java

D:\april-batch-lab\inheritance\src>java -cp ../classes Z
A-SIB
B-SIB
B-SIB
Z-SIB
main


*/