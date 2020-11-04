package ex03operator;

public class E06PrePostFixOperator {
	
	/*
	 증감연산자
	  - 변수를 +1 혹은 -1한 것과 같은 결과를 반환한다. 주로 반복문에서 사용.
	  - Prefix(전위 증가/감소) : 연산자가 변수 앞에 있음
	    1. 변수의 값이 먼저 증가/감소
	    2. 증가/감소한 값이 좌측으로 혹은 다른 코드에 반영됨
	  - Postfix(후위 증가/감소) : 연산자가 변수 뒤에 있음
	    1. 변수의 값이 먼저 다른 코드에 반영됨
	    2. 그 후 변수의 값이 변경됨
	 */
	public static void main(String[] args) {

		int num1=7;
		int num2, num3;
		
		num2 = ++num1; //num1의 값이 먼저 1증가, 그 후에 증가된 값이 num2에 대입.
		num3 = --num1; //num1의 값이 먼저 1감소, 그 후에 감소된 값이 num3에 대입.
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d%n%n", num1,num2,num3);

		num1= 7;
		
		num2 = num1++; //num1의 값이 먼저 num2에 대입, 그 후에  num1의 값이 1증가
		num3 = num1--; //num1의 값이 먼저 num3에 대입, 그 후에  num1의 값이 1감소
		System.out.println("후위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d%n%n", num1,num2,num3);
		
	}

}
