class F
{
	int i;
	F(int i)
	{
		this.i = 10;
		i = 20;
		System.out.println("F(int)");
	}
	public static void main(String[]args)
	{
		F f1 = new F(10);
		System.out.println(f1.i);
	}
}
//this represents current object