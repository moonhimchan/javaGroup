package t11_interface.t05;

public class Test2Run {
	public static void main(String[] args) {
		//new Test2();

		Test2 t22=new Test2() { //익명 클래스,익명 객체
			int atom=20;

			public void abc()	{
				int temp=atom;
				System.out.println("이곳은 Test2Run클래스의 t22익명객체안의 abc()메소드 입니다.");
				System.out.println("AA="+AA+", atom= " +atom+", temp="+temp);
			}
		}; //Test2()끝에 ();되어야 되는데 그게 생햑이 되어서 {};와 같이 중괄호에 넣는다.

		Test2 t23=new Test2() { 
			int atom=40;

			public void abc()	{ //추상메소드 오버라이드 해야된다.
				int temp=atom;
				System.out.println("이곳은 Test2Run클래스의 t22익명객체안의 abc()메소드 입니다.");
				System.out.println("AA="+AA+", atom= " +atom+", temp="+temp);
			}
		}; 

		// 익명객체안의 메소드 접근(호출)하기
		//메소드는 불러낼수 있지만,필드는 부를수 없음(익명객체안의 필드)
		//인터페이스 변수로 익명객체안의 필드와 인반변수는 접근 불가이다.
		//t22.atom은 호출불가
		t22.abc();
		System.out.println();
		t23.abc();
		System.out.println();

		if(t22==t23) System.out.println("같은 객체를 가리킵니다.");
		else System.out.println("서로 다른 객체를 가리킵니다.");
	}
}
