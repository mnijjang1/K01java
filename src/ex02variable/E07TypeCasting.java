package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {
		
		/*
		 자동 형변환 : 작은 상자의 데이터를 큰 상자에 대입할 때 자동으로 형변환이 일어난다.
		 */
		byte b1=65;
		short s1;
		s1=b1; // byte형이 short형보다는 작은 자료형이므로 자동 형변환이 됨
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		
		/*
		 아래 코드는 자동 형변환이라고 할 수 없음. CPU는 int보다는 작은 자료형을 int로 간주하고
		 연산을 진행하며, 결과도 int로 반환하는 특성을 가지고 있기 때문.
		 */
		int num1 = b1 + s1;
		int num2 = num1;
		System.out.println("num1은 "+num1);
		
	
		//char ch1 =b1; 에러발생 - byte형(문자타입)과 char형(숫자타입)은 성질이 다른 타입이기 때문에 명시적 형변환이 필요하다
		char ch2=(char)b1;
		System.out.println("b1="+b1+", ch2="+ch2);
		
		/*
		 명시적 형변환 : 큰 상자의 자료를 작은 상자의 자료형에 할당해야할 때 사용.
		 단, 자료의 손실이 있을 수 있으므로 필요한 경우에만 사용해야함.
		 */
		short s2=100;
		byte b2=(byte)s2;
		System.out.printf("데이터미손실:b2=%d, s2=%d%n",b2,s2);
		
		/*
		 소수점 아래부분이 버려지므로 데이터 손실 있음. 따라서 특수한 경우가 아니라면 사용을 자제해야함	
		 */
		int num3;
		double dl=3.14;
		num3=(int)dl;
		System.out.printf("데이터손실:num3=%d, dl=%.2f%n",num3,dl);
		
		/*
		 char와 int를 연산하면 결과는 int이므로 char형 변수에 대입하려면
		 명시적(강제) 형변환 후 대입해야한다.
		 */
		char ch3='A', ch4;
		int num4=2;
		
		//ch4=ch3+num4; 에러발생 - 타입이 맞지 않기 때문
		ch4=(char)(ch3+num4);
		System.out.println("ch4="+ch4);
				
	}

}
