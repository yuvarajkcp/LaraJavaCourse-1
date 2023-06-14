class  K3
{
	int i;
	static
	{
		System.out.println("static: "+ k3.i);
	}
	static K3 k3 =new K3();
}
/*
illegal forward reference
                System.out.println("static: "+ k3.i);
				*/

/*class  K3
{
	int i;
	static K3 k3 =new K3();
	static
	{
		System.out.println("static: "+ k3.i);
	}

}
*/
