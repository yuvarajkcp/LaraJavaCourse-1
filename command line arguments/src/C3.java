class  C3
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments: " + args.length);

		for (String elements: args )
		{
			System.out.println(elements);
		}
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes C3 10 20
total arguments: 2
10
20
10
20
*/