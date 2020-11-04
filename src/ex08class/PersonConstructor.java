package ex08class;

/*
 생성자(Constructor)
  - 쿨래스를 객체화(인스턴스)할 때 자동으로 호출되는 메소드
  - 자동으로 호출되며, 개발자가 임의로 호출할 수 없다.
  - 반환값이 없다. 즉 특정 연산후 값을 반환할 수 없다.
  	따라서, 애초에 반환값이 없기 때문에 void를 쓰지 않는다.
  - 그 외에는 메소드가 가진 모든 특성을 가지고 있다(매개변수 전달, 오버로딩 등)

 생성자 내에서 this 사용법
  - 용도1
  	동일 클래스 내에서 다른 생성자를 호출할 때 사용한다.
  	단, 생성자 내에서만 호출 가능하다.
  	사용법 :
  		this(인자1, 인자2, ....);
  - 용도2
  	생성자내에서 멤버변수와 매개변수의 이름이 동일할 때 구분하기 위해 사용.
  	this.변수 => 멤버변수
  	변수=> 생성자의 매개변수
  	단, 이름이 서로 다르다면 this는 생략해도 된다.
  	주로 명시적인 코드작성을 위해 사용된다.
 */
public class PersonConstructor {

	//멤버변수
	String name;
	int age;
	String addr;
	
	/*
	 생성자 메소드
	  - 해당 클래스에 생성자를 정의하지 않은 경우에 아래와 같은
	 	매개변수, 실행부가 없는 생성자가 자동으로 삽입된다.
	  - 단, 생성자를 하나라도 정의하면 디폴트 생성자는 삽입되지 않는다(주의) 
	 */
	//public PersonConstructor(){}
	
	//생성자1 : 기본생성자 - ()안에 인자가 없는 생성자
	public PersonConstructor(){
		name = "이름없음";
		age = 0;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다.");
	}
	
	//생성자2 : 인자생성자 - ()안에 인자가 한 개 이상 있는 생성자
	public PersonConstructor(String name) {
		this.name = name; // 멤버변수와 매개변수를 구분하기 위해 this 사용(this가 있는 쪽이 멤버변수)
		age = 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1] 입니다");
	}
	
	public PersonConstructor(String name, int age) {
		/*
		 this()는 생성자내에서 또 다른 생성자를 호출할 때 사용.
		 단, 생성자내에서만 사용가능하고, 일반 멤버메소드에서는 사용이 불가능.
		 */
		this(name, age, "미상"); 
		System.out.println("나는 인자생성자[2] 입니다");
	}
	
	public PersonConstructor(String _name, int age, String addr) {
		name = _name; // 변수명이 비숫하지만 구분이 가능한 경우에는 this를 쓰지 않아도 된다.
		this.age = age; // 변수명이 동일한 경우에는 this를 사용하는 것을 권장한다.
		this.addr = addr;
		System.out.println("나는 인자생성자[3] 입니다.");
	}

	//멤버메소드 : 멤버변수를 초기화 할 목적으로 정의한 메소드
	void initialize(String name, int age, String addr) {
		//this(name, age, "미상"); 에러발생 -> 생성자 호출을 위한 this()는 생성자 내에서만 가능하기 때문
		this.name =name; // 변수명을 구분하기 위한 this는 멤버메소드내에서도 사용 가능 
		this.age=age;
		this.addr=addr;
	}
	
	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n", this.name);//변수명 구분을 위한 this 사용 가능 확인용으로 써봄
		System.out.printf("나이 :%d\n", age);
		System.out.printf("주소 :%s\n", addr);
	}
	
}