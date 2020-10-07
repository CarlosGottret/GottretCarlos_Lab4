/** 
*The purpose of this class is to model a television
*Carlos Mauricio Gottret Murillo October 6th, 2020
*/

public class Television {
	String manufacturer;
	int screenSize;
	boolean powerOn;
	int channel;
	int volume;
	
	public Television(String brand, int size) {
		manufacturer=brand;
		screenSize=size;
		powerOn=false;
		channel=2;
		volume=20;
	}
	public void setChannel(int station) {
		channel=station;
	}
	public void power() {
		powerOn = !powerOn;
	}
	public void increaseVolume() {
		volume++;
	}
	public void decreaseVolume() {
		volume--;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getScreenSize() {
		return screenSize;
	}
}
