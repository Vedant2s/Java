package SYITB111;
import java.util.Scanner;

public class complexCalculations {

	
	public static void main(String[] args) {
		int expression=5,choicep=1;
		float num1=0f,num2=0f;
		calculations cal=new calculations();
		Scanner input = new Scanner(System.in);
		
		do {
			
			if(choicep!=0) {System.out.println("Enter the first complex no.");
				num1= input.nextFloat();
			num2=input.nextFloat();}
			calculations object1= new calculations(num1,num2);
			if(choicep!=0) {
				System.out.println("Enter the second complex no.");
				num1= input.nextFloat();
			num2=input.nextFloat();}
			calculations object2= new calculations(num1,num2);
		System.out.println("Enter a choice(in int)\n1> Addition \n2> Subtraction\n3> Multiplication\n4> Division\n0> Exit");
		expression=input.nextInt();
		switch(expression){    
		case 1:    
			cal.addNumbers(object1, object2);
			System.out.println("do you want to update the complex number?(0/1)");
			choicep=input.nextInt();
		 break;    
		case 2:    
			cal.subtraction(object1, object2);
			System.out.println("do you want to update the complex number?(0/1)");
			choicep=input.nextInt();
		 break;        
		case 3:    
			cal.multiplication(object1, object2);
			System.out.println("do you want to update the complex number?(0/1)");
			choicep=input.nextInt();
		 break;
		case 4:    
			cal.division(object1, object2);
			System.out.println("do you want to update the complex number?(0/1)");
			choicep=input.nextInt();
		 break; 
		default: System.out.println("Enter a valid choice"); 
		System.out.println("do you want to update the complex number?(0/1)");
		choicep=input.nextInt();
		break;
		    
		} }while(expression!=0);
		
		input.close();
		
		
	}
	
}
class calculations{
	float real,imag;
	calculations(){
		real=0f;
		imag=0f;
	}
	calculations(float compl1,float compl2){
		real=compl1;
		imag=compl2;
	}
	public void addNumbers(calculations c1,calculations c2) {
		float real1,imag1;
		real1=(c1.real+c2.real);
		imag1=(c1.imag+c2.imag);
		System.out.println("the real part of result(addition) is "+real1+" imag part is "+imag1);
	} 
	public void subtraction(calculations c1,calculations c2) {
		float real1,imag1;
		real1=(c1.real-c2.real);
		imag1=(c1.imag-c2.imag);
		System.out.println("the real part of result(subtraction) is "+real1+" imag part is "+imag1);
	}
	public void multiplication(calculations c1,calculations c2) {
		float real1,imag1;
		real1=(c1.real*c2.real)-(c1.imag*c2.imag);
		imag1=(c1.imag*c2.real)+(c2.imag*c1.real);
		System.out.println("the real part of result(multiplication) is "+real1+" imag part is "+imag1);
	}
	public void division(calculations c1,calculations c2) {
		float real1,imag1;
		real1=((c1.real*c2.real)+(c1.imag*c2.imag))/(c2.real*c2.real+c2.imag*c2.imag);
		imag1=((c1.imag*c2.real)-(c2.imag*c1.real))/(c2.real*c2.real+c2.imag*c2.imag);
		System.out.println("the real part of result(multiplication) is "+real1+" imag part is "+imag1);
	}
}
