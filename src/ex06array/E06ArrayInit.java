package ex06array;

public class E06ArrayInit {

	public static void main(String[] args) {

		 //1차원, 2차원 배열은 크기가 지정된 경우에는 전체요소가 0으로 초기화된다.
		int[] arr = new int[3];
		System.out.println("arr[0]="+ arr[0]);
		int[][] arr2 = new int[3][4];
		System.out.println("arr2[0][0]="+ arr2[0][0]);

		//1차원 배열은 요소의 갯수에 맞춰 배열의 크기가 자동 결정되므로 아무런 문제가 없지만
		//2차원 배열의 경우 가장 큰 사이즈를 기준으로 배열의 크기가 자동 결정되므로 빈 곳은 null로 채워진다.
		int[] arrDim = {1,2,3};
		System.out.println("arrDim[0]="+ arr[0]);
		
		int[][]arr2Dim = {
			{1},
			{1,2}
		};
		System.out.println("arr2Dim[0][0]="+ arr2Dim[0][0]);
		System.out.println("arr2Dim[0][1]="+ arr2Dim[0][1]); //예외발생
	}

}

// 질문. 초기값 선언시 null로 된 요소값은 이후에 변경이 불가능한지?