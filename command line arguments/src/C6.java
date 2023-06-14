//STRING TO CHAR
class  C6
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments: " + args.length);
		System.out.println("--------- ");
		//its not converting from string to other
		//its just fetching values from a particular string index
		//we cant convert string to char
		char c1 = args[0].charAt(0);
		System.out.println(c1);
	}
}
/*
internally strings are also array of characters, and will be having indexes. index starts from 0

D:\april-batch-lab\command line arguments\src>java -cp ../classes C6 @
total arguments: 1
---------
@

*/