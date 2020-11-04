package bokang.sub;
/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태 출력
	적립율 : 사용금액의 0.1%	
*/

public class CheckCard1 {
	// 멤버변수
	public long cardNumber;
	public String owner;
	public int balance;
	public int point;
	
	// 멤버메소드
	// 충전
	public void charge(int amount) {
		this.balance += amount; // 잔액에 충전할 금액을 더한다.
	}
	// 결제
	public void payment(int amount) {
		this.balance -= amount; // 잔액에 결제한 금액을 뺀다.
		savingPoint(amount); // 카드를 사용할 때 적립금이 발생하게 되므로 호출한다.
		
	}
	// 적립
	public void savingPoint(int amount) {
		// this.point += (amount * 0.1);
		double plusPoint = (amount * 0.1);
		this.point += plusPoint;
		//더블인 plusPoint를 int인 balance에 넣는데 에러 발생안함
		//원래 강제 형변환 해야하나 복합연산자 '+='가 쓰일때는 자동으로 형변환 일어나기 때문임
	}
	// 현재상태 출력(멤버변수)
	public void showState() {
		System.out.println("=============================");
		System.out.println("카드번호 : "+ cardNumber);
		System.out.println("소유자 : "+ owner);
		System.out.println("잔고 : "+ balance);
		System.out.println("포인트 : "+ point);
		System.out.println("=============================");
	}
}
