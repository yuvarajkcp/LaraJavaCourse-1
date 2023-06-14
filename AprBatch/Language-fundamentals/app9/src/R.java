class R
{
	public static void main(String[] args) 
	{
		String i = "1";
		switch(i)
		{
			case "1":
				System.out.println("from case 1");
				for(int j = 1; j <= 2; j++)
				{
					System.out.println("from case 1 loop: " + j);
				}
				break;
			case "2":
				System.out.println("from case 1");
				break;
		}
	}
}
