//문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
//전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
//
//
//메소드명 : isPrimeNumber()
//소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.
//
//실행결과]
//2
//3
//5
//7
//……중략……
//97

package ex05method;

public class QuFindPrimeNumber {

	static boolean isPrimeNumber(int check) {
		// 모든 자연수 1과 자기 자신으로 나눠지므로 그 외의 수로 나눠져 떨어지는지 확인.
		for (int i=2; i<check; i++) { 
			if (check%i==0) {
				boolean resultFunc = false;
				return resultFunc; 
			}
		}
		boolean resultFunc = true;
		return resultFunc;
	}
	
	
	public static void main(String[] args) {
		for (int i=2; i<=100; i++) {
			boolean resultMain = isPrimeNumber(i);
			if (resultMain == true) {
				System.out.println(i);
			}
		}
		
	}

}
/*
 선생님 코드
21라인 for문 위에  if (check==1){
		    밑에	return false;
				}
				else{
				...
				}
를 추가하면 33라인에 i값을 1부터 주고 검증할 수 있음 
			
34~35라인을 합쳐서 if (isPrimeNumber(i)==true){}로 하는게 더 편함


 */
