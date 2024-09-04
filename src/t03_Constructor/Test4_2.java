package t03_Constructor;

public class Test4_2 {
	String model;
	String color="블랙";
	int speed;
	
	public Test4_2(String model) { //메소드1번
//		this.model=model;
//		this.color="흰색";
//		this.speed=250;
		this(model, "흰색", 250);
	}
	
	public Test4_2(String model,	String color) { //#2
//		this.model=model;
//		this.color=color;
//		this.speed=250;
		this(model, color, 250);
	}
	
	public Test4_2(String model,	String color,int speed) { // #3   
		this.model=model;  //this() 내가 사용한 생성자를 부른다
		this.color=color;  //this. 내가 사용한 필드를 부른다.
		this.speed=speed;  //매게변수 가장 큰거는 그대로 둔다.
		
	}
}
