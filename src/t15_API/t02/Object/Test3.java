package t15_API.t02.Object;

public class Test3 {
	public static void main(String[] args) {
		int i, tot=0;

		for(i=1; i<=1000000; i++) {
			tot+=i;
			if(tot>=10000) {
				System.out.println("합이 10000 이상일때의 i값은? " +i);
				//break;
				//return;
				System.exit(0); //main의 실행을 멈춤 (즉, 강제종료)
			}
		}
		System.out.println("tot : " +tot);
	}
}
