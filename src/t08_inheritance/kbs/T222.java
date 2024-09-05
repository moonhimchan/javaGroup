package t08_inheritance.kbs;

import t08_inheritance.mbc.T111;

public class T222 extends T111 {
	public int a2=10;
	protected int b2=20;
	int c2=30;
	private int d2=40;

	public void modA2() {
		System.out.println("이곳은 T222클래스의 modA2메소드 입니다.");
	}
	protected void modB2() {
		System.out.println("이곳은 T222클래스의 modB2메소드 입니다.");
	}
	void modC2() {
		System.out.println("이곳은 T222클래스의 modC2메소드 입니다.");
	}
	private void modD2() {
		System.out.println("이곳은 T222클래스의 modD2메소드 입니다.");
	}

	@Override
	public void mul(int su1, int su2) {
		int res=su1*su2;
		//System.out.println("두수의 곱은 :" +(res+a1+b1+c1+d1));
		System.out.println("두수의 곱은 :" +(res+a1+b1));//b1은 패키지가 달라도 부모객체를 상속받았으며. b1은 protected선언되어 있기에 사용가능함.
	}
}
