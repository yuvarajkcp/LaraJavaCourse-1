class F 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++   +    i   +    i++    +   i    +    i++    +    i;
		System.out.println(i);
		System.out.println(j);
		System.out.println("---------");
		int m = 0;
		int n = ++m   +    m   +    m++    +   m   +    ++m    +    m   +   m++    +    m;
		System.out.println(m);
		System.out.println(n);
		System.out.println("---------");
	}
}
