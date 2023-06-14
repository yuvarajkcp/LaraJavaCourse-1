class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for(i = 1, System.out.println("init"),System.out.println("init"); i <5; System.out.println("before change:" +i), i++, System.out.println("after change:" +i) )
		{
			System.out.println("loop body:" + i);
	     }	
		 		System.out.println("main end");
}
}

//main begin
//init
//init
//loop body:1
//before change:1
//after change:2
//loop body:2
//before change:2
//after change:3
//loop body:3
//before change:3
//after change:4
//loop body:4
//before change:4
//after change:5
//main end