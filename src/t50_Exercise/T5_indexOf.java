package t50_Exercise;

import java.util.StringTokenizer;

/*
 단어(문장)을 입력박은후, 입력받은 글자중에서 특정 문자가 어디/어디에
 위치하고 있는지를 출력하시오.
 예) 문장 Welcome to korea!
    o를 포함하고 있는 개수 : 3개
    o가 위치한곳 : 4/9/12
*/
public class T5_indexOf {
	public static void main(String[] args) {
		//           0         1         2
		//           012345678901234567890
		String msg1="Welcome to Korea!!!";
		String msg2="한국을 방문하신겻을 환영합니다.";
		StringTokenizer msg1Arr=new StringTokenizer(msg1,"o");
		
		System.out.println("1.msg1에 'o'문자가 몇개있는가?" +(msg1Arr.countTokens()-1));
		System.out.println("2.msg1에 'o'문자가 어디에있는가?"+msg1.indexOf("o")+"/"+msg1.indexOf("o",msg1.indexOf("o")+1)+"/"+msg1.lastIndexOf("o"));
	}
}
