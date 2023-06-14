//Count only odd digits
class N14 
{
	public static void main(String[] args) 
	{
		int i=58119076;
		int count=0;
		while(i != 0)
		{
			if ((i % 10) % 2 != 0)
			{
				count++;
			}
			i=i/10;
		}
		System.out.println("total number of odd digits in 58119076 : " + count++);
	}
}

//total number of odd digits in 58119076 : 5