//문제2] 파일명 : QuTwoDimLotate.java
//다음의 형태로 표현된 2차원 배열이 있다. 
//
//123
//456
//789
//이렇게 전달되면 다음의 형태로 구조를 변경하는 메소드를 정의해보자.

//789
//123
//456
//즉 메소드를 호출하면 1행은 2행으로, 2행은 3행으로 마지막행은 1행으로 이동하게된다.
//단 세로길이에 상관없이 동작하도록 메소드를 정의해야 한다.

package ex06array;

public class QuTwoDimLotate {

	static void twoDimLotate(int arr[][]) {
		
		for (int i=0; i<arr.length; i++) {
			int[][] arrNew = new int[arr.length][arr[i].length];
			if (i==arr.length-1) {//행 인덱스 0에 넣기
				for (int j=0; j<arrNew[i].length; j++) {
					arrNew[0][j]=arr[i][j];
				}
			}
			else { //행 인덱스 +1하기
				for (int j=0; j<arrNew[i].length; j++) {
					arrNew[i+1][j]=arr[i][j];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		System.out.println("로테이션 전 배열");
		dimPrint(arr);

		twoDimLotate(arr);
		
		System.out.println("로테이션 후 배열");
		dimPrint(arr);
	}

	static void dimPrint(int arr[][]) {
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}

}
