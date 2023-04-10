//package prv;
import java.util.*;
public class A5areart {
	public static void main(String[] args) {
	int choice=0;
	Scanner nty=new Scanner(System.in);
	shape s;
	
	do{
		System.out.println("Enter your choice\n1.Rectangle area computation\n2.Triangle area computation\n0.Exit");
		choice=nty.nextInt();
		switch(choice) {
		case 1:
			rectangle r=new rectangle();
			s=r;
			s.computeArea();
			break;
		case 2:
			triangle t=new triangle();
			s=t;
			s.computeArea();
			break;
		default:
			System.out.println("Invalid choice!!");
			break;
		}
	}while(choice!=0);
}}
abstract class shape{
	abstract public void computeArea();
	double first,second;
}
class rectangle extends shape{
	//public rectangle(){}
	public void computeArea() {
		//double length,breadth;
		Scanner n=new Scanner(System.in);
		System.out.println("enter the length and breadth of rectangle");
		first=n.nextDouble();
		second=n.nextDouble();
		System.out.println("Area of rectangle:"+first*second);
	}
}
class triangle extends shape{
	//public triangle() {}
	public void computeArea() {
		Scanner n=new Scanner(System.in);
		System.out.println("enter the base and heigth of rectangle");
		first=n.nextDouble();
		second=n.nextDouble();
		System.out.println("Area of rectangle:"+0.5*first*second);
	}
}
