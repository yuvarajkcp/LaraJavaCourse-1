class  F
{
	int i;
	F(int i)
	{
		int i = 10;
		System.out.println("from F(int)");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
	}
}
/*
 constructor F in class F cannot be applied to given types;
                F f1 = new F();
                       ^

*/