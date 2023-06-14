//given number is 345613; take out middle two digits and print as a number
class N4 
{
	public static void main(String[] args) 
	{
		int i = 345613;
		int j = (i / 100) % 100;  
		System.out.println(j);
	}
}


//56