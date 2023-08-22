/*create a class stack perform necessary operations and there exception for stack underflow and overflow dispolay proper error message*/
import java.util.*;
import java.util.Scanner;
public class second_assignmnet
{

  public static void main (String[]args)
  {
    int choice = 0, number = 0;
    Scanner t = new Scanner(System.in);
    stack obj1 = new stack ();
    do
      {
	System.out.println ("Enter your choice \n" +
			    "1.push\n2.pop\n3.display stack\n0.exit");
	choice = t.nextInt ();
	switch (choice)
	  {
    	  case 1:
    	    System.out.println ("Enter the number to be pushed in the stack");
    	    number = t.nextInt ();
    	    try{
    	    obj1.push (number);}
    	    catch(Exception ArrayIndexOutOfBoundsException){
    	        System.out.println("Overflow detected!!");
    	        obj1.decrement();
    	    }
    	    break;
	    case 2:
	        try{obj1.pop ();}
	        catch(Exception ArrayIndexOutOfBoundsException){
    	        System.out.println("Underflow detected!!");
    	        obj1.increment();
    	    }
	        break;
	    case 3:
	        obj1.display ();
	        break;
	    case 0:
	        System.out.println ("program has been terminated");
	        break;
	    default:
	    System.out.println("Incorrect choice!!");
	    break;
	        

	  }
      }
    while (choice != 0);
  }
}

class stack
{
   int stackInt[] = new int[2];
   int top = 0;
    stack ()
  {
    System.out.println ("Welcome to our program!!");
  }
  public void push (int n)
  {
    stackInt[top++] = n;
  }
  public void pop ()
  {
    System.out.println (stackInt[--top]  + " has been poped out");
  }
  public void display ()
  {
    System.out.println ("The stack is : ");
    for (int p = 0; p < top; p++)
      System.out.println (stackInt[p]);
  }
  public void decrement(){
      top--;
  }
  public void increment(){
      top++;
  }
}
