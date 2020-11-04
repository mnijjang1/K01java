//문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
//파일명 : Qu_04_08.java
//
//실행결과]
//* * * * *
//* * * *
//* * *
//* *
//*

package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


// 선생님 코드
// final int FLOOR = 5;
// for(int x=1; x<=FLOOR; x++){
// 	for(int y=1; y<=(FLOOR-x+1); y++){
// 		System.out.print("*");
//	}
//		System.out.println();
//}
