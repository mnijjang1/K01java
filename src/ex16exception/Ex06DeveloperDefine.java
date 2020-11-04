package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 사용자 정의 예외클래스
  1. Exception 클래스를 상속받는다.
  2. 생성자에서 예외발생시 출력할 메세지를 super()를 통해 입력한다.
  3. 예외 발생지점에서 if문으로 감지한 후 예외객체를 생성 및 throw한다(throws 아님)
  4. catch문에서 예외객체를 받아서 처리한다.
 */
class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 입력이 잘못되었어요");
	}
}

public class Ex06DeveloperDefine {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요 : ");
		
		try {
			int age = readAge();
			System.out.println("당신의 나이는 " + age + " 입니다.");
		}
		catch (AgeErrorException e) {
			System.out.println("[예외발생]"+e.getMessage());
		}
		
	}
	
	public static int readAge() throws AgeErrorException {
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = sc.nextInt(); // 나이 입력시 -값을 입력하면 예외가 발생한다.
		}
		catch (InputMismatchException e) { // 정수가 아닌 값이 입력됐을 때를 위한 예외처리
			e.printStackTrace();
			System.exit(0);
		}

		if (inputAge<0) {
			// 예외객체를 생성한 후 프로그램으로 throw한다.
			AgeErrorException ex = new AgeErrorException();
			throw ex;
		}
		return inputAge;
	}
}
