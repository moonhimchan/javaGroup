package t24_LAmbda;
	 
@FunctionalInterface
interface MyFunc3 {
	int add(int x, int y);
}	 
	
public class Test3 {
	 
	public Test3(int x,int y) {
		MyFunc3 myFunc3=new MyFunc3() {
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		
		int res=myFunc3.add(x, y);
		System.out.println("두수의 합: " +res);
	}
	 
	public static void main(String[] args) {	
	  new Test3(20,30);
	}
} 
