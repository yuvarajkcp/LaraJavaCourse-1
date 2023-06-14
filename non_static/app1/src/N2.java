class N2
{
	static int i;
	public static void main(String[] args) 
	{
		N2 n1 = new N2();
		N2 n2 = new N2();
		n1.i = 10;
		n2.i = 20;
		System.out.println(n1.i);
		System.out.println(n2.i);
	}
}

//20
//20

//here n1 & n2 are same