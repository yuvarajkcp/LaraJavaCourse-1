class E 
{
	static int i;
}

class F extends E
{
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(F.i);
		System.out.println(F.j);
	}
}
/*
static and non-static variables are inherited to sub-class from the super class

By using sub class reference only we can access static members of sub class, no need of creating object
Even by creating object to sub class we access static variables.

D:\april-batch-lab\inheritance\src>javac -d ../classes E.java

D:\april-batch-lab\inheritance\src>java -cp ../classes F
0
0
*/
