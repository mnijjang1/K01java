//문제3) 홀수/짝수 구분하여 배열채우기
//파일명 : QuFillArray.java
//길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
//그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
//
//실행결과]
//1번째 정수를 입력하세요:2
//2번째 정수를 입력하세요:4
//3번째 정수를 입력하세요:5
//4번째 정수를 입력하세요:3
//5번째 정수를 입력하세요:2
//6번째 정수를 입력하세요:9
//7번째 정수를 입력하세요:7
//8번째 정수를 입력하세요:8
//9번째 정수를 입력하세요:5
//10번째 정수를 입력하세요:1
//순서대로입력된결과
//2 4 5 3 2 9 7 8 5 1 
//홀수/짝수 구분입력결과
//5 3 9 7 5 1 8 2 4 2 

package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d번째정수를 입력하세요 :", i+1);
			arr[i] = scan.nextInt();
		}
		
		System.out.println("순서대로 입력된 결과");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int[] sort = new int[10];
		
		int h=0, j=9; // j=9가 아니라 j=arr.length -1로 선언해도 된다.
		for (int i=0; i<sort.length; i++) {
			if (arr[i] % 2 == 1) {
				sort[h] = arr[i]; //47,48라인을 합치면 sort[h++] = arr[i]
				h += 1;
			}
			else {
				sort[j] = arr[i]; //51,52라인을 합치면 sort[j++] = arr[i]
				j -= 1;
			}
		}
		
		System.out.println("홀수/짝수 구분 입력 결과"); // 40,56라인을 합치면 System.out.println("/n홀수/짝수 구분 입력 결과"); 
		for (int i=0; i<sort.length; i++) {
			System.out.print(sort[i]+" ");
		}
	}

}
