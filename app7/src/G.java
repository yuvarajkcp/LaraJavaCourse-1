class G 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
		    System.out.println("pls supply one commnd line arg");
			return;
		}
		int i = Integer.parseInt(args[0]);
		System.out.println(Math.sqrt(i));
	}
}
