package t18_Collection.t11_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class T01_ListSpeedCheck {
	public static void main(String[] args) {
		//Vector<String> vos1 = new Vector<String>();
		//ArrayList<String> vos2 = new ArrayList<String>();
		//LinkedList<String> vos3 = new LinkedList<String>();

		List<String> vos1 = new Vector<String>();
		List<String> vos2 = new ArrayList<String>();
		List<String> vos3 = new LinkedList<String>();

		int su = 1000;
		long starTime, endTime;

		System.out.println("0번 인덱스에 자료추가하기");

		// Vector
		starTime = System.nanoTime();
		for(int i=0; i<su; i++) vos1.add(0,"홍길동"+i);
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간?\t\t\t\t\t" +(endTime-starTime) + "ns");
		System.out.println();
		
		// ArrayList
		starTime = System.nanoTime();
		for(int i=0; i<su; i++) vos2.add(0,"홍길동"+i);
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간?\t\t\t\t\t" +(endTime-starTime) + "ns");
		System.out.println();
		
		// Linkedlist
		starTime = System.nanoTime();
		for(int i=0; i<su; i++) vos3.add(0,"홍길동"+i);
		endTime = System.nanoTime();
		System.out.println("Linkedlist의 수행시간?\t\t\t\t\t" +(endTime-starTime) + "ns");
		System.out.println();
	}
}
