package ex05method;
/*
 재귀메소드(Recursive Method)
  - 하나의 함수에서 함수 자신을 다시 호출하여 작업을 수행하는 방식으로 문제를 해결하는 함수를 말한다.
 */
public class E08RecursiveMethod {
	// 함수가 본인을 계속 호출하여 4,3,2,1 순으로 result를 4*3*2*1순으로 계산이 되지만
	// 출력부에서는 return값이 반대순으로 들어오기 때문에 1*2*3*4 순으로 출력한다.
	static int factorial(int number) {
		int result;
		if (number==1) {
			result=1;
		}
		else {
			result = number * factorial(number-1);
		}
		System.out.println("계산과정 : number ="+number+", result = "+result);
		return result; 
	}
	public static void main(String[] args) {
		System.out.println("재귀함수를 이용한 팩토리얼 구하기");
		System.out.println("4factorial : "+ factorial(4));
		System.out.println("10factorial : "+factorial(10));
	}

}
