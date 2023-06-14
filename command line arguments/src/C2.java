class  C2
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments: " + args.length);

		for (String elements: args )
		{
			System.out.println(elements);
		}
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes C2 anitha praveen 587
total arguments: 3
anitha
praveen
587
*/