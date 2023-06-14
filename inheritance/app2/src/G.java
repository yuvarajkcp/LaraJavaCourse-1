class Publisher
{
	String name;
	String publisherID;
	String city;
	
	//Publisher class constructor
	Publisher( String name, String publisherID , String city )
	{
		this.name = name;
		this.publisherID = publisherID;
		this.city = city;
	}
}
class Author
{
	String authorName;
	int age;
	String place;
	
	//Author class constructor
     Author( String name, int age, String place )
	{
		this.authorName = name;
		this.place= place;
		this.age = age;
	}
}

//Book class has-a Author
//Book class has-a Publisher
class Book
{
	String name;
	int price;

	//author details
	Author author;
	Publisher publisher;


	//Book class constructor
	Book( String n, int p , Author author , Publisher publisher )
	{
		this.name=n;
		this.price=p;
		this.author=author;
		this.publisher=publisher;
	}
	public static void main(String[]args)
	{
	Author author = new Author("John", 42, "USA");
	Publisher publisher = new Publisher("Sun Publication", "JDSR-III4", "LA");
	Book b=new Book("Java for Beginners", 800, author, publisher);
	System.out.println("Book name: " + b.name);
	System.out.println("Book Price: " + b.price);
	System.out.println("---------------Author details--------------");
	System.out.println("Auther name: " + b.author.authorName);
	System.out.println("Auther Age: " + b.author.age);
	System.out.println("Auther place: " + b.author.place);
	System.out.println("---------------Publisher details--------------");
	System.out.println("Publisher name: " + b.publisher.name);
	System.out.println("Publisher ID: " + b.publisher.publisherID);
	System.out.println("Publisher City: " + b.publisher.city);
}
}
/*
D:\april-batch-lab\inheritance\app2\src>java -cp ../classes Book
Book name: Java for Beginners
Book Price: 800
---------------Author details--------------
Auther name: John
Auther Age: 42
Auther place: USA
---------------Publisher details--------------
Publisher name: Sun Publication
Publisher ID: JDSR-III4
Publisher City: LA

*/