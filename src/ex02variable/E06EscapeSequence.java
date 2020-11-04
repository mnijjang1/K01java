package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {
		
		//tab(탭) 기능, 스페이스 4칸이 띄워짐
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t벚꽃~~!");
		
		//줄바꿈(Line feed) 기능
		System.out.println("KOSMO에 오신걸 환영합니다.\n");
		System.out.println("열심히\n해봅시다.\n");
		
		// 쌍따옴표를 표현하고 싶을때 사용
		// System.out.println("나는 "개발자"가 되고싶어요"); 에러발생 "로 인해 개발자를 변수 취급하나 개발자는 한글이라 변수명이 될수 없음
		System.out.println("나는 \"개발자\"가 되고싶어요");
		
		//printf() : 문자열을 서식에 맞춰 출력할 때 사용.
		int kor=81, eng=97, math=79;
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n",kor,eng,math);
		System.out.println("국어:"+kor+", 영어:"+eng+", 수학:"+math);
		
		double avg=(kor+eng+math)/3.0;
		System.out.printf("평균점수:%f%n",avg);
		
		/*
		 서식에 있어서 숫자의 역할
		  - +는 우측정렬, -는 좌측정렬
		  - 숫자는 확보할 자리수를 지정(3이면 3칸, 10이면 열칸을 강제로 할당, 소수점의 .도 한칸을 차지)
		  - 소수점 이하의 숫자는 소수점을 몇번째 자리까지 표현할지 지정(.2는 소수점 2자리)
		  - ex)7.4를 입력하면 총7칸의 자리를 확보하고 소수점 4번째 자리까지 표시하며 우측정렬한다
		 */
		System.out.printf("국어:%d, 영어:%d, 수학:%d,"+" 평균:%f %n", kor,eng,math,avg);
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d,"+"평균:%7.2f%n", kor,eng,math,avg);
		System.out.printf("국어:%6d, 영어:%-6d, 수학:%-6d,"+"평균:%-7.2f%n", kor,eng,math,avg);
	
				
	}

}
