package t18_Collection.t11_ex;

import java.util.HashSet;

public class T05_Lotto {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>(); //Integar  

		int temp;

		while(true) {
			temp=(int)(Math.random()*45)+1;
			lotto.add(temp);
			if(lotto.size()==6) break;
		}
		System.out.println("금주의 로또 번호는?");
		for(int su : lotto) {
			System.out.print(su+"/");
		}
		
//		for(int i=1; i<5; i++) {
//			for(int j=i+1; j<=6; j++) {
//				if()
//			}
//		}
	}
}

