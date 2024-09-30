package t24_LAmbda;

// 람다식을 이용하여 제곱값을 구하시오. (5를 입력받으면 5*5=25)
@FunctionalInterface
interface MyFunc7 {
	int calc(int x);
}

public class Test7 {
	public static void main(String[] args) {
		MyFunc7 myFunc7=(x) -> x*x;
		System.out.println("5의 제곱은? : " +myFunc7.calc(5));
		
		
		//MyFunc7 myFunc7=(int x) -> x*x;
    //int res=myFunc7.calc(5);
		//System.out.println("res : " +res);
	}
}
