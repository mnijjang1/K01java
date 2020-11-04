package ex05method;

public class E02MethodType01 {
	/*
	 Method(메소드)
	  - 객체지향 프로그램에서 행동 또는 동작을 의미한다.
	  - 즉, 어떤 하나의 업무를 처리하는 모듈(부속품)이라 정의할 수 있다.
	 규칙
	  - 메소드는 반드시 class안에 정의해야 한다.
	  - 메소드 안에 다른 메소드를 정의할 수 없다.
	  - 반환타입이 없다면 타입을 쓰지 않는 것이 아니라 반드시 void라고 명시해야 한다.
	  - 이름의 규칙은 변수명과 동일하다.
	 Java에서의 Naming rule(이름 규칙)
	  - 클래스명 : SimpleFunc -> 대문자로 시작하는 camel case
	  - 메소드명, 변수명 : simpleFunc -> 소문자로 시작하는 변형된 camel case
	  - 상수 : SIMPLE_FUNC -> 전체를 대문자로 표현하고, 연결 단어는 언더바를 사용
	  - 패키지명 : simple.func -> 전체를 소문자로 표현하고, 연결된 단어가 있더라도 언더바 사용하지 않음
	  						    언더바 대신 .(닷 혹은 점)을 사용한다.
	 */
	
	/*
	 메소드 형식1] 매개변수도 없고 반환값도 없는 경우
	  - 해당 형식은 주로 출력을 담당하는 기능으로 사용된다. 반환타입은 반드시 void로 기술해야 한다.
	 */
	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세요==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("================");
	}
	
	// 경우에 따라 함수의 몸체가 없을 수도 있음
	static void noParamNoReturn2() {
		
	}
	
	// 동일한 이름의 함수가 정의되었으나 매개변수의 갯수가 다르므로 다른 함수임.
	static void noParamNoReturn2(int a) {
		
	}
	
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		
		//return; 에러 발생 - 함수가 현재 시점에서 종료되므로 아래 문장은 실행되지 않는 쓰레기 코드가 된다.
						 //함수 중간에 사용될 경우에는 조건문이 필요하다.
		
		if(returnValue%2==0)
		{
			System.out.println(returnValue +"는 짝수");
			return;
		}
		
		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
	}
	public static void main(String[] args) {
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
	
	}

}
