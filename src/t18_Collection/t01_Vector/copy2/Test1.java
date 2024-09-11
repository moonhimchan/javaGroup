package t18_Collection.t01_Vector.copy2;

import java.util.Vector;

/*
  Vector : List게열, List자료구조의 특징을 모두 갖는다.
  인덱스로 관리, 순찰처리, 앞에서부터 자료를 기억, 자료의 삽입/삭제시 많은 시간 소요될수 있음. 중복허용됨
  '멀티스레드'의 동기화(synchronized)작업에 유리, ArrayList에 비해서 안정적임.
 */
public class Test1 {
	public static void main(String[] args) {
		//Vector vector = new Vector();
		//Vector<String> vector = new Vector<String>();
		Vector<String> vector = new Vector<>();
		//List<String> vector = new Vector<>();

		System.out.println("1.vector용량 : " + vector.capacity());
		System.out.println("1.vector크기 : " + vector.size());
		System.out.println("1.vector크기 : " + vector.toString());
		System.out.println("1.vector크기 : " + vector); //toString은 생략가능하다.
		System.out.println();
		
		//add는 삽입
		vector.add("홍길동");  //벡터에 자료넣기
		vector.add("김말숙");  
		vector.add("이기자");  
		vector.add("오하늘");  
		vector.add("고인돌"); 
		vector.add("소나무");
		System.out.println("2.vector용량 : " + vector.capacity());
		System.out.println("2.vector크기 : " + vector.size());
		System.out.println("2.vector크기 : " + vector); 
		System.out.println();

		vector.add("홍길동3");  
		vector.add("김말숙3");  
		vector.add("이기자3");  
		vector.add("오하늘3");  
		vector.add("고인돌3"); 
		vector.add("소나무3");
		System.out.println("3.vector용량 : " + vector.capacity());
		System.out.println("3.vector크기 : " + vector.size());
		System.out.println("3.vector크기 : " + vector); 
		System.out.println();

		//자료검색(get)
		System.out.println("4.vector.get(1)" + vector.get(1));
		System.out.println("4.vector.get(5)" + vector.get(5));
		System.out.println("4.vector.get(5)" + vector.get(vector.size()-1));

		//자료수정(set)
		vector.set(1, "강감찬");
		System.out.println("4.vector용량 : " + vector.capacity());
		System.out.println("4.vector크기 : " + vector.size());
		System.out.println("4.vector크기 : " + vector); 
		System.out.println();

		//자료사제(remove) 
		vector.remove(1);
		vector.remove(3);
		vector.remove(5);
		System.out.println("5.vector용량 : " + vector.capacity());
		System.out.println("5.vector크기 : " + vector.size());
		System.out.println("5.vector크기 : " + vector); 
		System.out.println();
		
		//자료삽입(add(인덱스,요소))
		vector.add(1,"그린");
		System.out.println("6.vector용량 : " + vector.capacity());
		System.out.println("6.vector크기 : " + vector.size());
		System.out.println("6.vector크기 : " + vector); 
		System.out.println();
		
		// 모든 자료 삭제(clear)
		vector.clear();
		System.out.println("7.vector용량 : " + vector.capacity());
		System.out.println("7.vector크기 : " + vector.size());
		System.out.println("7.vector크기 : " + vector); 
		System.out.println();
	}
}
