class E2
{
	public static void main(String[] args) 
	{
		boolean i = Boolean.parseBoolean(args[0]);
		System.out.println(i);
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes E2 true
true

D:\april-batch-lab\command line arguments\src>java -cp ../classes E2 TruE
true

D:\april-batch-lab\command line arguments\src>java -cp ../classes E2 TRUE
true

D:\april-batch-lab\command line arguments\src>java -cp ../classes E2 false
false

D:\april-batch-lab\command line arguments\src>java -cp ../classes E2 123
false
*/
