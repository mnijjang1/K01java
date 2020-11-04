package ex15usefulclass;

class MyClass {
	int data;
	public MyClass(int data) {
		this.data = data;
	}
	
	// toString() - 실제 저장된 데이터가 반환되도록 Object 클래스로부터 상속받아 오버라이딩한 메소드
	@Override
	public String toString() {
//		return data; - 에러 발생 - data는 int 타입이므로 String 타입인 toString()의 반환값이 될 수 없음.
		return String.valueOf(data); // 숫자를 문자열 형태로 변환해줌.
	}
	
	/*
	 MyClass 형의 객체를 비교하기 위해 오버라이딩한 메소드
	 객체가 가지고 있는 멤버 변수의 비교(주소값이 아닌 실제값)를 통해 동일 여부를 판단.
	 */
	@Override
	public boolean equals(Object obj) { 
		// 매개변수로 전달된 객체를 Object로 받은 후 MyClass로 형변환이 가능한 인스턴스인지를 먼저 판단한다.
		if(obj instanceof MyClass) { 
			MyClass mc = (MyClass)obj; // Object타입으로 전달된 매개변수를 MyClass형으로 다운캐스팅
			
			if(mc.data == this.data) { // 두 객체의 멤버변수의 실제값을 비교함
				return true; // 값이 같으면 true
			}
			else {
				return false; // 값이 다르면 false
			}
		}
		else { // 매개변수로 받은 객체가 MyClass의 인스턴스가 아니라면 비교의 대상이 아니므로 바로 false를 반환한다.
			return false;
		}
	}
}

class Point {
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 객체 1, 2 의 x, y값을 동시에 비교하여 둘 다 동일할 때 같은 객체로 판단하도록 오버라이딩 했음
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point pos = (Point)obj;
			if(this.x==pos.x && this.y==pos.y) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	// x, y 좌표를 출력하도록 오버라이딩
	@Override
	public String toString() {
		return "x="+ String.valueOf(x) +", y=" + String.valueOf(y);
//		-> ""이 중간 중간에 삽입되어 있으므로 12라인과 다르게 그냥 x, y만 넣어도 return값 전체를 문자열로 인식하므로
//			굳이 String.valueOf(x)로 넣을 필요가 없다.
	}
}

public class E04Object3Equals {

	public static void main(String[] args) {

		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("[두 객체를 equals()메소드로 비교]");
		
		if(mc1==mc2) { // 두 객체의 참조값(주소값)에 대한 비교
			System.out.println("인스턴스 참조값(주소값)이 같다.");
		}
		else {
			System.out.println("인스턴스 참조값(주소값)이 다르다.");
		}
		
		// 두 객체의 멤버변수값에 대한 비교
		System.out.println(mc1.equals(mc2)?"같다":"다르다");
		
		//toString() 메소드에 오버라이딩 한 내용을 출력. 출력결과는 동일함.
		System.out.println("[두 객체의 toString()메소드 호출]");
		System.out.println("mc1.toString() =>" + mc1.toString());
		System.out.println("mc2=>"+mc2);
		
		Point pos1 = new Point(10,20);
		Point pos2 = new Point(10,30);
		
		System.out.println("두 점의 비교결과");
		System.out.println(pos1.equals(pos2)?"같다":"다르다");
		System.out.println("서로 다른 객체의 비교결과" +pos1.equals(mc1)); // 서로 다른 객체에 대한 비교
		
		/*
		 아래 toString() 메소드는 굳이 호출하지 않아도 print()문이 실행될 때
		 자동으로 호출하므로 아래 출력결과는 동일하다
		 */
		System.out.println("pos1.toString()=>"+ pos1.toString());
		System.out.println("pos2.toString()=>"+ pos2.toString());
		System.out.println(pos1);
		System.out.println(pos1);
	}

}
