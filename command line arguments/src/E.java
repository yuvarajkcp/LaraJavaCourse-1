class E 
{
	public static void main(String[] args) 
	{
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		int j = i*i;
		System.out.println("square of " + i + " is " + j);
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes E 2
square of 2 is 4

D:\april-batch-lab\command line arguments\src>java -cp ../classes E 100
square of 100 is 10000
*/