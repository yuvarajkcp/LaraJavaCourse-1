package pack1;
class  A
{
	private int i;
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}
/*
D:\april-batch-lab\access_levels\app1\src>javac -d ../classes pack1/A.java

D:\april-batch-lab\access_levels\app1\src>java -cp ../classes pack1.A
0
*/