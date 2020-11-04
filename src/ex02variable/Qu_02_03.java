package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {
		double round=10;
		double area_double=round*round*3.14;
		
		int area_int=(int)area_double;
		float area_float=(float)area_double;
		
		System.out.println("int형 넓이:"+area_int);
		System.out.println("float형 넓이:"+area_float);
		System.out.println("double형 넓이:"+area_double);
		
		/*
		 선생님 코드
		int rad = 10;
		final double PI=3.14; 
		
		int area_int;
		float area_float;
		double area_double;
		
		area_int=(int)(rad*rad*PI);
		area_float=(float)(rad*rad*PI);
		area_double=rad*rad*PI;
		 */

				
	}

}
