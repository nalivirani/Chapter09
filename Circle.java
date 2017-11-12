package CIS3270.Chapter09;

public class Circle {
	
	private double radius = 10;
	
	public Circle(){
		
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	//getter or accessor
	public double getRadius(){
		return radius;
	}
	
	//setter or mutator
	public void setRadius(double r){
		radius = r;
	}

}
