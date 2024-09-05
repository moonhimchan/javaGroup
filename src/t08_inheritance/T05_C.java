package t08_inheritance;

public class T05_C extends T05_P {

	@Override
	void areaCircle(int r) {

	}

	@Override
	void div(int su1, int su2) { //final이 부모의 메소드를 상속받지 못한다.
		//super.div(su1, su2); //자식 메소드 사용하지 않고, 부모메소드 사용하기
		double res=(double) su1/su2;
		System.out.println("res : " +res);
	}


}
/*부모재산을 재정의해서 사용하는게 오버라이드이다.
  오버라이드는 메소드 밖에 없다.  */
//부모가 아닌 자식것을 실행시킴 오버라이드는 메소드의 선언부가 똑같아야 한다.