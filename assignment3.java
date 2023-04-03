package SYITB111;
import java.util.*;
public class Assign3 {

	public static void main(String[] args) {
		book b=new book();
		magazine m=new magazine();
		int choice=0;
		Scanner inp=new Scanner(System.in);
		do {
			System.out.println("Enter the textbook type you want\n1.Book\n2.Magazine");
			choice=inp.nextInt();
			switch(choice) {
			case 1:
				
			}
		}while(choice!=0);
	}

}
class publication {
	String Title;
	float price;
	int copies,total;
	public void saleCopy(int copies) {
		//total amount sold in inr
		//copies=100;
		this.copies=this.copies-copies;
		total=total+copies;
		
		
	}
	public float getprice() {
		return price;
	}
	public void readpubl() {
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the title of the book \n");
		Title=inp.nextLine();
		//author=inp.nextLine();
		System.out.print("Enter the price of the book\n");
		price=inp.nextFloat();
	}
	public void setcopies(int copies) {
		this.copies=copies;
	}
	public int getcopies() {
		return copies;
	}
	public void display() {
		System.out.print("The title of the book is \n"+Title);
		System.out.print("The amount of the book purchased is "+total+" you have to pay "+total*price);
	}
	
	
}
class book extends publication {
	String author;
	//float price;
	//int copies=100;
	/*public void saleCopy() {
		if (copies==0)
		copies=100;
		System.out.println("Amount of revenue generatred by selling copy "+(100-copies)*price);
	}*/
	public void orderCopies(int copies) {
		//this.copies=this.copies+copies;
		//order=copies;
		int x= getcopies() + copies;
		setcopies(x);
		System.out.println("No. of copies available = "+x);
	//	saleCopy();
	}
	public void getData(){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the Author of the book \n");
		//Title=inp.nextLine();
		author=inp.nextLine();
		//System.out.print("Enter the price of the book\n");
		//price=inp.nextFloat();
		//System.out.print("Enter the amount of this book you want to purchase\n");
		//int a=inp.nextInt();
		//orderCopies(a);
	}
	public void disp() {
		display();
		System.out.print("author name "+author);
		
	}
}
class magazine extends publication {
	String Title;
	float price;
	int orderQty,Currentissue;
	
	public void recieveissue(int issue) {
		//System.out.println(order);
		Currentissue=issue;
		saleCopy(Currentissue);
	}
	public void getData(){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the amount of this book you want to purchase\n");
		orderQty=inp.nextInt();
		int x= getcopies() + orderQty;
		setcopies(x);
		//Currentissue(a);
		
	}
	
}
