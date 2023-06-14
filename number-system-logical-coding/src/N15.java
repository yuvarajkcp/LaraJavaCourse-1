//Reverse the given number
class  N15
{
	public static void main(String[] args) 
	{
		int i=123;
		int j=0;
		int digit;
		while (i != 0)
		{
			digit= i%10;
			j=j * 10 + digit;
			i= i / 10;
		}
		System.out.println(j);
	}
}

//321
