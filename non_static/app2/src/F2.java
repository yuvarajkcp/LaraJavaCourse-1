class  F2
{
	int i;
	F2(int i)
	{
		this.i = 10;
		System.out.println("from F(int)");
	}
	public static void main(String[] args) 
	{
		F2 f1 = new F2(10);
		System.out.println(f1.i);
	}
}
/*
from F(int)
10

*/