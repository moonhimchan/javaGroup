package t05_Static;

//import t04_method.Test5;
//import t04_method.Test6;//컨트롤+쉬프트+O는 import단축키이다.
import t04_method.*; //와일드카드이고 t04_method패키지를 모두대변한다.

public class Test4Run {
	public static void main(String[] args) {
		Test4 t4=new Test4();
		t4.mod1();
		
//		new t04_method.Test6();
		new Test6();
		new Test5(5);
		new t04_method.Test4();
	}
}
