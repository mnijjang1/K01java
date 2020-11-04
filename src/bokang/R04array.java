package bokang;

import java.util.Random;

public class R04array {

	public static boolean arrayExistElements(int[] arr) {
		boolean isDup = true;
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					isDup = false; // 중복인 경우 false로 변경
				}
			}
		}
		
		return isDup;
	}
	
	public static void randomCreate(int [] lottoNum) {
		// 난수 생성
		Random random = new Random();
		int[] lottoarr = new int[6];
		for (int i=0; i<6; i++) {
			lottoarr[i] = random.nextInt(44)+1; 
		}
		System.out.println(lottoarr);
		
		// arrayExistElements 검사
		
		// 중복있으면 다시 난수 6개 생성
	}
	public static void showArray(int [] lottoNum) {
		
	}
	public static void main(String[] args) {
		/*
		시나리오]1차원배열을 생성과 동시에 초기화하고 배열의 요소에
		중복값이 있는지 검사하는 프로그램을 작성하시오.
		중복이 없는경우에는 true, 중복이 있는경우에는 false를 반환한다.
		함수명: arrayExistElements
		 */
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = {1,2,3,2,5};
		
		// 매개변수로 배열변수를 전달하고, boolean값을 반환함
		boolean isExist1 = arrayExistElements(arr1);
		boolean isExist2 = arrayExistElements(arr2);
		
		if(isExist1==true)
			System.out.println("arr1:중복없음");
		else
			System.out.println("arr1:중복있음");
		
		if(isExist2==true)
			System.out.println("arr1:중복없음");
		else
			System.out.println("arr1:중복있음");
		
		
		
		/*
		연습문제] 중복되지 않는 난수 6개를 생성하시오. 생성한 
		난수는 아래 배열에 채워 넣으시오.
		 */
//		int[] lottoNum = new int[6];
		
		//난수생성 및 중복검사
//		randomCreate(lottoNum);
		
		//배열출력
//		showArray(lottoNum);
		
	}

}
