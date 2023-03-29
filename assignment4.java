package SYITB111;
import java.util.Scanner;
public class salary {

	public static void main(String[] args) {
		int choice=0;
		long bp;
		Scanner input=new Scanner(System.in);
		do {
			System.out.println("what is the employees designation!\n 1.Programmer\n 2.Assistant professor\n 3.Professor");
			choice=input.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter the Programmers Base pay please\t");
				bp=input.nextLong();
				Programmer we =new Programmer(bp);
				we.Gincome();
			
				break;
			case 2:
				System.out.print("Enter the Assistant professors Base pay please\t");
				bp=input.nextLong();
				Assistant_Professor we1 =new Assistant_Professor(bp);
				we1.Gincome();
				break;
			case 3:
				System.out.print("Enter the Professors Base pay please\t");
				bp=input.nextLong();
				Professor we2 =new Professor(bp);
				we2.Gincome();
				break;
				
				
			}
		}while(choice!=0);
		input.close();
	}

}
class Employee{
	private String Emp_name,Address,Mail_id;
	private long Mobile_no;
	private static int Emp_id=1;
	public void  getdata(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Employee name\t");
		Emp_name=input.next();
		System.out.print("Enter the Employee Address\t");
		Address=input.next();
		System.out.print("Enter the Employee Mail ID\t");
		Mail_id=input.next();
		System.out.print("Enter the Employee Mobile number\t");
		Mobile_no=input.nextLong();
		
		
	}
	public void displaydata(double Gincome) {
		System.out.println("\n----------------------------------------------------------------------------\n");
		System.out.println("Employee name\t"+Emp_name);
		System.out.println("Employee Address\t"+Address);
		System.out.println("Employee Mail ID\t"+Mail_id);
		System.out.println("Employee Mobile number\t"+Mobile_no);
		System.out.println("Employee ID\t"+Emp_id++);
		System.out.println("Employee Gross Income\t"+Gincome);
		System.out.println("\n----------------------------------------------------------------------------\n");
		int choice;
		Scanner input=new Scanner(System.in);
		
	}
	
}
class Programmer extends Employee{
	//String Title,Copies;
	private long bp;
	double da,hra,pf,club,total;
	Employee they=new Employee();
	Programmer(long bp){
		this.bp=bp;
		da=(0.97)*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		club=0.001*bp;
		
	}
	public void Gincome() {
		they.getdata();
		total=da+hra+pf+club;
		they.displaydata(total);
		
	}
}
class Assistant_Professor extends Employee{
	private long bp;
	double da,hra,pf,club,total;
	Employee they=new Employee();
	Assistant_Professor(long bp){
		this.bp=bp;
		da=(0.97)*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		club=0.001*bp;
		
	}
	void Gincome() {
		they.getdata();
		total=da+hra+pf+club;
		they.displaydata(total);
		
	}
}
class Professor extends Employee{
	private long bp;
	double da,hra,pf,club,total;
	Employee they=new Employee();
	Professor(long bp){
		this.bp=bp;
		da=(0.97)*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		club=0.001*bp;
		
	}
	void Gincome() {
		they.getdata();
		total=da+hra+pf+club;
		they.displaydata(total);
		
	}
}
