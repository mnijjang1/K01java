package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 finally절
  - 예외발생 여부와 상관없이 try문에 진입했을 때 반드시 실행해야 할 코드가 있는 경우 기술하는 블럭이다.
  - 즉, try문으로 진입하지 않는다면 finally절은 실행되지 않는다.
  - 단, try문으로 진입하면 return문을 만나도 반드시 실행된다.
  1) try~catch : 예외를 직접 처리할 때
  2) try~catch~finally : 예외를 직접 처리후 실행할 문장이 있을 때
  3) try~finally : 예외는 외부로 던지고 예외발생과 상관없이 실행할 문장이 있을 때. 
 */
public class Ex05Finally {

	// 런타임 예외가 발생되는 메소드
	static void runtime() throws NumberFormatException {
		Integer.parseInt("백");
	}
	
	static void tryCatchFinally() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요:");
		int age = -1;
		try {
			age = scan.nextInt(); // 30살 입력
			System.out.println("당신은 5년후 " + (age+5) + "살 입니다.");
			return; // 이 다음 finally구문 실행
		}
		
		catch (InputMismatchException e) { // 예외가 발생되더라도 finally구문 실행
			System.out.println("나이는 숫자만 쓰세요");
		}
		finally {
			System.out.println("항상 실행되는 finally절 입니다.");

			// try문 안에 exit(0)이 실행되면 프로그램 자체가 해당 시점에서 종료되므로 finally절은 실행되지 않는다.
			System.exit(0); 
		}
	}
	public static void main(String[] args) {
		
		try {
			runtime();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}

		tryCatchFinally();
		System.out.println("메인메소드 끝"); // 40라인 exit 때문에 이 라인은 실행되지 않는다.
	}

}
