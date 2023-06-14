class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <=5; ++i)
		{
			System.out.println("loop body begin: " + i);
				int j = 20;
				j++;
				j += 20; // j = j + 20
			System.out.println("loop body end: " + j);
	}
				System.out.println("main end");
}
}




//D:\april-batch-lab\app14\src>java -cp ../classes C
main begin
loop body begin: 1
loop body end: 41
loop body begin: 2
loop body end: 41
loop body begin: 3
loop body end: 41
loop body begin: 4
loop body end: 41
loop body begin: 5
loop body end: 41
main end