package t05_Static;

public class Test2Run {
	public static void main(String[] args) {
		Test2 t2=new Test2("222-555");
		System.out.println("nation : " +t2.nation);
		
//		t2.nation="USA"; //The final field Test2.nation cannot be assigned
//		System.out.println("nation : " + t2.nation);
		
//	  t2.jumin="123-456";
		System.out.println("jumin : " +t2.jumin);
	}
}
