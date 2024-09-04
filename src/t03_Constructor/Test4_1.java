package t03_Constructor;

public class Test4_1 {
	String model;
	String color="블랙";
	int speed;
	
	public Test4_1(String model) { //메소드1번
		this.model=model;
		this.color="흰색";
		this.speed=250;
	}
	public Test4_1(String model,	String color) { //
		this.model=model;
		this.color=color;
		this.speed=250;
	}
	public Test4_1(String model,	String color,int speed) { //
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
}
