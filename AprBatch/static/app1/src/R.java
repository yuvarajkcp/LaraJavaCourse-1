class R 
{
	static int i = 10;
	static int j = 20;
	static int k;
	static int m = 30;
	public static void main(String[] args) 
	{
		System.out.println(i + ", " + j + ", " + k + ", " + m);
		i = 50;
		j = 510;
		k = 40;
		m = 140;
		System.out.println(i + ", " + j + ", " + k + ", " + m);
	}
}
