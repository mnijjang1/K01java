package ex06array;
/*
 2차원 배열 - 자료형[세로][가로]의 형태로 선언한다. 
  - 세로가 앞에 있으므로 2차원 배열을 1차원 배열처럼 무언가를 하면 항상 세로값을 반환한다.
  - 행(세로)의 크기를 측정하는 법 - 변수명.length
  - 해당 행의 열의 크기를 측정하는 법 - 변수명[세로값].length
 */
public class E05TwoDimArray01 {

	public static void main(String[] args) {
		
		/*
		 아래와 같이 2차원 배열을 초기화하면 최대 사이즈를 기준으로 세로3, 가로4인 배열이 생성된다.
		 초기화할 요소가 없는 부분은 null로 채워지게 된다.
		 ※null값 :아무것도 없는 값을 일컫는다. 즉 빈값을 말한다.
		 		스페이스와 같은 공백문자와는 다르다는 것에 주의하자.
		 */
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
		// 2차원 배열에서 "배열명.length"로 출력하면 세로크기가 반환된다.
		System.out.println("배열의 세로크기 : "+ arr.length); // 주소값 출력
		
		/*
		 각 행의 가로크기는 초기화된 상태에 따라 다른 수 있다.
		 0행은 2, 2행은 4의 크기를 가지게 된다.
		 */
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d행의 크기 : %d%n", i, arr[i].length);
			System.out.printf("%d행의 출력 : %s%n", i, arr[i]);
		}
		
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]="+arr[0][1]); //정상 출력
		System.out.println("arr[0][3]="+arr[0][3]); //예외 발생 - 초기화를 하지 않아 null값이 입력되어 있기 때문.
		System.out.println("arr[0][3]="+arr[3][4]); //예외 발생 - 선언한 배열의 크기를 벗어났기 때문.
	}
}
