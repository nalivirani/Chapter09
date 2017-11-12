package CIS3270.Chapter09;

public class TV {
	
	int channel;
	int volumeLevel;
	boolean on;
	
	public TV(){
		channel = 0;
		volumeLevel = 0;
		on = true;
	}
	
	public void turnOn() {
		on = true;
		System.out.println("Your tv is now on.");
	}
	public void turnOff() {
		on = false;
		System.out.println("Your tv is now off.");
	}
	public void setChannel(int newChannel) {
		channel = newChannel;
	}
	public void setVolume(int newVolumeLevel) {
		volumeLevel = newVolumeLevel;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void volumeUp() {
		volumeLevel++;
	}
	public void volumeDown() {
		volumeLevel--;
	}

}
