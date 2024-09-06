package t11_interface.t01;

public class Seoul implements Test1 {//interface에서 상속은 implements이다.

	@Override
	public void data() {
		System.out.println("이곳은 Seoul클래스의 data메서드 입니다.");
	}

	@Override
	public void data1(int su) {}
}
