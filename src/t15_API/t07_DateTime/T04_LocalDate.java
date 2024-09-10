package t15_API.t07_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class T04_LocalDate {
	public static void main(String[] args) {
		// LocalDate 객체
		LocalDate currentDate=LocalDate.now();
		System.out.println("오늘날짜 : " +currentDate);

		// 날짜 지정 셋팅
		currentDate=LocalDate.of(2024, 12, 25);
		System.out.println("지정날짜 : " +currentDate);

		// 시스템 시간
		LocalTime currentTime=LocalTime.now();
		System.out.println("현재시간 : " +currentTime);
		System.out.println("현재시간 : " +currentTime.toString().substring(0,8));

		// 날짜/시간 : LocalDateTime
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println("현재 날짜/시간 :" +currentDateTime);

		String[] strDateTime=LocalDateTime.now().toString().split("T");	
		System.out.println("현재 시간 :" +strDateTime[0]);
		System.out.println("현재 시간 :" +strDateTime[1].substring(0,strDateTime[1].lastIndexOf(".")));
		System.out.println();

		// 날짜 연산 : plusYears(), minusYears(), pulsMonths(), minusMonths(), plusDays(), minusDay()
		LocalDateTime res =currentDateTime.plusYears(1);
		System.out.println("오늘날짜 년도 +1 : " +res.toString().substring(0,4));
		
		res=currentDateTime.minusDays(7);
		System.out.println("오늘날짜 일 -7 : " +res.toString().substring(8,10));
	}
}
