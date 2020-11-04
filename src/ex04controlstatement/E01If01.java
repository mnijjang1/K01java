package ex04controlstatement;

import java.io.IOException;

public class E01If01 {
	
	/*
	 if문(조건문, 분기문)
	  - 형식1
	  	if(조건문) {
	  		실행문1;
	  		실행문2;
	  	}
	  - if문의 조건문은 반드시 비교식 혹은 논리식이어야 한다.
	  - 즉, 결과값이 boolean타입(true, false)이어야 한다.
	  - 실행할 문장이 하나인 경우 중괄호{} 생략이 가능하다.
	 */
	public static void main(String[] args) throws IOException {
		
		int num = 10;
		
//		if(num%2) { 에러발생 - 조건문의 결과값이 0으로 boolean 타입의 결과값이 아니기 때문 
//			System.out.println("잘못된 조건식입니다.");
//		}
//		if(num) { 에러발생 - 조건문의 결과값이 10으로 boolean 타입의 결과값이 아니기 때문
//			System.out.println("이것도 잘못된 조건식입니다.");
//		}
		
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다.", num);
		}
		if(num%2==0 && num>=10) {
			System.out.printf("%n%d는 짝수이고 10보다 크거나 같다.%n", num);
		}
		
		// 경우에 따라 무조건 실행되는 if문을 사용해야 할 때도 있다.
		if(true) {
			System.out.println("무조건 실행되는 if문입니다.");
		}
		
		 // if(조건문); => ;으로 인해 문장이 끝이 나버렸으므로 조건문의 true, false와 관계없이 다음 문장이 실행된다.
		if(num%2 != 0);
		{
			System.out.printf("%d는 홀수입니다.", num);
		}
		
		/*
		 조건 검사후 실행할 문장이 하나인 경우에는 중괄호를 생략할 수 있다.
		 단, 실행문이 2개 이상인 경우에는 첫째줄은 if의 영향을 받아 조건문에 따라서 실행이 되거나 되지 않거나 하게 되고
		 	그 이후의 문장은 if의 영향을 벗어나게 되어 조건문에 관계없이 무조건 실행되므로 주의해야 한다.
		 */
		if(num%2 == 0)
			System.out.println("\n"+ num +"은 짝수이다.");
		
		if(num%2 != 0) {
			System.out.println("num은 "+ num +"입니다.");
			System.out.println(num +"은 홀수입니다.");
		}
		
		/*
		 system.in.read()
		  - 사용자에게 하나의 문자를 입력받을 때 사용하는 함수(메소드)로
		  	입력한 문자의 아스키 코드값을 반환한다.
		  - 해당 함수는 IOException을 기본적으로 가지고 있어서
		  	이를 무시하기 위해 main()함수에서 throws 처리를 해준다.
		 */
//		System.out.print("하나의 문자를 입력하세요:");
//		int asciiCode= System.in.read();
//		System.out.println("입력한 문자:"+ asciiCode);
//		System.out.println("입력한 문자:"+(char)asciiCode);
		
		/*
		 [시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해 구현하시오
		 */
		
		System.out.print("하나의 문자를 입력하세요:");
		int asciiCode = System.in.read();
		
		/*
		 아스키 코드값을 알고 있을 때 구현 방법
		 '0' => 48
		 '9' => 57 이므로 해당 구간 안에 있다면 숫자로 판단할 수 있다.
		 ※ 숫자의 구간을 정할 때는 반드시 논리 And를 사용한다.
		 */
		if(asciiCode>=48 && asciiCode<=57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}

		/*
		 아스키 코드값를 모를 때 구현 방법
		 char형 문자는 메모리에 저장할 때 아스키 코드값으로 저장되므로
		 아래처럼 비교연산이 가능한. 도한 산술 연산도 가능하다.
		 */
		if(asciiCode>='0' && asciiCode<='9') {
			System.out.println("입력한 문자는 숫자입니다.[아스키값 모를때]");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.[아스키값 모를때]");
		}
	}

}
