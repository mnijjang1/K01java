package bokang;

import java.util.Scanner;

public class R01if {

	public static void main(String[] args) {
		int jumsu = 85;
		
		if (jumsu >= 90) {
			System.out.println("A학점");
		}
		else if (jumsu >=80 ) {
			System.out.println("B학점");
		}
		else {
			System.out.println("F학점");
		}

/*
시나리오] 월에 해당하는 1~12까지의 숫자를 입력받아서
	봄(3~5), 여름(6~9), 가을(10~11), 겨울(12~2)인지 판단하는 
	switch~case문을	작성해보시오.
 */

		Scanner scan = new Scanner(System.in);
		System.out.println("1~12 사이의 정수를 입력하세요 :");
		int month = scan.nextInt();
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println(month+"월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month+"월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month+"월은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(month+"월은 겨울입니다.");
			break;
		default:
			System.out.println("숫자를 잘못 입력하였습니다.");
			break;
		}
		
	}
}