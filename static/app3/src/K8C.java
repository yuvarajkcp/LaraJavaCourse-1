class K8C
{
	static
	{
		System.out.println(K8C.i);
		i=100;
	}
		static int j=test();

	static int test()
	{
		System.out.println(i);
		return i=90;
	}
	static int i;
	

	public static void main(String[] args)
	{
		System.out.println("done: " + i);
		System.out.println("done: " + test());
		System.out.println("done: " + j);
		System.out.println("done: " + i);

	}
}
/*




0
100
done: 90
90
done: 90
done: 90
done: 90

*/
