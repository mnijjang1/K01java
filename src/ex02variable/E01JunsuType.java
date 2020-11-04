package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {
		
		/*
		 정수자료형
		  - byte, short, int, long 타입이 있다.
		  - 각 자료형의 표현범위는 교안을 참조(암기할 필요 없음)
		  - 일반적으로 CPU(중앙처리장치)는 정수형 연산을 할때 int형을 가장 빠르게 처리한다.
		  - 즉, 정수형 변수는 거의 대부분 int형을 사용한다.
		 */
		int int1 = 100;
		int int2 = 200;
		int result1 = int1 + int2;
		System.out.println("int1 + int2 = " + result1); //300
		
		// 정수는 소수점 이하를 버리는 개념이 아니라 몫과 나머지를 구하여 몫을 반환하는 개념.
		result1 = int1 / int2; // 정수와 정수의 연산이므로 정수의 결과값이 나옴
		System.out.println("int1 / int2= " + result1);  //0
		
		/*
		 - int형보다 작은 자료형을 연산하면 컴파일러는 int형으로 변환하여 연산한다.
		 - CPU가 int형의 연산에 최적화 되어있기 때문이다.
		 - byte, short형은 게임 캐릭터의 움직임의 표현이나 음원 정보 등을 저장할 때 사용한다.
		 */
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2; // byte형 + byte형 = int형
		System.out.println("byte1 + byte2 = " + result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2; //short형 + short형 = int형
		System.out.println("short1 + short2 = " + result3);
		
		/*
		 - 동일 자료형끼리의 연산은 동일 자료형이 되는 것이 기본 원칙.
		 - 큰 자료형과 작은 자료형을 연산하면 큰 자료형으로 자동으로 형이 변환된다.
		   (데이터의 손실이 있을 수 있기 때문)
		 - 단, byte와 short는예외적인 상황으로 생각하면 된다.(int에 최적화된 CPU의 특성 때문)
		 */
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 = " + result4);
		
		result4 = long1 + long2; // long끼리의 연산은 기본 규칙을 따름.
		System.out.println("long1 + long2 = " + result4);

		//
		//long long3 = 2200000000; => 에러발생
		/*
		 자바 컴파일러(CPU)는 정수형 상수를 기본적으로 int형으로 간주하기 때문에
		 위 정수를 메모리에 올리는 순간 에러가 발생한다.
		 이 때는 접미사(L 혹은 l)을 붙여서 int형 자료가 아닌 long형 자료임을 알려줘야 한다.
		 이와 같이 대입을 위해 입력되는 숫자도 자료형을 기반으로 메모리에 저장되고, 이를 '리터럴'이라고 한다.
		 */
		long long3 = 2200000000L;
		long long4 = 2200000000l;
		
		long long5 = long3 + long4;
		System.out.println("long3 + long4 = " + long5);
		System.out.println("long3 + long4 = " + (long3 + long4));
		// 질문. 변수끼리 연산할 때 연산결과를 변수선언하지 않고 그냥하는 건 불가능한지
		// 답. 가능함 단, 연결용 +와 연산용 +를 혼합하여 사용할 경우 ()를 통해 우선순위 정해줄 것
	}

}
