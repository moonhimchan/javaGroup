package t16_thread.basicThread;

//1.Thread 클래스를 상속받아서 클래스를 정의한다.
public class T3_thread1 {
public static void main(String[] args) {
	System.out.println("현재 실행중인 스레드명 : " + Thread.currentThread().getName());
	MyThread1 mt1 = new MyThread1();		// 3.스레드 객체 생성
	//mt1.run();
	mt1.start();		// 4. 스레드 실행(run메소드가 아닌 start()메소드를 이용한 스레드 호출
}
}

class MyThread1 extends Thread {	// 1. Thread클래스를 상속한 클래스 정의
@Override
public void run() {		// 2. run()메소드를 오버라이드하여 스레드 처리에 필요한 코드를 작성
	System.out.println("스레드명 : " + this.getName());	// 실행되는 스레드의 이름은 자동적으로 JVM이 Thread-0, 1,2... 붙여준다.
}
}