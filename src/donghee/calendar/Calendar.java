package donghee.calendar;

import java.util.Scanner;

public class Calendar {
	
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31}; 
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void printSampleCalendar() {
		
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		for(int i=1;i<=28;i++) {
			System.out.printf("%3d",i);
			if(i%7==0) {
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			int month = sc.nextInt();
			
			System.out.printf("%d월은 %d일까지 있습니다.%n",month,cal.getMaxDaysOfMonth(month));
			
		}
		System.out.println("Bye~");
		
		sc.close();
	}

}
