//※ex06array 패키지에서 작성하세요.
//문제1) 파일명 : QuNumberCounter.java
//다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.
//
//샘플코드]
//int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
//int[] counter = new int[4];
//
//실행결과]
//counter[0] => 3
//counter[1] => 2
//counter[2] => 2
//counter[3] => 4

package ex06array;

public class QuNumberCounter {

	public static void main(String[] args) {

		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4]; // 배열 크기를 지정하여 선언하고 초기화 하지 않으면 숫자 0으로 채워진다.
		
		for (int i=0; i<counter.length; i++) {
			int cnt=0;
			for (int j=0; j<answer.length; j++) {
				if (answer[j]==i+1) {
					cnt += 1;
				}
			}
			System.out.printf("counter[%d] => %d", i, cnt);
			System.out.println();
		}
	}

}

/*
아래와 같이 간단한 방식도 있음
	for (int i=0; i<answer.length; i++) {
		if (answer[i]==1) counter[0]++;
		else if (answer[i]==2) counter[1]++;
		else if (answer[i]==3) counter[2]++;
		else if (answer[i]==4) counter[3]++; // else if를 사용하는 것이 if 4번 사용하는 것보다 효율적.
		
		// 위의 if~else문을 한줄로 수정하면 다음과 같다
		// counter[answer[i]-1]++;
	}
	for (int i=0; i<answer.length; i++) {
	System.out.printf("counter[%d] => %d", i, cnt);
	System.out.println();
	}
 */
 
