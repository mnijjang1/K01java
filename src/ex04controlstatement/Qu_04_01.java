package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {

		System.out.print("문자하나를 입력하세요 : ");
		int aCode = System.in.read();
		
		if (aCode<48 || aCode>56) {
			System.out.println("숫자가 아닙니다.");
		}
		else if (aCode%2==0) {
			System.out.println("2의 배수입니다.");
		}
		else {
			System.out.println("2의 배수가 아닙니다.");
		}
				
		/*
		 아스키코드 모를때
		  - 입력받은 문자가 숫자형 문자인지 판단하여 boolean값 저장
		  - 숫자형 문자가 가지고 있는 아스키 코드값에서 48(문자형 0의 아스키코드)을 빼면
		  	해당 문자의 정수가 된다
		 
		 boolean isNumber = (aCode>='0' && aCode<='9')
		 if(isNumber == true)
		 {
		 	if((aCode-'0') % 2 ==0)
		 	{
		 	System.out.println("2의 배수입니다.");
		 	}
		 	else
		 	{
		 	System.out.println("2의 배수가 아닙니다.");
		 	}
		 }
		 else
		 {
		 	System.out.println("숫자가 아닙니다.");
		 }
		 */
	}

}
