class G17
{
	public static void main(String[] args) 
	{
		{
			{
				int i=10;
				System.out.println("inner normalblock: " + i ); //i is local to this block
			}
				System.out.println("outer normalblock: " + i );
	}
				System.out.println("main end: " + i );
}
	}
/*
 cannot find symbol
       System.out.println("inner normalblock: " + i );
error: cannot find symbol
       System.out.println("main end: " + i );
*/

