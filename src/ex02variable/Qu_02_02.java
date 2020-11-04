package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {
		double kor=99;
		double eng=80;
		double math=96;
		double avgDouble=(kor+eng+math)/3;
		
		int avgInt=(int)avgDouble;
		
		System.out.println("평균점수(실수형)="+avgDouble);
		System.out.println("평균점수(정수형)="+avgInt);
	
		/*
		선생님 코드
		int k=99, e=80, m=96;
		double avg1 = (k+e+m+)/3;
		double avg2 = (k+e+m+)/3.0; -> 3.0이 실수타입이므로 avg2에 실수형 결과값이 들어감 
		 */
		
		
				
	}

}
