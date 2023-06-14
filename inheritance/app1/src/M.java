//Multi-level inheritance
class M 
{
	M()
	{

		System.out.println("M()");	
	}
}

class N extends M
{
	N()
	{
		System.out.println("N()");	
	}
}
class O extends N
{
	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println("--------------------");	
		N n1 = new N();
		System.out.println("--------------------");	
		O o1 = new O();
		System.out.println("--------------------");	
	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes M.java

D:\april-batch-lab\inheritance\src>java -cp ../classes O
M()
--------------------
M()
N()
--------------------
M()
N()
-----------------
*/