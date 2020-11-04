package ex06array;

import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {
		
		/*
		 난수생성방법 1 - Math.random()
		  - 0~1사이의 실수를 랜덤하게 반환하는 함수.
		  - 정수형태의 난수를 생성하기 위해서는 100과 같은 정수를 곱해준다.
		 */
		double rndNumber = Math.random();
		System.out.println("생성된 난수[실수] :"+ rndNumber);
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된 난수[정수] :"+ intNumber);
		
		/*
		 난수생성방법 2 - Random 클래스
		  - Scanner클래스와 동일한 nextInt()함수를 이용해서 정수형 난수를 생성
		 */
		Random random = new Random();
		System.out.println("생성된 난수 :"+ random.nextInt());
		System.out.println("=============================");
		
		/*
		 로또번호처럼 1~45사이의 난수를 생성하는 방법
		  - 0.xxxxxx형태의 실수형 난수를 정수로 변경하기 위해 100을 곱한 후 int로 형변환한다.
		  - 45로 % 연산하여 나머지를 구한(0~44)
		  - 2번의 결과에 +1한다.(1~45)
		  
		 */
		System.out.println("1~45사이의 난수생성 :"+((int)((Math.random()*100)%45)+1));
		System.out.println("=============================");
		
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
		for (int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = (int)((Math.random()*100)%45)+1;
		}
		for (int i=0; i<lottoNum.length; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
	}

}
