package t24_LAmbda;

@FunctionalInterface
interface MyFunc8 {
	int calc(int x);
}

@FunctionalInterface
interface MyFunc8_circle {
	double calc(int r);
}

public class Test8 {
	public static void main(String[] args) {
		MyFunc8 myFunc8_1 = (x) -> x * x;
		System.out.println("10의 제곱은? " +myFunc8_1.calc(10));
		System.out.println("20의 제곱은? " +myFunc8_1.calc(20));
		
		MyFunc8 myFunc8_2= (x) -> x * x * x;
		System.out.println("10의 3제곱은? " +myFunc8_2.calc(10));
		System.out.println("20의 3제곱은? " +myFunc8_2.calc(20));
		System.out.println();
		
		MyFunc8_circle myFunc8_circle = (r) -> r * r * 3.14;
		System.out.println("반지름이 5의 원넓이? " + myFunc8_circle.calc(5));
		
		MyFunc8_circle myFunc8_circle2 = (r) -> r * r * Math.PI;
		System.out.println("반지름이 5의 원넓이? " + myFunc8_circle2.calc(5));
	}
}
