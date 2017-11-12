package CIS3270.Chapter09;

public class Objects {
	public static void main(String[] args){
		
	/*	Car c1 = new Car("White", 3000);
		Car c2 = new Car("Yellow");
		Car c3 = new Car();
		
		
		c1.start();
		c2.start();
		
		System.out.println(c1.weight);
		System.out.println(c1.color);
		
		c1.color = "Red";
		c1.weight = 2000;
		*/
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(15);
		System.out.println(tv1.channel);
		System.out.println(tv1.volumeLevel);
		tv1.turnOff();	

	}


}
