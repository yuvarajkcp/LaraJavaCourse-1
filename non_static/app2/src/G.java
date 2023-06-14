class  G
{
	G() //G(int q) no error
	{
		System.out.println("from G()");
	}
	public static void main(String[] args) 
	{
		G g1 = new G(90);
		System.out.println("done");
	}
}
/*
 constructor G in class G cannot be applied to given types;
                G g1 = new G(90);
                       ^
*/
