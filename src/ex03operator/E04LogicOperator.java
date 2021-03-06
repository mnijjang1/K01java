package ex03operator;

public class E04LogicOperator {

	/*
	 논리연산자
	  - && : 논리 AND. 양쪽 모두가 true일때만 true를 반환하고 나머지는 false 반환.
	  - || : 논리 OR. 한쪽 혹은 양쪽이 true이면 true를 반환하고 양쪽 모두 false일때만 false 반환.
	  - ! : 논리Not. 반대의 논리를 반환함
	 */
	public static void main(String[] args) {

		int num1=10, num2=20;
				
		boolean result1 = (num1==100 && num2==20);
		boolean result2 = (num1<12 || num2>=30);
		
		System.out.println("result1의 결과:"+ result1);
		System.out.println("result2의 결과:"+ result2);
		
		if(!(num1==num2)) { // num1과 num2가 같지 않으므로 false값이나 앞의 !에 의해 false가 true 바뀐다
			System.out.println("num1과 num2는 다르다");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
		
	}

}
