package ex15usefulclass;

public class E01WrapperClass2 {

	public static void main(String[] args) {
		
		/*
		 1. ParseInt() : 숫자형식의 문자열을 숫자로 변경한다.
		 	- 주로 웹에서 많이 사용된다.
		 */
		String strNumber = "1000";
		System.out.println("10+strNumber="+(10+strNumber));
		System.out.println("10+strNumber를 숫자로 변경:"+(10+Integer.parseInt(strNumber)));
		System.out.println("10+strNumber를 숫자로 변경:"+(10+Integer.valueOf(strNumber)));
		
		/*
		 문자열을 숫자로 변경할 때는 반드시 숫자형식만을 넣어야한다.
		 '원'은 숫자가 아니므로 NumberFormatException 예외가 발생한다.
		 */
		String money = "120원";
//		System.out.println("120원:"+ Integer.parseInt(money));

		/*
		 실수형태의 문자열을 숫자형으로 변경할 때는 parseInt()는 사용할 수 없고
		 parseFloat()를 사용해야한다.
		 */
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString));
		System.out.println("실수형(float)으로 변경:"+ Float.parseFloat(floatString));
		System.out.println("실수형(Double)으로 변경:"+ Double.parseDouble(floatString));

		/*
		 2. codePointAt() : 문자열에서 특정 index에 해당하는 문자의 아스키코드값을 반환한다.
		 */
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
		/*
		 3. isDigit() : 인자로 전달된 문자가 숫자인지 판단.
		 	- 숫자일 때 true를 반환
		 */
		System.out.println("isDigit()를 통한 숫자 판단");
		System.out.println(Character.isDigit('A')?"숫자임":"숫자아님");
		System.out.println(Character.isDigit(50)?"숫자임":"숫자아님");
		System.out.println(Character.isDigit('7')?"숫자임":"숫자아님");
		
		/*
		 4. isLetter() : 문자인지 아닌지를 판단.
		 	- 특수기호나 숫자형은 false를 반환한다.
		 */
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
		// 5. isWhitespace() : 공백문자인지를 판단하여 공백일 때 true를 반환한다.
		System.out.println("isWhitespace() 메소드로 공백문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));
		
		/*
		 6. 대소문자를 판단하는 메소드
		 	- 영문자에만 적용되고 알파벳이 아닌 경우 무조건 false를 반환한다.
		 */
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('Z'));
		System.out.println(Character.isLowerCase('가')); // 알파벳이 아니므로 false
		
		/*
		 시나리오] 주어진 문자열안에 몇개의 공백문자(스페이스)가 있는지 판단하는 프로그램을 작성하시오
		  참고) toCharArray() : 문자열을 char형 배열로 반환해주는 String 클래스에 정의된 메소드
		 */
		
		String whiteString = " H E L L O ";
		
		char [] arr = whiteString.toCharArray();
		int whiteCount=0;
		for ( int i=0; i<arr.length; i++) {
			if (Character.isWhitespace(arr[i]) == true ) {
				whiteCount ++;
			}
		}
		System.out.println(whiteCount);
	}
}
