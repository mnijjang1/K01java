//이 메소드는 배열에 저장된 값을 add 만큼 증가시킨다.
//이 메소드를 기반으로 int형 2차원 배열에 저장된 값을 증가시키는 프로그램을 작성하시오. 단 2차원 배열의 가로, 세로길이에 상관없이 동작해야 하고, 반드시 addOneArr() 메소드를 사용하여 구현해야 한다. 
//그리고 증가되기전의 값과 증가되고난후의 값을 모두 출력해야 한다.
//구현할 프로그램의 포맷은 다음과 같다. 

package ex06array;

public class QuTwoDimArray {

	public static void addOneArr(int[] arr,int add) {
		for (int i=0; i<arr.length; i++) {
			arr[i] += add;
		}
	}
	
	//2차원 행렬의 행을 1씩 증가시키는 반복문을 통해 각 행을 1차원 배열화하여 addOneArr()로 전달
	public static void addTwoArr(int[][] arr, int add) {
		for (int i=0; i<arr.length; i++) {
			addOneArr(arr[i],2);
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = { // 비어있는 부분은 null로 초기화.
				{1,2,3,4},
				{5,6,7},
				{8,9}
		};
		System.out.println("값 증가전 출력");
		arrPrint(arr);
		
		addTwoArr(arr,2);
		
		System.out.println("값 증가후 출력");
		arrPrint(arr);
	}
		
	static void arrPrint(int[][] arr) {
		for (int i=0; i<arr.length; i++) { // 배열 세로 크기만큼 반복
			for (int j=0; j<arr[i].length; j++) { // 배열 가로 크기만큼 반복
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
