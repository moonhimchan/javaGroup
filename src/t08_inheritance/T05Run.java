package t08_inheritance;

public class T05Run {
	public static void main(String[] args) {
		T05_C t5=new T05_C();

		t5.areaCircle(10);
		
		t5.div(15, 4);
		
		
		System.out.println("main 끝...");
	}
}//접근제한자가 없으면 default로 간주한다(다른패키지에서 접근제한)
