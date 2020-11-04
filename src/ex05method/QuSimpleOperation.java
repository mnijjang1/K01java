//문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
//두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
//파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
//
//메소드명 : arithmetic()
//
//실행결과]
//덧셈결과 -> 177
//뺄셈결과 -> 23
//곱셈결과 -> 7700
//나눗셈 몫 -> 1
//나눗셈 나머지 -> 23

package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	
	static void arithmetic(int n1, int n2) {
		System.out.printf("덧셈결과 -> %d",n1+n2);
		//printf문에서 나머지 구하는 %산술연산기호는 %%로 표현 -> 이스케이프 시퀀스 사용
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수 = ");
		int input1 = scan.nextInt();
		System.out.print("두번째 수 = ");
		int input2 = scan.nextInt();
		
		//arithmetic(a,b);
	}
	
}
