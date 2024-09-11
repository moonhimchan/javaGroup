package t18_Collection.t06_Stack_Queue;

import java.util.Stack;

/*
	스텍 : LIFO(Last In First Out) - 후압선출
*/
public class T01_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기 : " +stack.size());
		System.out.println("1.내용 : " +stack);
		System.out.println();
		
		// 삽입(push)
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(9);
		stack.push(6);
		System.out.println("2.크기 : " +stack.size());
		System.out.println("2.내용 : " +stack);
		System.out.println();
		
		// 검색 : search() //거꾸로 봐야한다. 밑에서부터 아래로
		System.out.println("3.검색(9)" + stack.search(9));
		System.out.println();
		
		// 바로 아래 자료 쳐다보기 : peek()
		System.out.println("4. : " + stack.peek());
		System.out.println();
		
		// 꺼내기(pop)(위에서 부터 지우기)
		stack.pop();
		System.out.println(".크기 : " +stack.size());
		System.out.println(".내용 : " +stack);
		System.out.println();
	}
}
