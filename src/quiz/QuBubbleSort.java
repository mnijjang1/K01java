package quiz;

import java.util.Random;

public class QuBubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		boolean check;
		 do {
			check = false;
			for (int i=0; i<arr.length; i++) {
				Random ran = new Random();
				arr[i] = ran.nextInt(99)+1;
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			for (int i=0; i<arr.length-1; i++) {
				for (int j=i+1; j<arr.length; j++) {
					if (arr[i]==arr[j]) {
						check = true;
						System.out.println("중복된 난수 발생으로 난수를 다시 생성합니다.");
					}
				}
			}
		}while(check);
		
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=0;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
