class G
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++  +  i++  +  i++ +  i++  +  i;   // 0+1+1+1+1=4
		System.out.println(i);   // 1
		System.out.println(j);   //4
		System.out.println("-----------");
		int m = 0;
		int n = ++m  +  ++m  +  ++m +  ++m  +  m;
		System.out.println(m);
		System.out.println(n);
		System.out.println("-----------");
	}
}
