package ex11static;

/*
 static 블럭
  - 동일 클래스안의 main메소드보다 먼저 실행되는 블럭으로 main메소드의 실행코드가 없어도 먼저 실행된다.
  - 단, 다른 클래스에 main이 있는 경우에는 main이 순차적으로 실행되다가
  	static블럭이 있는 클래스가 객체화될 때 실행된다.
  - 이 때 생성자보다 static블럭이 먼저 실행된다.
 */
public class StaticBlock {
	
	//인스턴스형 멤버
	int instanceVar;
	void instanceMethod() {}
	
	//정적 멤버
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}

	//static블럭
	static {
		//블럭내에서 정적멤버에 접근 가능.
		staticVar = 1000;
		
		//static 블럭내에서만 사용할 수 있는 변수로써, 이 때는 일반적인 변수를 생성할 수 있다.
		int localVar;
		localVar = 1000;
		System.out.println("locarVar=" +localVar);
		
		//인스턴트형 멤버는 블럭내에서 접근할 수 없다
//		System.out.println("instanceVar=" +instanceVar); //에러발생
//		instanceMethod(); //에러발생
		
		//정적멤버는 접근 가능
		System.out.println("staticVar="+staticVar);
		staticMethod();
		System.out.println("=========static block==========");
	}

	/*
	 외부파일의 main메소드에서실행되는 경우 해당 클래스의객체가 생성자를 통해
	 생성되기 전에 static 블럭이 먼저 실행된다.
	 */
	//생성자 메소드
	public StaticBlock() {
		staticVar = -1;
		System.out.println("====staticBlock의 생성자====");
	}
	
	/*
	 main메소드가 외부파일에 있을 때 실행하기 위해 주석으로 처리함.
	 주석으로 처리한 후 E02StaticBlockMain.java 에서 실행할 것

	 * public static void main(String[] args) { System.out.println("===메인메소드===");
	 * // static블럭내에서 선언된 지역변수이므로 main함수내에서는 사용불가 // System.out.println("localVar="
	 * +localVar);// 에러발생 }
	 */
}
