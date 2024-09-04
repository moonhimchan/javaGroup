package t04_method;

public class Test6 {
	int su; 
	
	public Test6() {} //기본생성자 public접근제한자

	public void mod1() {
		System.out.println("이곳은 Test6클래스의 mod1 메소드 입니다.");
		
		//mod2()메소드 호출
		mod2(su);
	}
	private void mod2(int su) {
		System.out.println("이곳은 Test6클래스의 mod1 메소드 입니다.su=" + su);		
	}

  String integerCheck(int su) {
  	String check="0";
  	if(su>0) check="양수";
  	else if(su<0) check="음수";
  	
		return check;
	}
	
//	void mod() {
//		System.out.println("이곳은 Test6클래스의 mod1 메소드 입니다.");
//	}
}
