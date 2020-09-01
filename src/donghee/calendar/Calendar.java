package donghee.calendar;

public class Calendar {

	public static void main(String[] args) {
		String[] day = {"일","월","화","수","목","금","토"};
		for(int i=0;i<7;i++) {
			System.out.print("   "+day[i]);
		}
		System.out.println();
		System.out.println("---------------------------------");
		for(int j=0;j<4;j++) {
			int x = 7*j;
			for(int i=1;i<=7;i++) {
				if(x+i<10)
					System.out.print("  "+(x+i));
				else
					System.out.print(" "+(x+i));
			}
			System.out.println();
		}
	}

}
