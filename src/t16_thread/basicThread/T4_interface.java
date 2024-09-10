package t16_thread.basicThread;

//2.Runnable 인터페이스 구현 방식
public class T4_interface {
	public static void main(String[] args) {
		System.out.println("스레드명 : " + Thread.currentThread().getName());
		//MyThread2 mt2=new MyThread2();
		Runnable mt2=new MyThread2();    // 3. Runnable 객체 생성
		Thread th1 = new Thread(mt2);    // 4. Thread객체를 생성하면서 Runnable객체변수를 매개값으로 대입한다.
		th1.start();                     // 5. start()메소드를 실행한다.
	}
}

class MyThread2 implements Runnable { // 1. Runnable 인터페이스를 구현하는 클래스를 정의
	@Override
	public void run() {   // 2. run()메소드를 오버라이드하여 수행할 스레드 코드를 작성
		System.out.println("스레드명 : " + Thread.currentThread().getName());	// 실행되는 스레드의 이름은 자동적으로 JVM이 Thread-0, 1,2... 붙여준다.
	}
}