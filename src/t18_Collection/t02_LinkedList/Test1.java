package t18_Collection.t02_LinkedList;

import java.util.LinkedList;

/*
LinkedList : List계열, List자료구조의 특징을 갖는다.
인덱스가 없다. 따라서 순차처리개념이 없다. 많은자료의 순차검색시는 많은 시간이 걸린다.
단, 자료의 삽입/삭제는 처리속도가 빠르다. 따라서 자료의 삽입/삭제가 빈번한 자료구조에서 적합하다.
'이중 링크드 리스트(앞주소-데이터-뒤주소)'의 자료구조로 설계되어있기에, 복구작업이 가능하다.
 */
public class Test1 {
	public static void main(String[] args) {
		//LinkedList<String> linkedList = new LinkedList<String>();
		LinkedList<String> linkedList = new LinkedList<>();
		//List<String> linkedList = new LinkedList<>();

		System.out.println("1.linkedList크기 : " + linkedList.size());
		System.out.println("1.linkedList크기 : " + linkedList.toString());
		System.out.println("1.linkedList크기 : " + linkedList);
		System.out.println();

		// 자료삽입(add)
		linkedList.add("홍길동");
		linkedList.add("김말숙");
		linkedList.add("이기자");
		linkedList.add("오하늘");
		linkedList.add("고인돌");
		linkedList.add("소나무");
		System.out.println("2.linkedList크기 : " + linkedList.size());
		System.out.println("2.linkedList크기 : " + linkedList);
		System.out.println();

		linkedList.add("홍길동3");
		linkedList.add("김말숙3");
		linkedList.add("이기자3");
		linkedList.add("오하늘3");
		linkedList.add("고인돌3");
		linkedList.add("소나무3");
		System.out.println("3.linkedList크기 : " + linkedList.size());
		System.out.println("3.linkedList크기 : " + linkedList);
		System.out.println();

		// 자료검색(get)
		System.out.println("4.linkedList.get(1) : " + linkedList.get(1));
		System.out.println("4.linkedList.get(5) : " + linkedList.get(5));
		System.out.println("4.linkedList.get(마지막위치) : " + linkedList.get(linkedList.size()-1));
		System.out.println();

		// 자료수정(set)
		linkedList.set(1, "강감찬");
		System.out.println("4.linkedList크기 : " + linkedList.size());
		System.out.println("4.linkedList크기 : " + linkedList);
		System.out.println();

		// 자료삭제(remove)
		linkedList.remove(1);
		linkedList.remove(3);
		linkedList.remove(5);
		System.out.println("5.linkedList크기 : " + linkedList.size());
		System.out.println("5.linkedList크기 : " + linkedList);
		System.out.println();

		// 자료삽입(add(인덱스,요소))
		linkedList.add(1, "그린");
		System.out.println("6.linkedList크기 : " + linkedList.size());
		System.out.println("6.linkedList크기 : " + linkedList);
		System.out.println();

		// 모든 자료 삭제
		linkedList.clear();
		System.out.println("7.linkedList크기 : " + linkedList.size());
		System.out.println("7.linkedList크기 : " + linkedList);
	}
}
