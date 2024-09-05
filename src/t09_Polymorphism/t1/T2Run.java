package t09_Polymorphism.t1;

public class T2Run {
	public static void main(String[] args) {
		Aa aa=new Aa();

		//Cc cc= a1;  // 처음부터 부모가 자식개체로 타입변환할수가 없다.

		// 부모객체가 자식객체로 타입변환을 하기위해서는 무조건 자식객체가 부모타입으로 변환했을때만 가능하다.(강제 Casting)
		Bb bb=new Bb();
		System.out.println("su : " +bb.su);
		Aa a1=bb;
		System.out.println("su : " +a1.su);
		System.out.println();

		Bb b1=(Bb)a1;//부모가 자식객체를 쓰고싶으면 강제캐스팅
		System.out.println("su : " +b1.su);
		System.out.println();

		Aa a2=new Dd();
		System.out.println("1.su : " +a2.su);
		System.out.println();

		Dd d1=(Dd) a2;
		System.out.println("2.su : " +d1.su);
		System.out.println();

		Bb b2=(Bb)a2;
		System.out.println("3.su : " +b2.su);
		b2.modAa();
		System.out.println();
		
		//Cc객체가 Aa로 타입변환된 적이 없기에, a2객체는 Cc객체로 타입변환불가이다.(컴파일상에서는 에러가 발생하지 않는다.-실행오류)
//		Cc c1=(Cc)a2;
//		System.out.println("su : " +c1.su);
//		System.out.println();
		
		//instanceof :과거에 부모객체로 타입변환이 되었는지를 알아보는 연산자(true/false)
		//Override적용시.
		Aa a3=new Bb(); //Up Casting
		System.out.println("4.su : " +a3.su);
		a3.modAa();
		System.out.println();
		
		Bb b3=(Bb) a3; //Down Casting
		System.out.println("5.su : " +b3.su);
		b3.modAa();
		
	}	
}
