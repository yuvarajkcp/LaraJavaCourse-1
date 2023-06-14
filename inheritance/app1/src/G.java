class G
{
	static void test1()
	{
		System.out.println("G-test1");
	}
}

class H extends G
{
	static void test2()
	{
		System.out.println("H-test2");
	}
	public static void main(String[] args) 
	{
		H.test1();
		H.test2();
	}
}
/*
Static methods also will be inheriting to sub class

D:\april-batch-lab\inheritance\src>javac -d ../classes G.java

D:\april-batch-lab\inheritance\src>java -cp ../classes H
G-test1
H-test2

*/