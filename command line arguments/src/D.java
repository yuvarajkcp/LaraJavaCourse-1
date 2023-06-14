class  D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1=args[0];
		System.out.println("----11----");
		String s2=args[1];
		System.out.println("----22----");
		String s3=args[2];
		System.out.println("----33----");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("main end");
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes D 1 2 3
main begin
----11----
----22----
----33----
1
2
3
main end
*/