class  H
{
	public static void main(String[] args) 
	{
		for (String s1 : args )
		{
			System.out.println(s1);
		}
	}
}
/*
D:\april-batch-lab\command line arguments\src>java -cp ../classes H 10 20 55 abc @@
10
20
55
abc
@@

D:\april-batch-lab\command line arguments\src>java -cp ../classes H "anitha thapa"
anitha thapa

D:\april-batch-lab\command line arguments\src>java -cp ../classes H 'a '
'a
'


*/