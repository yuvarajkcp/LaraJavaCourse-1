class  A
{
	//here we should have constructor with no arguments, compiler won't provide this bcoz already there is one constructor
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class T extends A
{
	T(int i)
	{
		//super();
		System.out.println("T(int)");
	}
	public static void main(String[] args)
	{
		T t1 = new T(90);
		System.out.println("done");
	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes T.java
T.java:3: error: <identifier> expected
        A(int)
             ^
 */




