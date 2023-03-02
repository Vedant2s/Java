package firstpackage;
import java.util.Scanner;
public class examples {

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
		/*System.out.println("enter the character");
		String str1 = reader.next();
		if(str1.charAt(0)=='a'||str1.charAt(0)=='e'||str1.charAt(0)=='i'||str1.charAt(0)=='o'||str1.charAt(0)=='u')
		System.out.println("the first char of the sting  "+str1+" is vowel");
		else
		System.out.println("the first char is char is  not vowel");*/
		/*System.out.println("enter the character");
		String str1 = reader.next();
		int length = str1.length();
		int count=0;
		int numy = length/2  ;
		if(length%2!=0)
			numy=numy-1;
		System.out.println("the "+numy);
		for(int i=0;i<=(numy);i++){
		    if((str1.charAt(i)!=str1.charAt((length)-i-1)))
		    {count=count+1;}
		}
		if(count==0)
			System.out.println("the string entered IS palindrome");
		else
			System.out.println("the string entered is NOT a palindrome"+count);*/
		int n=reader.nextInt();
		double[] rt =new double[n];
		System.out.println("enter the array of "+n+" numbers:");
		for(int i=0;i<n;i++) {
			rt[i]=reader.nextDouble();
		}
		double total=0;
		for(int i=0;i<n;i++) {
			total=total+rt[i];
		}
		//double average=total/n;
		System.out.format("the average of the entered no. is %.3f",total/n);
	}
}
