/*class car having attributes type color fuel tank
create a object and initialize members with the help of constructor*/
public class PFC11 {
public static	void main(String[] args) {
		CAR[] obj= new CAR[22];
		obj[1]=new CAR();
		System.out.println(obj[1].type);
		obj[2]=new CAR("Suv","Silver","Nitrogen");
		System.out.println(obj[2].fuelType);
		obj[3]=new CAR(obj[1]);
		System.out.println(obj[3].fuelType);
	}
}
class CAR{
	String type,color,fuelType;
	CAR(){
		type="Sedan";
		color="Red";
		fuelType="Petrol";
	}
	CAR(String Type,String Color,String FuelType){
		type=Type;
		color=Color;
		fuelType=FuelType;
	}
	CAR(CAR c){
	    type=c.type;
		color=c.color;
		fuelType=c.fuelType;
	}
}
