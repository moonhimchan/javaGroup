package t03_Constructor;

public class Test3 {
 //기본생성자
 Test3() {}
	
	int atom1=30; //필드명
	
	
	
	//public Test3() {//기본생성자
	//	System.out.println("atom1 : " +atom1);
	//}
	
	public Test3(int atom1) {//사용자 정의 생성자>생성자 오버로딩
		this.atom1=atom1;  //this.(필드명) 그냥적으면 매게변수로 나온다.
		System.out.println("atom1 : " +atom1);
		System.out.println("this.atom1 : " +this.atom1);
		
		this.atom1+=atom1;
		System.out.println("this.atom1 : " + this.atom1);
	}

	
 // int atom1=30;	
	int atom2;
  double atom3;
  Test3(double atom3) { //public접근제한이다.
  	this.atom3=atom3;
  	System.out.println("this.atom3 : " +this.atom3);
  }
}


