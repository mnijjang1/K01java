package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	/*
	 do~while문
	  - 반드시 한 번은 실행해야 할 경우 사용하는 반복문.
	  	즉, 조건검사 없이 무조건 한번은 실행된다(while문은 조건에 따라 한 번도 실행이 안되는 경우도 있음)
	  형식]
	  	반복을 위한 초기값;
	  	do {
	  		실행문장;
	  		반복문을 탈출하기 위한 증감식;
	  	}while(조건문); => 반드시 ;(세미콜론)으로 마무리한다.
	 */
	public static void main(String[] args) throws IOException {

		/*
		 E03 예제의 수열 문제를 do~while문을 사용하여 구현하시오
		 */
		int sum = 0;
		int i =1;
		do {
			sum += i;
			i++;
		}while (i<=10);
		System.out.println("1~10까지의 누적합 : "+sum);
		
		/*
		 시나리오] 1~1000까지의 정수중 4의 배수 혹은 7의 배수인 수의 합을 구하여
		 		출력하는 프로그램을 작성하시오. 단, do~while문을 사용해야 한다.
		 */
		int total = 0;
		int j = 1;
		do {
			if(j%4==0 || j%7==0) {
				System.out.println("j="+j);
				total += j;
			}
		j++;
		}while (j<=1000);
		
		System.out.println("1~1000사 4or7의 배수합 : "+total);
		
		/*
		 시나리오]국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여
		 		출력하는 프로그램을 작성하시오. 단, 사용자가 X,x(대소문자 구분 없음)를 입력하면
		 		프로그램이 종료되어야 하며  do~while문으로 구현해야한다.
		 */
	
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.println("국어점수 : ");
			kor = scanner.nextInt();
			System.out.println("영어점수 : ");
			eng = scanner.nextInt();
			System.out.println("수학점수 : ");
			math = scanner.nextInt();
			
			/*
			 switch문은 if문과 같은 조건식을 사용할 수 없고 산술식만 사용할 수 있으므로
			 점수의 구간을 한 개의 수로 표현하기 위해 총점을 30으로 나눠준다.
			 */
			avg = (kor+eng+math)/ (3 * 10);
			
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
			}
			
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
		
		/*
		 x를 입력한 경우 - !(true or false) => !true => false 반환, do~while문 탈출
		 a를 입력한 경우 - !(false or false) => !false => true 반환, loop 반복
		 */
		}while(!(exitCode=='x' || exitCode=='X'));
	}

}
