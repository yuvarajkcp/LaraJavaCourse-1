//do-while
class  S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("body begin:" + i);
			System.out.println("body end:" + i);
			i++;
		}
		while(i <= 5);
		System.out.println("main end");
	}
}


/*
main begin
body begin:1
body end:1
body begin:2
body end:2
body begin:3
body end:3
body begin:4
body end:4
body begin:5
body end:5
main end