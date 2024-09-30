package t24_LAmbda;

// 람다식을 구현하기 위해서는 '함수형(적)' 인터페이스'를 생성해준다.
// 함수령 인터페이스 : 추상메소드가 단 1개인 인터페이스이다.
// 함스형인터페이스의 선언 : @Functionalface

@FunctionalInterface
interface MyFun1 {
	int add(int x,int y);
	//int sub(int x,int y);
}

//public class Test1 implements MyFun1{
public class Test1 {
	public static void main(String[] args) {

	}

	//	@Override
	//	public int add(int x, int y) {
	//		// TODO Auto-generated method stub
	//		return 0;
	//	}
}