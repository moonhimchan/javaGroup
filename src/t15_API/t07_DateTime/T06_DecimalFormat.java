package t15_API.t07_DateTime;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class T06_DecimalFormat {
	public static void main(String[] args) {
		// DecimalFormat() : 데이터 출력 포멧을 지정한다.(소수이하 자리 처리에서 많이 사용)
		// 서식기호 : 0(숫자-자리확보), #(숫자-의미없는 0은 표시안함)
		double su=12345.0;
		System.out.println("원본 : " +su);

		DecimalFormat df =new DecimalFormat();
		System.out.println("1: " +df.format(su));  // 12,345
		
		df =new DecimalFormat("0");
		System.out.println("2: " +df.format(su));  // 12345
		
		df =new DecimalFormat("0,000");
		System.out.println("3: " +df.format(su));  // 12,345
		
		df =new DecimalFormat("0,000,000");
		System.out.println("4: " +df.format(su));  // 0,012,345
		
		df =new DecimalFormat("#");
		System.out.println("5: " +df.format(su));  // 12345
		
		df =new DecimalFormat("#,###");
		System.out.println("6: " +df.format(su));  // 12,345
		
		df =new DecimalFormat("@@@@@@@@@@.@");
		System.out.println("7: " +df.format(su));  // @@@@@@@@@@12345.@
		
		df =new DecimalFormat("\u00A4#.0");
		System.out.println("8: " +df.format(su));  // ￦12345.0
		
		// US달러표시
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);  //$12,345.00
		nf.setMinimumFractionDigits(2);
		System.out.println("9.: " +nf.format(su));
	}
}
