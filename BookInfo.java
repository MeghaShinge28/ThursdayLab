class Book
{
	private String Name;
	private String ISBN;
	private String Author;
	private String Publisher;
	public Book(String name, String isbn, String author, String publisher) 
	{
		this.Name = name;
		this.ISBN = isbn;
		this.Author = author;
		this.Publisher = publisher;
	}
	public void setName(String Name) 
	{
		this.Name = Name;
	}
	public String getName() 
	{
		return Name;
	}
	public void setISBN(String ISBN) 
	{
		this.ISBN = ISBN;
	}
	public String getISBN() 
	{
		return ISBN;
	}
	public void setAuthor(String Author) 
	{
		this.Author = Author;
	}
	public String getAuthor() 
	{
		return Author;
	}
	public void setPublisher(String Publisher) 
	{
		this.Publisher = Publisher;
	}
	public String getPublisher() 
	{
		return Publisher;
	}
	public String getBookInfo() 
	{
		String info = ("\nBook Name:" + getName() + "\nBook ISBN:" + getISBN() + 
						"\nBook Author Name:" + getAuthor() + "\nBook Publisher Name:" + getPublisher());
		return info;
	}
}
public class BookInfo
{
	public static void main(String[] args) 
	{ 
		Book i = new Book("Harry Potter", "9780747532743", "J.K.Rowling", "Bloomsberry Publising");
		System.out.println(i.getBookInfo());
	}
}