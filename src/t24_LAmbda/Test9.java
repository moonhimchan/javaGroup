package t24_LAmbda;

@FunctionalInterface
interface MyFunc9 {
	int calc(int su1, int su2);
}

public class Test9 {
	public static void main(String[] args) {
		MyFunc9 add = (su1,su2) -> su1+su2;
		MyFunc9 sub = (su1,su2) -> su1-su2;
		MyFunc9 mul = (su1,su2) -> su1*su2;
		MyFunc9 div = (su1,su2) -> su1/su2;
		
		System.out.println("10+20 : " +add.calc(10, 20));
		System.out.println("10-20 : " +sub.calc(10, 20));
		System.out.println("10*20 : " +mul.calc(10, 20));
		System.out.println("10/20 : " +div.calc(10, 20));
	}
}
