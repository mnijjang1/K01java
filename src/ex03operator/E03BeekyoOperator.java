package ex03operator;

public class E03BeekyoOperator {

	/*
	 비교연산자 : 좌우측 항의 값이 크거나,같거나 한지 비교하는 연산자
	 */
	public static void main(String[] args) {
		
		int num1=10, num2=20;
		
		/*
		 num1이 클때 참을 반환하므로, 아래 조건은 거짓이 된다.
		 따라서 else 블럭만 실행된다.
		 */
		if(num1 > num2) {
			System.out.println("num1이 더 큽니다.");
		}
		else {
			System.out.println("num2가 더 큽니다.");
		}

		/*
		 num1과 num2가 다를 때 참을 반환하므로, 아래 조건은 참이 된다.
		 따라서 if 블럭만 실행된다.
		 */
		if(num1 != num2) {
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
	}

}
