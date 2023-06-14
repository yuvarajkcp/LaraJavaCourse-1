class G18
{
	public static void main(String[] args) 
	{
			int i=10;
		{
			{
			
				System.out.println("inner normalblock: " + i ); //i is local to this block
			}
				System.out.println("outer normalblock: " + i );
	}
				System.out.println("main end: " + i );
}
	}

/*
inner normalblock: 10
outer normalblock: 10
main end: 10
*/