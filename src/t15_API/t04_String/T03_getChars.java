package t15_API.t04_String;

public class T03_getChars {
	public static void main(String[] args) {
		String str1="Hello!";

		char[] strArr=new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0);  // 배열복사와 같은 개념
		System.out.println("strArr : " + strArr);
		System.out.println();

		String temp="";
		for(char str : strArr) {
			temp +=str + "/";	
		}
		System.out.println(temp);
		System.out.println(temp.substring(0,temp.length()-1));
	}
}
