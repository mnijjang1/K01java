package ex05method;

/*
 지역 변수(Local Variable)
  - 변수는 사용범위(scope)를 가지고 있고, 해당 지역내에서만 사용가능하다.
  - 해당 지역을 벗어나면즉시 메모리에서 소멸된다.
  - 기본자료형은 스택(stack)이라는 메모리 공간을 사용한다.
  - 스택은 CPU가 메모리의 생성 및 소멸을 주관한다.
 */
public class E06LocalVariable {

	public static void main(String[] args) {
		
		boolean scope = true;
		// int num = 9; 에러발생 -> main 영역에서 num을 선언하면 그 보다 하위 수준에서는 같은 이름의 변수 선언 불가.
		//						  이미 큰 지역에서 선언하여 메모리상에 상주하고 있기 때문이다
		if(scope) {
			int num =1;
			num++;
			System.out.println("첫뻔째 if문지역 :"+num);
		}
		
		else {
			int num= 5;
			System.out.println("첫번째 in문의 else지역:"+num);
		}
		// if문의 블럭에서 선언된 변수 num은 해당 블럭을 벗어나면 메모리에서 선언할 수 있다.
		// 따라서 아래에서 num을 변수로 선언할 수 있다.
		
		int num = 100;
		System.out.println("main 메소드 지역 : "+num);
		
		simpleFunc();
		
		System.out.println("main메소드 끝");
	}

	static void simpleFunc() {
		int num = 1000; // 위에서 num=100으로 선언하여 아직 메모리에서 남아있지만
						// simpleFunc() 메소드는 main과 동일 수준이더라도
						// 서로 다른 지역에 정의되었으므로 같은 이름으로 선언 가능하다.
		System.out.println("simple 메소드 지역 :"+num);
	}
}
