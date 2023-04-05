package SYITB111;
import java.util.*;
public class Assign3 {

	public static void main(String[] args) {
		book b=new book();
		magazine m=new magazine();
		int choice=0,c2=0;
		//magazine b=new magazine();
		Scanner inp =new Scanner(System.in);
		do {
			System.out.println("Enter the textbook type you want\n1.Book\n2.Magazine\n3.Total sale\n0.Exit");
			choice=inp.nextInt();
			switch(choice) {
			case 1:
				b.getData();//author of book then readpubl
				break;
			case 2:
				m.readpubl();//no author required
				break;
			case 3:
				System.out.println("total sale of books + mag is = "+b.gettotal()+" * "+b.getprice()+" + " +m.gettotal()+" * "+m.getprice()+" = "+(b.gettotal()*b.getprice()+m.gettotal()*m.getprice()));	
				break;
			case 0:
				break;
			}
			if (choice!=0)do{
				System.out.println("Type what you want to see\n1.Display details\n2.Sale of copy\n3.Order copies\n0.Exit");
			
			c2=inp.nextInt();
			switch(c2) {
			case 1:
				if(choice==1)
				b.disp();//display with author
				else
					m.display();//normal display
				break;
			case 2:
				System.out.println("Enter the no. of copies do you want to buy \n");
				int c23=inp.nextInt();
				if(choice==1) {
					
					b.saleCopy(c23);
					}
					else
					m.recieveissue(c23);//same as salecopy
				break;
			case 3:
				
				if(choice==1) {
					System.out.println("Enter the no. of copies do you want to place order form \n");
					c2=inp.nextInt();
					b.orderCopies(c2);
					}
					else
					m.getData();//uses given orderQty variable,same work
				break;
				}}while(c2!=0);
				
			c2=1;//so that it can enter the loop next time
		}while(choice!=0);
			
		}	
}


class publication {
	String Title;
	float price;
	int copies=100,total;
	public void saleCopy(int copies) {
		//total amount sold in inr
		//copies=100;
		if(this.copies-copies>0)//if book stock is enough or not
		{this.copies=this.copies-copies;
		total=total+copies;}
		else
			System.out.print("this book is out of stock of the book \n");
		
		
	}
	public float getprice() {
		return price;
	}
	public int gettotal() {
		return total;
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
		System.out.println("The title of the book is "+Title);
		System.out.print("The amount of the book purchased is "+total+" you have to pay "+total*price+" ");
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
		
		author=inp.nextLine();
		readpubl();
		//System.out.print("Enter the price of the book\n");
		//price=inp.nextFloat();
		//System.out.print("Enter the amount of this book you want to purchase\n");
		//int a=inp.nextInt();
		//orderCopies(a);
		
	}
	public void disp() {
		display();
		System.out.println("author name "+author);
		
	}
}
class magazine extends publication {
	
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
		System.out.println("No. of copies available = "+x);
		//Currentissue(a);
		//readpubl();
		
	}
	
}
