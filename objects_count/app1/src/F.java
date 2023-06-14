class F
{
	static int count;
	F()
	{
		count++;
	}
	F(int i)
	{
		count++;
	}
	F(int i, int j)
	{
		count++;
	}

	{
		count++;  //IIB  executed in every object creation
	}
	public static void main(String[] args) 
	{
		
		F f1 = new F();   //2
		F f2 = new F(10);  //4
		F f3 = new F(10, 20);  //6
		F f4 = new F(20);	//8
		F f5 = new F();		//10
		System.out.println(count);
		
	}
}

//10