package donghee.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		for(int i=1;i<=28;i++) {
			System.out.printf("%3d",i);
			if(i%7==0) {
				System.out.println();
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		System.out.print("MONTH> ");
		int month = sc.nextInt();
		final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("%d월은 %d일까지 있습니다.%n",month,MAX_DAYS[month-1]);
		
		
	}

}
