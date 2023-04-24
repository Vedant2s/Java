package prv;
import java.util.*;
public class assignment6 {

	public static void main(String[] args) {
		int choice=0,a=0,ch=0;
		Vehicle v;
		
		Scanner in=new Scanner(System.in);
		do{
			System.out.println("selct what you want \n1.Cycle\n2.Bike\n3.Car");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				Bicycle b=new Bicycle();
				v=b;
				//inputing.input(v);
				do {
				System.out.println("selct what you want \n1.Change gear\n2.change speed\n3.apply break\n4.dispaly");
				ch=in.nextInt();
				if(ch==1) {System.out.print("do you want to gear up(1) or down(0)?\t");
				a=in.nextInt();
				System.out.print("Enter the number of gears you weant to change\t");
				a=in.nextInt();
				if(a==0) {
					v.changeGear(-a);
				}
				else
					v.changeGear(a);}
				if(ch==2) {System.out.print("By how much do you want to speed up\t");
				a=in.nextInt();
				v.speedUp(a);}
				if(ch==3) {System.out.print("Do you want to bring the vehicle to halt?(0/1)\t");
				a=in.nextInt();
				if(a==1)
					v.applyBreak(990);
				else {
				System.out.print("By how much do you want to decrease the speed by breaking\t");
				a=in.nextInt();
				v.applyBreak(a);}}
				if(ch==4) {
					v.Display();
				}}while(ch!=0);
				break;
			case 2:
				Bike B=new Bike();
				v=B;
				do {
					System.out.println("selct what you want \n1.Change gear\n2.change speed\n3.apply break\n4.dispaly");
					ch=in.nextInt();
					if(ch==1) {System.out.print("do you want to gear up(1) or down(0)?\t");
					a=in.nextInt();
					System.out.print("Enter the number of gears you weant to change\t");
					a=in.nextInt();
					if(a==0) {
						v.changeGear(-a);
					}
					else
						v.changeGear(a);}
					if(ch==2) {System.out.print("By how much do you want to speed up\t");
					a=in.nextInt();
					v.speedUp(a);}
					if(ch==3) {System.out.print("Do you want to bring the vehicle to halt?(0/1)\t");
					a=in.nextInt();
					if(a==1)
						v.applyBreak(990);
					else {
					System.out.print("By how much do you want to decrease the speed by breaking\t");
					a=in.nextInt();
					v.applyBreak(a);}}
					if(ch==4) {
						v.Display();
					}}while(ch!=0);
					break;
				
			case 3:
				Car c=new Car();
				v=c;
				do {
					System.out.println("selct what you want \n1.Change gear\n2.change speed\n3.apply break\n4.dispaly");
					ch=in.nextInt();
					if(ch==1) {System.out.print("do you want to gear up(1) or down(0)?\t");
					a=in.nextInt();
					System.out.print("Enter the number of gears you weant to change\t");
					a=in.nextInt();
					if(a==0) {
						v.changeGear(-a);
					}
					else
						v.changeGear(a);}
					if(ch==2) {System.out.print("By how much do you want to speed up\t");
					a=in.nextInt();
					v.speedUp(a);}
					if(ch==3) {System.out.print("Do you want to bring the vehicle to halt?(0/1)\t");
					a=in.nextInt();
					if(a==1)
						v.applyBreak(990);
					else {
					System.out.print("By how much do you want to decrease the speed by breaking\t");
					a=in.nextInt();
					v.applyBreak(a);}}
					if(ch==4) {
						v.Display();
					}}while(ch!=0);
					break;
			}
			
		}while(choice!=0);

	}

}
interface Vehicle{ 
	public void changeGear(int a);
	 public void speedUp(int a);
	 public void applyBreak(int a);
	public void Display();
}

class Bicycle implements Vehicle{
	int gear=0,gear_max=7;
	float speed=0,speed_max=90;
	public void changeGear(int a) {
		if(gear+a<gear_max&&gear+a>0) {
		System.out.println("the cycle has now changed gear from "+gear+" to "+(gear+a));
		gear=gear+a;}
		else {
			System.out.println("the cycle has only "+gear_max+" gears so it has now changed gear to its max value");
		gear=gear_max;}
	}
	public void speedUp(int a) {
		if(speed+a<speed_max) {
		System.out.println("the cycle has now changed speed from "+speed+" to "+(speed+a));
		speed=speed+a;}
		else {
			System.out.println("the cycle has max speed of only "+gear_max+"Km/h"+" so it has now changed speed to its max value");
		speed=speed_max;}
	}
	public void applyBreak(int a) {
		if(speed-a>0) {
		System.out.println("the cycle has now changed speed from "+speed+" to "+(speed-a));
		speed=speed-a;}
		else {
			System.out.println("the cycle has now changed speed from "+speed+" to "+"0");
			speed=0;
		}
	}
	public void Display() {
		System.out.println("Cycle is currently in gear "+gear);
		System.out.println("Cycle has currently speed of "+speed+" Km/h");
	}
	
}
class Bike implements Vehicle{
	int gear=0,gear_max=7;
	float speed=0,speed_max=250;
	public void changeGear(int a) {
		if(gear+a<gear_max) {
		System.out.println("the Bike has now changed gear from "+gear+" to "+(gear+a));
		gear=gear+a;}
		else {
			System.out.println("the Bike has only "+gear_max+" gears so it has now changed gear to its max value");
		gear=gear_max;}
	}
	public void speedUp(int a) {
		if(speed+a<speed_max) {
		System.out.println("the Bike has now changed speed from "+speed+" to "+(speed+a));
		speed=speed+a;}
		else {
			System.out.println("the Bike has max speed of only "+gear_max+"Km/h"+" so it has now changed speed to its max value");
		speed=speed_max;}
	}
	public void applyBreak(int a) {
		if(speed-a>0) {
		System.out.println("the Bike has now changed speed from "+speed+" to "+(speed-a));
		speed=speed-a;}
		else {
			System.out.println("the Bike has now changed speed from "+speed+" to "+"0");
			speed=0;
		}}
	public void Display() {
		System.out.println("Bike is currently in gear "+gear);
		System.out.println("Bike has currently speed of "+speed+" Km/h");
	}
	
}
class Car implements Vehicle{
	int gear=0,gear_max=6;
	float speed=0,speed_max=200;
	public void changeGear(int a) {
		if(gear+a<gear_max) {
		System.out.println("the Car has now changed gear from "+gear+" to "+(gear+a));
		gear=gear+a;}
		else {
			System.out.println("the Car has only "+gear_max+" gears so it has now changed gear to its max value");
		gear=gear_max;}
	}
	public void speedUp(int a) {
		if(speed+a<speed_max) {
		System.out.println("the Car has now changed speed from "+speed+" to "+(speed+a));
		speed=speed+a;}
		else {
			System.out.println("the Car has max speed of only "+gear_max+"Km/h"+" so it has now changed speed to its max value");
		speed=speed_max;}
	}
	public void applyBreak(int a) {
		if(speed-a>0) {
		System.out.println("the Car has now changed speed from "+speed+" to "+(speed-a));
		speed=speed-a;}
		else {
			System.out.println("the Car has now changed speed from "+speed+" to "+"0");
			speed=0;
		}}
	public void Display() {
		System.out.println("Car is currently in gear "+gear);
		System.out.println("Car has currently speed of "+speed+" Km/h");
	}
	
}
