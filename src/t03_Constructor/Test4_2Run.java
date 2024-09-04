package t03_Constructor;

public class Test4_2Run {
	public static void main(String[] args) {	
	Test4_1 t41=new Test4_1("그랜져");
	System.out.println("모델명 : " +t41.model);
	System.out.println("색상명 : " +t41.color);
	System.out.println("최대속도 : " +t41.speed);	
	System.out.println();
	
	Test4_1 t42=new Test4_1("제니시스", "은색",600);
	System.out.println("모델명 : " +t42.model);
	System.out.println("색상명 : " +t42.color);
	System.out.println("최대속도 : " +t42.speed);	
	System.out.println();
	
	Test4_1 t43=new Test4_1("렉서스", "군청색",300);
	System.out.println("모델명 : " +t43.model);
	System.out.println("색상명 : " +t43.color);
	System.out.println("최대속도 : " +t43.speed);	
	System.out.println();
 }
}