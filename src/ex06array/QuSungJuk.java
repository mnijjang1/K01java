package ex06array;

import java.util.Scanner;

public class QuSungJuk {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 :");
		int num = scan.nextInt();
		System.out.println("학생수 :"+num);
		
		double [][] arr = new double[num][5];
		
		for (int i=0; i<num; i++) {
			System.out.printf("[%d번째 학생의 점수 입력]\n", i+1);
			System.out.print("국어점수 입력?");
			arr [i][0] = scan.nextInt();
			System.out.print("영어점수 입력?");
			arr [i][1] = scan.nextInt();
			System.out.print("수학점수 입력?");
			arr [i][2] = scan.nextInt();
			
			arr [i][3] = arr[i][0] + arr[i][1] + arr[i][2];
			arr [i][4] = arr[i][3]/3;
		}
		
		System.out.println("==============================");
		System.out.println("NO KOR ENG MATH TOT AVG");
		System.out.println("==============================");
		
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%f   %f  %f  %f   %f  %f\n", i+1, arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4]);
			/*
			 선생님 코드
			 System.out.printf(%d %f %n", total, (double)total/SUBJECTS);
			  -> 과목 출력은 합 구하면서 바로 바로, 과목수는 3이 아니라 상수로 선언
			 */
		}	
		System.out.println();
	}

}
