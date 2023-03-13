package SYITB111;
import java.util.Scanner;
class averageCalculation{
	public int dayOfMonth;
	public float highTemp,lowTemp,amountRain,amountSnow;
	public averageCalculation(){
		dayOfMonth=0;
		highTemp=0;
		lowTemp=0;
		amountRain=0;
		amountSnow=0;
	}
	public averageCalculation(int dayOfMonth,float highTemp,float lowTemp,float amountRain,float amountSnow) {
		this.dayOfMonth=dayOfMonth;
		this.highTemp=highTemp;
		this.lowTemp=lowTemp;
		this.amountRain=amountRain;
		this.amountSnow=amountSnow;
	}
	public void inputs() {
		System.out.println("\nEnter the values for the particular day:");
		Scanner nw =new Scanner(System.in);
		dayOfMonth=nw.nextInt();
		System.out.println("\nEnter highest temperature for the particular day:");
		highTemp=nw.nextFloat();
		System.out.println("\nEnter lowest temperature for the particular day:");
		lowTemp=nw.nextFloat();
		System.out.println("\nEnter amount of rain for the particular day:");
		amountRain=nw.nextFloat();
		System.out.println("\nEnter amount of snow for the particular day:");
		amountSnow=nw.nextFloat();
		//nw.close();
	}
}
public class weatherReport {

	public static void main(String[] args) {
		
		int n;
		float sumhtemp=0f,sumltemp=0f,sumrain=0f,sumsnow=0f;
		Scanner ty=new Scanner(System.in);
		n=ty.nextInt();
		averageCalculation ny[];
		ny=new averageCalculation[n];
		System.out.println("\nEnter number of days data you want to input :");
		for(int i=0;i<n;i++) 
		{
			ny[i]=new averageCalculation();
			ny[i].inputs();
		}
		for(int i=0;i<n;i++) {
			sumhtemp=sumhtemp+ny[i].highTemp;
			sumltemp=sumltemp+ny[i].lowTemp;
			sumrain=sumrain+ny[i].amountRain;
			sumsnow=sumsnow+ny[i].amountSnow;
		}
		System.out.println("\n Average of highest temperature for"+ n +" days is : "+sumhtemp/n);
		System.out.println("\n Average of lowest temperature for"+n+" days is : "+sumltemp/n);
		System.out.println("\n Average of amount of rain for"+n+" days is : "+sumrain/n);
		System.out.println("\n Average of amount of snow for"+n+" days is : "+sumsnow/n);
		ty.close();
	}

}
