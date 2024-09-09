package t15_API.t04_String;

import java.util.StringTokenizer;

public class T08_StringTokenizer {
	public static void main(String[] args) {
		String tel="010-1234-5678";

		StringTokenizer telArr=new StringTokenizer(tel,"-");

		System.out.println("tellArr토큰의 개수 : " +telArr.countTokens());

		String str="";
		while(telArr.hasMoreElements()) {
			str +=telArr.nextToken()+"/";
		}
		str=str.substring(0, str.length()-1);
		System.out.println("str : " +str);
	}
}