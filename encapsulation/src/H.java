class Book {
    private String title;
    private String author;
    private int yearPublished;

   public String getTitle()
	{
		return title;
	}
   public String getAuthor()
	{
		return author;
	}
   public int getYearPublished()
	{
		return yearPublished;
	}
   public void setTitle(String title)
	{
		this.title=title;
	}
   public void setAuthor(String author)
	{
		this.author=author;
	}
   public void setYearPublished(int yearPublished)
	{
		this.yearPublished=yearPublished;
	}

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setAuthor("John Smith");
        book.setYearPublished(2022);
        String title = book.getTitle();
        String author = book.getAuthor();
        int yearPublished = book.getYearPublished();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }
}
/*
D:\april-batch-lab\encapsulation\src>javac -d ../classes H.java

D:\april-batch-lab\encapsulation\src>java -cp ../classes Book
Title: Java Programming
Author: John Smith
Year Published: 2022


*/