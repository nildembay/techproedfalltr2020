package day16constructors;

public class Car {

	int price;
	int year;//yaþ
	String make;//marka
	String model;
	String color;
	boolean isDiesel;//dizel mi
	double km;//km
	
	public Car(int price,int year, String make, boolean isDiesel) {
		this.price=price;
		this.year=year;
		this.make=make;
		this.isDiesel=isDiesel;
	}
		
	public Car(int price,int year, String make,String model,String color, boolean isDiesel,double km) {
			this.price=price;
			this.year=year;
			this.make=make;
			this.isDiesel=isDiesel;
			this.color=color;
			this.model=model;
			this.km=km;
		
	}
	public static void main(String[] args) {
		
		Car car1=new Car(5000,2018,"toyota",true);
		System.out.println(car1.price);
		System.out.println(car1.year);
		System.out.println(car1.make);
		System.out.println(car1.isDiesel);
		
		Car car2=new Car(80000,2020,"audi",false);
		System.out.println(car2.price);
		System.out.println(car2.year);
		System.out.println(car2.make);
		System.out.println(car2.isDiesel);
		
		Car car3=new Car(30000, 2017, "bmw", "3.35i", "red", false, 50000);
		System.out.println(car3.price);
		System.out.println(car3.year);
		System.out.println(car3.make);
		System.out.println(car3.isDiesel);
		System.out.println(car3.color);
		System.out.println(car3.model);
		System.out.println(car3.km);
		
		
		
	}

}
