package t04_method;

import java.util.Scanner;

public class Test4_2Run {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int gas;
		Test4 t4=new Test4();

		if(t4.gas==0) {
			while(true) {
				System.out.println("가스를 주입하세요?");
				gas=scanner.nextInt();
				if(gas>0) {
					t4.gas=gas;
					t4.run();
					break;
				}
			}
		}
		else {
			t4.run();
		}
		System.out.println("작업끝...");
		scanner.close();
	}	
}


//기본소리:5
//소리조절:+-입력
//최소0이고 큰것은 10까지만
//+누를시 볼륨업

