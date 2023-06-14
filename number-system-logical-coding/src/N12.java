//Count total number of digits from a given number
class  N12
{
	public static void main(String[] args) 
	{
		int i=1548956845;
		int count=0;
		while(i>0)
		{
			i=i/10;
			count++;
		}
		System.out.println("total number of digits in 1548956845 : " + count );
	}
}

//total number of digits in 1548956845 : 10