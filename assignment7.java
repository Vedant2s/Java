//package ASSIGNMENT_7;
import java.util.Scanner;
public class ASS_7 {

	public static void main(String[] args) {
		int ch=0,ns;
		System.out.print(" enter the size of stack \t");
		Scanner n =new Scanner(System.in);
		ns=n.nextInt();
		stack ob1 =new stack(ns);
		do {
		System.out.print(" enter the choice :\n 1.push\n 2.pop");
		ch=n.nextInt();
		switch(ch) {
		case 1:
			System.out.print(" enter the number you want to push in the stack(0 is not allowed)\n");
			int nes=n.nextInt();
			ob1.push(nes);
			break;
		case 2:
		    int x= ob1.pop();
			if(x!=0)
				System.out.print(" poped item from the stack\t"+x);
			else
				System.out.print("UNDERFLOW DETECTED\n");
			break;
		}
		}while(ch!=0);
	}
}

class stack{
	private int top,n,stack[];
	stack(int n){
		top=-1;
		this.n=n;
		stack= new int[this.n];
		
	}
	public  void push(int a) {
		if(top+ 1==n)
		System.out.print("OVERRFLOW DETECTED\n");
		if(a!=0&&top<n-1)
		stack[++top]=a;
		
	}
	public int pop() {
		if((top-1)>=-1)
		return stack[top--];
		else 
			return 0;
	}
}

