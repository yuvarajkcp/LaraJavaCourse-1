class G
{
	{
		System.out.println("IIB");	
	}
	G()
	{
		this(90);
		System.out.println("G(int)");	
	}
	G(int i)
	{
		
		System.out.println("G(int)");	
	}
	
	public static void main(String[] args) 
	{
		G g1=new G();
		System.out.println("--------");
		G g2=new G(10);
		System.out.println("--------");
	}
}
/*

IIB
G(int)
G(int)
--------
IIB
G(int)
--------

*/