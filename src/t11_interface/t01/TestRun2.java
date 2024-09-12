package t11_interface.t01;

public class TestRun2 {
	public static void main(String[] args) {
		Test1 seoul = new Seoul();
		seoul.data();
		seoul.data2();
		System.out.println();
		
		Test1.data3();
		System.out.println();
		
		Test1 busan = new Busan();
		busan.data();
		busan.data1(500);
		busan.data1(5000000);
		busan.data1(-500);
		System.out.println("=======================");
		
		Test1[] test1 = {new Seoul(), new Busan()};
		for(int i=0; i<test1.length; i++) {
			test1[i].data();
			test1[i].data1(600);
			test1[i].data1(6000000);
			test1[i].data1(-600);
		}
	}
}
