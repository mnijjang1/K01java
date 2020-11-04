package ex06array;

public class E02ArrayAndMethod {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};// 배열 선언과 동시에 초기화. 요소의 갯수에 의해 자동으로 크기 결정됨.
		int[] ref; // 배열 변수만 선언한 상태로 아직 참조하는 배열이 없음
		System.out.println("초기화 직후 출력");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*
		 - 배열명을 매개변수로 전달하는 것은 배열의 실제값이 아닌 참조값(주소값)을 전달.
		 	정수의 경우는 해당값이 그대로 전달된다.
		 - addAllArray() 메소드에서 반환하는 값은 처음에 전달했던 배열의 주소값이므로,
		 	결과적으로 ref도 동일한 배열의 참조하게 된다.
		 */
		ref=addAllArray(arr,7);
		
		//동일한 참조값이 출력됨.
		//arr과 ref는 동일한 참조값을 가지게 되었으므로 출력결과도 동일함.
		System.out.println("arr="+ arr);
		System.out.println("ref="+ ref);

		
		System.out.println("메소드 호출후 출력");
		for (int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+" ");
		}
		System.out.println();
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	 //main함수의 배열arr을 아래의 함수에 매개변수로 전달하였기 때문에
	 //이 참조값을 받은 배열 ar도 동일한 배열을 참조하게 된다.
	public static int[] addAllArray(int[] ar, int addVal)
	{
		for (int i=0; i<ar.length; i++) {
			ar[i] += addVal;// 배열 각각의 요소값에 7을 더한 후 결과값을 다시 저장
		}
		return ar;
	}
}

