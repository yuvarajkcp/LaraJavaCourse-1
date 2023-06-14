class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for(i = 0; i <= 5; i++);  //for loop closed here, no body
			System.out.println("loop body stmt1:" +i);
			System.out.println("loop body stmt2:" +i);
		System.out.println("main end");
	}
}



//main begin
//loop body stmt1:6
//loop body stmt2:6
//main end