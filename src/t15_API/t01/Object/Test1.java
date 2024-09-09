package t15_API.t01.Object;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		// HashMap : Collection Framework의 한종류 - 키(Key)와 Value(값)으로 데이터를 표현
		// Generic : 하위 타입을 정의
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "데이터1");
		map.put(1, "데이터2");
		map.put(2, "데이터3");
		System.out.println(map);
		
		HashMap<Aa, String> map2=new HashMap<>();
		map2.put(new Aa("첫번째"), "홍길동");
		map2.put(new Aa("첫번째"), "김말숙");
		map2.put(new Aa("두번째"), "이기자");
		map2.put(new Aa("두번째"), "이기자");
		System.out.println(map2);
		// 출력결과 : 객체주소(hashcode)를 통한 자료의 저장/처리
		//{t15_API.Object.Aa@7852e922=이기자, t15_API.Object.Aa@15db9742=홍길동, t15_API.Object.Aa@6d06d69c=김말숙, t15_API.Object.Aa@4e25154f=이기자}
	}
}

class Aa {
	String name;

	public Aa(String name) {
		this.name=name;
	}	
}

class Bb {
	String name;

	public Bb(String name) {
		this.name=name;
	}
}