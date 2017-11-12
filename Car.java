package CIS3270.Chapter09;

public class Car {
	
	public String color;
	public double weight;
	
	public Car(String c){
		color = c;
		weight = 1000;
	}
	
	//no-arg constructor
	public Car(){
		 color = "Black";
		 weight = 1000;
		
	}
	
	//constructor
	public Car(String c, double w){
		color = c;
		weight = w;
	}
	
	//method
	public void start() {
		System.out.println("Zoom Zoom!!");
	}
	
	//method
	public void stop() {
		System.out.println("Stopping.....");
	}

}
