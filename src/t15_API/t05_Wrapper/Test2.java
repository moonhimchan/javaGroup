package t15_API.t05_Wrapper;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		Random random=new Random();
		System.out.println(random.nextInt());     // 2의 32승의 정수형난수
		System.out.println(random.nextLong());    // 2의 64승의 정수형난수
		System.out.println(random.nextDouble());	// 실수형 난수
		System.out.println(random.nextFloat());		// 실수형 난수
		System.out.println(random.nextBoolean()); // 논리형 난수
		System.out.println();
		
		System.out.println("0~10미만의 정수 : " +random.nextInt(10));
		System.out.println("1~10 정수 : " +(random.nextInt(10)+1));
		System.out.println("5~10 정수 : " +(random.nextInt(10+1-5)+5));
		System.out.println("20~30 정수 : " +(random.nextInt(30+1-20)+20));
		System.out.println();
		
		Random rnd = new Random(100);  //로또조작
		for(int i=1; i<=6; i++) {
			System.out.print(rnd.nextInt(45+1-1)+1 + " ");
		}
	}
}
