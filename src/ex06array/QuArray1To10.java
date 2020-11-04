//문제2) 파일명 : QuArray1To10.java
//다음 절차에 따라 프로그램을 작성하시오.
//1. 크기가 10인 정수타입의 배열을 선언한다.
//2. 반복문을 이용하여 배열을 채운다. 
//이때 배열은 1,2,3,4....순서대로 채운다.
//3. 2번에서 채운 배열을 출력한다.
//4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
//5. 누적해서 더한 값을 출력한다. 
//실행결과]
//초기화된 배열 요소
//1 2 3 4 5 6 7 8 9 10 
//배열전체요소의합:55

package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum=0;
		System.out.println("초기화된 배열 요소");
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		System.out.printf("배열전체요소의합:%d",sum);
	}

}
