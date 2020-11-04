package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = scanner.nextInt();
		
		int avg = (kor + eng + math) / 3; // double avg = (kor + eng + math) / 3.0
		String grade;
		
		switch (avg/10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
	
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("평균점수 : "+avg);
		System.out.println("학점 : "+grade);
		
	}

}
