package t18_Collection.t05_Map;

import java.util.HashMap;

/*
  Map계열 자료구조 : 사전식자료구조,Web에서으ㅢ Json데이터형식과 같다.
  순서와 관계없다. '키'와 '값'으로 구성된 자료구조이다. 자료'검색/삭제/수정'시에 '키'를 이용한다.
  중복 =>'키'는 중복불가, '값'은 중복가능
*/
public class Test1_HashMap {
	public static void main(String[] args) {
		//HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<>();
		//Map<Integer, String> map = new HashMap<>();
		
		System.out.println("1.크기 : " +map.size());
		System.out.println("1.자료 : " +map);
		System.out.println();
		
		// 자료 삽입 : put(키, 값)
		map.put(11, "홍길동");
		map.put(13, "김말숙");
		map.put(21, "이기자");
		map.put(15, "강감찬");
		map.put(17, "오사랑");
		map.put(19, "고길동");
		System.out.println("2.크기 : " +map.size());
		System.out.println("2.자료 : " +map);
		System.out.println();
		
		// 추가 
		map.put(13, "김말자");
		map.put(20, "김말자");
		System.out.println("3.크기 : " +map.size());
		System.out.println("3.자료 : " +map);
		System.out.println();
		
		//검색 : get()
		System.out.println("4.검색키(13) : " +map.get(13));
		System.out.println();
		
		//수정 : put()
		System.out.println("5.수정키(13) : " +map.put(13,"이사랑"));
		System.out.println("5.크기 : " +map.size());
		System.out.println("5.자료 : " +map);
		System.out.println();
		
		//삭제 : rmeove() //13번 이사랑 삭제
		System.out.println("6.검색키(13) : " +map.remove(13));
		System.out.println("6.크기 : " +map.size());
		System.out.println("6.자료 : " +map);
		System.out.println();
		
		// 모두 삭제 : clear
		map.clear();
		System.out.println("7.크기 : " +map.size());
		System.out.println("7.자료 : " +map);
		System.out.println();
	}
}
