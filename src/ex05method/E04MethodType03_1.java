package ex05method;

import java.util.Scanner;

public class E04MethodType03_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작값 : ");
		int s = scan.nextInt();
		System.out.print("종료값 : ");
		int e = scan.nextInt();
		yesParamNoReturn(s, e);
	}

	static void yesParamNoReturn(int startNum,int endNum) {
		
		// 1에서 10까지 합을 구하는 프로그램을 시작과 종료값만 변수로 변경하여 해당 구간의 합을 구하는 프로그램으로 커스터마이징.
		int sum = 0;
		for (int i=startNum; i<=endNum; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의 합은 : %d", startNum,endNum, sum);
	}
}
