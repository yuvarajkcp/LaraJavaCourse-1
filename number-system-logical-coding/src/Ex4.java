//find out total number of digits in a given number
class Ex4 
{
	public static void main(String[] args) 
	{
		int i = 24365651;
		int j = i;

		int count=0;
		while(i != 0)
		{
			count++;
			i = i/10;
		}
		
		System.out.println("number of digits in " + j + " is " + count);
	}
}

//number of digits in 24365651 is 8