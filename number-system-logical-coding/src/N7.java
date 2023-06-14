//Print next number if the given number is odd and before number if the given number is even
class N7 
{
	public static void main(String[] args) 
	{
		int i=566;
		int j=i;
		if (i % 2 != 0)
		{
			i += 1;
			System.out.println(i);  //System.out.println(i+1)
		}
		else
		{
			i -= 1;
			System.out.println(i);  //System.out.println(i-1)
		}
	}
}
//565