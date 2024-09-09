package t15_API.t04_String;

public class T06_split {
	public static void main(String[] args) {
		// split() : 문자열을 특정 문자(열)러 분리시킨후~~~> 분리된 각각의 항목이 배열로 저장시켜준다.(or : |)
		
		String tel="010-1234-5678";
		
		// 앞의 전화번호를 '-'으로 분리시킨후 배열로 저장해 보자.
		String[] telArr=tel.split("-");
		System.out.println("지역번호 : " +telArr[0]);
		System.out.println("국 번 호 : " +telArr[1]);
		System.out.println("전화번호 : " +telArr[2]);
		System.out.println();
		
		String temp= "";
		for(String t : telArr) {
			//System.out.println(t);
			temp +=t+"/";
		}
		temp=temp.substring(0, temp.length()-1);
		System.out.println(temp);
		System.out.println();
		
		// 각 이름의 구분자를 '/' 통일해서 출력하시오?
		String names="홍길동/이기자&김말숙:오하늘;소나무 고인돌";
		System.out.println(names);
		
		String[] namesArr=names.split(" /|&|:|;| ");  //주의
		String nameTemp="";
		for(String name : namesArr) {
			nameTemp +=name+ "/";
		}
		nameTemp=nameTemp.substring(0,nameTemp.length()-1);
		System.out.println(nameTemp);
		
		// join() : 배열에 분리저장되어 있는 항목들을 특정 문자로 결합처리한다.
		String nameJoin=String.join("/", namesArr);
		System.out.println("이름 : " +  nameJoin);
	}
}
