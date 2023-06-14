class W 
{
	int i;
	static W test(W w1)//w1=obj
	{
		W w2=new W();//w2=0
		w2.i=w1.i;  //w2=20 (w1=20)
		return w2;
	}
	public static void main(String[] args) 
	{
		W obj=new W();  //obj.i=0;
		obj.i=20;
		W rv=test(obj); //(rv=obj)
		System.out.println(rv.i);
	}
}
//20
