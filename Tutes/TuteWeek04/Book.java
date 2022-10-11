import java.util.*;

public class Book implements IDisplay,IInput {
	int bookID;
	String title;
	String publisher;
	Scanner s1 = new Scanner(System.in);
	public void input() {
		System.out.println("enter the book ID,title,publisher :");
		
		this.bookID = s1.nextInt();
		s1.nextLine();
		this.title = s1.nextLine();
		this.publisher= s1.nextLine();
	}
	public void print() {
		System.out.println("This is "+this.title);
	}
	 public void printDetails() {
		 System.out.println("book ID"+this.bookID);
		 System.out.println("book itle :"+this.title);
		 System.out.println("publisher :"+this.publisher);
	 }
	 
	 public static void main(String[] args) {
		 Book b1 = new Book();
		 
		/* b1.input();
		 b1.print();
		 b1.printDetails();*/
		 
		 IDisplay ID = new Book();
		 IInput IN = new Book();
		 b1.input();
		 b1.print();
		 b1.printDetails();
		
	 }
	
}
