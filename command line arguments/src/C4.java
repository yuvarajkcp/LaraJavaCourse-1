class  C4
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments: " + args.length);

		for (String elements: args )
		{
			System.out.println(elements);
		}
		double i=Double.parseDouble(args[0]);
		double j=Double.parseDouble(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes C4 10 30
total arguments: 2
10
30
10.0
30.0
*/