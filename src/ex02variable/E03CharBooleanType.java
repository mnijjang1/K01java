package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		
		/*
		 char형 : 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할 때
		 '(single quotation)으로 감싸서 표현한다.
		 만약 "(double quotation)으로 감싸면 문자열로 인식하므로
		 String형으로 선언해야한다.
		 */
		char ch1 = '가';
		//char chStr = '가나다라'; 에러발생 - 문자열이므로 char형으로 선언 불가
		String chStr = "가나다라";
		System.out.println("ch1= " + ch1);
		System.out.println("chStr= " + chStr);
		
		/*
		 아스키코드 : 1byte로 표현할 수 있는 문자(영문, 숫자)를 십진수 코드로 정의한 것
		 ex) A = 65, a = 97
		 유니코드 : 1byte로 표현이 안되는 문자(한글, 한자 등)는 2byte가 필요하고
		 이를 16진수로 정의한 값을 말한다.
		 */
		char ch2 = 'A';
		int num1 = 2;
		int num2 = ch2 + num1; //65 + 2 = 67
		System.out.println("num= " + num2);//67 출력
		
		char ch3 = (char)(ch2+num1);
		System.out.println("ch3(문자출력)=> " + ch3);
		System.out.println("ch3(아스키코드출력)=> " + (int)ch3);
		
		char ch4 = '1'; //숫자가 아니라 문자 1이므로 문자 1의 아스키 코드값인 49가 대입된다
		char ch4_1 = '1' + 1;
		System.out.println("ch4=" + ch4 + ", ch4_1 = " + ch4_1 + ", ch4_1 = " + (int)ch4_1);
		
		/*
		 boolean형 : true 혹은 false 두 가지의 값만 가질 수 있는 자료형으로
		 	산술연산(+, - 등)이나 비교연산(<, >=등)에는 사용할 수 없다.
		 	단, 논리연산은 가능하다.
		 */
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1=" + bn1 + ", bn2=" + bn2);
		
		/*
		 && : 논리 And연산으로 양쪽 모두 참일 때 참을 반환한다.
		 	그 외에는 거짓을 반환한다.
		 
		 || : 논리 OR 연산으로 둘 중 하나만 참이면 참을 반환한다.
		 	둘 다 거짓일때만 거짓을 반환한다.
		 */
		boolean bn3= bn1 && bn2;
		System.out.println("bn3(And)= " + bn3); // false 반환
		bn3 = bn1 || bn2;
		System.out.println("bn3(Or)= " + bn3); // true 반환
		
		bn3 = '가' > 30000; // 가=> 유니코드값이 44032 이므로 true가 반환됨
		System.out.println("bn3= " + bn3);
		
		/*
		 질문. 27행 num2에 A2를 넣는 방법이 있는지
		 답. 25행을 String ch2 = "A";
		    26행은 그대로
		    27행 삭제
		    28행 System.out.println("num= " + ch2 + num1); 하면 A2 출력
		 */

		
	}

}
