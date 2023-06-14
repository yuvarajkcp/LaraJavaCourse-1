class C 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:" + args.length);

		System.out.println("still in the string datatype not converted");
		for(String elements : args)
		{
			System.out.println(elements);
		}
		System.out.println("after conversion");
		double i = Double.parseDouble(args[0]);
		double j = Double.parseDouble(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}