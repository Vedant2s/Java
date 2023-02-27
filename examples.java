import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter the number:");
		//int length=reader.nextInt();
		//int breadth=reader.nextInt();
		//System.out.println("area of given rectangle is "+length*breadth);
		//float radius=reader.nextFloat();
		//System.out.println("area of given circle is "+(3.14)*radius*radius);
		/*int a=reader.nextInt();
		int b=reader.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("now first number enetered has value "+a+"now second number enetered has value "+b);*/
		/*int a=reader.nextInt();
		int b=reader.nextInt();
		a=a+b;    
        b=a-b;   
        a=a-b;
		System.out.println("now first number enetered has value "+a+" now second number enetered has value "+b);*/
		/*int a=reader.nextInt();
		if(a%2==0)
		System.out.println("the entered number is even");
		else
		System.out.println("the entered number is odd");*/
		/*System.out.println("enter the character");
	    char c = reader.next().charAt(0);
		System.out.println("the entered char has ASCII value as "+(int)c);*/
		System.out.println("enter the character");
		String str1 = reader.next();
		if(str1.charAt(0)=='a'||str1.charAt(0)=='e'||str1.charAt(0)=='i'||str1.charAt(0)=='o'||str1.charAt(0)=='u')
		System.out.println("the first char of the sting  "+str1+" is vowel");
		else
		System.out.println("the first char is char is  not vowel");
		
	}
}
