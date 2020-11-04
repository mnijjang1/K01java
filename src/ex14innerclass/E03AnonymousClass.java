package ex14innerclass;

/*
 익명 클래스(Anonymous Class)
  - 이름이 없는 클래스를 말한다.
  - 내부 클래스처럼 GUI 프로그램에서 많이 사용된다.
  - 부모 클래스의 메소드를 오버라이딩 하는 것이 목적이다.
  	-> 장점 - 기존의 상속관계 선언에 비해 훨씬 간략하다.
  	-> 단점 - 자식클래스명(익명)이 없으므로 다운캐스팅이 불가능하여 익명 클래스에서 선언한 멤버는 외부에서 사용 불가.  
  - 클래스를 정의하는 방법이 마치 메소드를 정의하는 형식과 비슷하다.
  - 마지막에 세미콜론을 반드시 써줘야 한다.
  
  형식]
  	부모클래스명 참조변수 = new 부모클래스명() {
  		익명클래스의 실행부;
  		부모클래스의 메소드 오버라이딩;
  	};
  ※ 부모클래스를 상속받아 이름 없는 자식 클래스를 생성하는 개념으로 이해하면 된다.
  상속되기 때문에 오버라이딩이 가능하게 된다.
  즉, {} 안쪽은 '자식'의 영역이다
 */
class Person {
	String name;
	public Person(String n) {
		name = n;
	}
	
	void printInfo() {
		System.out.println(String.format("이름:%s",  name));
	}
}

class Student extends Person {
	String stNumber;
	public Student(String n, String stNum) {
		super(n);
		stNumber = stNum;
	}
	
	// 자식에서 확장한 멤버 메소드(부모에는 정의되지 않음)
	String getInfo() {
		return String.format("학번:%s",  stNumber);
	}
	
	// 오버라이딩한 메소드(부모에도 정의되어 있음)
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(getInfo());
	}
}

abstract class AbstractClass { // 추상클래스
	abstract void abstractMethod();
}

interface InterFace { // 인터페이스
	void abstractMethod();
}

public class E03AnonymousClass {

	public static void main(String[] args) {

		/*
		 Student라는 이름을 가진 자식 클래스를 통해 객체를 생성하고 부모의 참조변수로 참조하는 이질화의 형태.
		 참조변수가 부모타입이므로 자식객체에서 생성한 멤버 변수&메소드에 직접 접근하는 것은 불가능하고
		 접근시에는 반드시 다운캐스팅(강제 형변환)이후에 접근해야함.
		 */
		Person person = new Student("문사람", "2016");
		person.printInfo();
//		person.stNumber = "2015"; // 에러발생
		((Student)person).stNumber = "2015"; // 다운캐스팅
		System.out.println(((Student)person).getInfo());
		
		/*
		 Person클래스를 상속받은 익명 클래스 정의
		  - Person 타입의 인스턴스 변수에 Person을 상속받은 익명클르스를 생성해서 그 주소를 할당한다.
		  - 개념적으로 new Person(){}; -> 익명 extends Person(); 형태로 생각하면 된다.
		  - 이름이 없는 객체이므로 부모클래스의 이름을 빌려서 객체를 생성했다고 생각하면 된다.
		 */
		Person anonyPerson = new Person("이말년") {
			/*
			 자식(익명 클래스) 객체에서 새롭게 확장한 멤버
			 아래 멤버는 익명 클래스내에서만 접근이 허용된다.
			  - 이름이 없으므로 다운캐스팅 선언이 불가능하기 때문이다.
			  - 따라서 익명클래스에서는 멤버의 확장을 거의 사용하지 않는다.
			 */
			int newVar;
			void newMethod() {
				System.out.println("익명클래스에서 새롭게 확장한 메소드");
			}
			
			// 오버라이딩 하여 재정의한 메소드
			@Override
			void printInfo() {
				System.out.println("newVar="+newVar);
				newMethod();
				System.out.println("익명클래스에서 오버라이딩");
			}
		};
		anonyPerson.printInfo(); // 접근 가능 - 오버라이딩은 가능하기 때문.
//		anonyPerson.newMethod(); // 에러 발생 - 익명 클래스에서 확장한 멤버이므로 접근 불가
		
		// Student 클래스를 상속받아 정의한 익명클래스(즉, Student의 하위 객체)
		Student anonyStudent = new Student("김사랑", "2017") {
			
			int age = 1;// 익명클래스에서 확장한 멤버변수
			
			@Override
			String getInfo() {
				return super.getInfo() + ", 나이:"+ age;
			}
			
			@Override
			void printInfo() {
				System.out.println("이름:"+ name +","+ getInfo());
			}
		};
		
		System.out.println("[Student 클래스를 상속받은 익명클래스]");
		anonyStudent.printInfo();
		
		// 하위 익명클래스에서 확장한 변수이므로 익명 객체를 통해서는 접근 불가함.
//		anonyStudent.age = 100; // 부모 타입으로 선언되었으므로 자식 영역의 멤버변수에 접근 불가
//		((Student)anonyStudent).age = 100; // 에러발생 - 다운캐스팅 불가능
		
		/*
		 다운캐스팅은 '(자식클래스명)부모타입의 참조변수명'의 형태로 변환하여 하위 클래스의 멤버에 접근하기 위한 수단.
		 그러나 익명 클래스는 클래스명이 없기 때문에 다운 캐스팅 선언 자체가 불가능하다.
		 즉, 익명 클래스에서는 새롭게 정의한 멤버에 접근할 수 없다.
		 익명클래스는 오버라이딩의 목적으로만 사용해야 한다.
		 */
		
		/* 139라인 에러발생
		Person anonyTest = new Student("다운캐스팅", "안되용") {
			String jumin = "001024";
		};
		((Student)anonyTest).jumin = "181105"; 
		*/
		
		// 추상 클래스를 상속받은 익명 클래스
		AbstractClass ac = new AbstractClass() {
			String abStr = "확장변수";
			
			@Override
			void abstractMethod() {
				System.out.println("추상메소드 오버라이딩");
				System.out.println("abStr=" + abStr);
			}
		};
		ac.abstractMethod();
		
		// 인터페이스를 구현한 익명클래스
		InterFace in = new InterFace() {
			int interVar = 100;
			
			@Override
			public void abstractMethod() {
				System.out.println("인터페이스의 추상메소드 오버라이딩");
				System.out.println("interVar="+ interVar);
			}
		};
		in.abstractMethod();
	}
}
