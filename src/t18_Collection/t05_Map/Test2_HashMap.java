package t18_Collection.t05_Map;

import java.util.TreeMap;

public class Test2_HashMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
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
		
		//검색 : get() => 키값을 검색하여 '자료'를 찾아준다.
		System.out.println("4.검색키(13) : " +map.get(13));
		System.out.println();
		
		//수정 : put()
		map.put(13,"이사랑");
		System.out.println("5.크기 : " +map.size());
		System.out.println("5.자료 : " +map);
		System.out.println();
		
		//삭제 : rmeove() //13번 이사랑 삭제
		map.remove(13);
		System.out.println("6.크기 : " +map.size());
		System.out.println("6.자료 : " +map);
		System.out.println();
		
		//키값
		System.out.println("7.첫번째키 : " +map.firstKey());
		System.out.println("7.마지막키 : " +map.lastKey());
		System.out.println("7.첫번째키와 값 : " +map.firstEntry());
		System.out.println("7.검색키보다 작은키; : " +map.lowerKey(18));
		System.out.println("7.검색키보다 큰키 : " +map.higherKey(18));
		System.out.println("7.검색키보다 큰값 : " +map.get(map.higherKey(18)));
		System.out.println();
		
		// 모두 삭제 : clear
		map.clear();
		System.out.println("7.크기 : " +map.size());
		System.out.println("7.자료 : " +map);
		System.out.println();
	}
}
