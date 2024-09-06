package t12_nested.t01;

// 중첩클래스 : 인스턴스 멥버 클래스
public class Test1 {
	int su=100; //전역변수

	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다.");
	}

	public void modTest1() {
		int su=150; //지역변수
		if(su>0) {
			//int su =200;  //지역변수
			System.out.println("su : " +su);
		}
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다.");
	}

	public class Aa {
		//int su=200; //전역변수 필드 (O)
		int suA=200;

		public Aa() {
			System.out.println("이곳은 Test1중첩클래스 Aa의 기본생성자입니다.");
		}

		public void modTest1A() {
			System.out.println("이곳은 Test1클래스안의 중첩클래스의 modTest1A()메소드 입니다.");
		}
	}

	public class Bb {

	}
}

//위의 중첩클래스와 다름
class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}