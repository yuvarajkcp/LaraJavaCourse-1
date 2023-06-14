package pack1;
class  B
{
	private int i;
}
class C
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
	}
}
/*

D:\april-batch-lab\access_levels\app1\src>javac -d ../classes pack1/B.java
pack1\B.java:11: error: i has private access in B
                System.out.println(b1.i);
 */
