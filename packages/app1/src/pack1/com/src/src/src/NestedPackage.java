package pack1.com.src.src.src;
public class  NestedPackage
{
	public static void main(String[] args) 
	{
		System.out.println("from pack1.com.src.src.src");
	}
}
/*
D:\april-batch-lab\packages\app1\src>javac -d ../classes pack1/com/src/src/src/NestedPackage.java

D:\april-batch-lab\packages\app1\src>java -cp ../classes pack1.com.src.src.src.NestedPackage
from pack1.com.src.src.src

if we want to create class file from pack1.com.src.src.src in app2-classes
D:\april-batch-lab\packages\app1\src>javac -d ../../app2/classes pack1/com/src/src/src/NestedPackage.java

D:\april-batch-lab\packages\app1\src>javac -d D:\april-batch-lab\packages\app2\classes pack1/com/src/src/src/NestedPackage.java
*/
