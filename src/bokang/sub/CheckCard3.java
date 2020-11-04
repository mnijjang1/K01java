package bokang.sub;
/*
체크카드 클래스 Ver.03
	: initMembers 초기화 메소드는 삭제처리 
	
	1.충전은 10000원 단위로만 가능하다.
	만약 5000원을 충전하면 충전불능으로 처리한다.
	
	2.잔고가 부족하면 결제불능으로 처리해야 한다.
	
	3.카드번호 생성시 0으로 시작할수 없고 전체자리수는 16자리여야
	한다.(보류)
	
	4.생성자 오버로딩 처리
		new CheckCard3(카드번호, 소유자, 잔고, 포인트);
		new CheckCard3(카드번호, 소유자, 잔고); => 포인트 0으로 초기화
		new CheckCard3(카드번호, 소유자); => 잔고, 포인트 0으로 초기화
	
	5.포인트 적립율 변경
		10만원 이하결제 : 0.1%적립
		10만원 초과결제 : 0.3%적립
 */


public class CheckCard3 {
	// 멤버변수
	private long cardNumber;
	private String owner;
	private int balance;
	private int point;
	
	// 카드 번호가 정상인지 확인하기 위한 메소드
	public boolean cardNumberRange(long cn) {
		if (cardNumber >= 1000_0000_0000_0000L &&
				cardNumber <= 9999_9999_9999_9999L) {
			return true;
		}
		else {
			return false;
		
		}
	}
	public CheckCard3() {} // 기본생성자
	
	//인자생성자
	public CheckCard3(long cardNumber, String owner, int balance, int point) {
		// 카드번호의 자리수가 틀릴경우 생성불능 처리
		if (cardNumberRange(cardNumber)==false) {
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
	public CheckCard3(long cardNumber, String owner, int balance) {
		// 카드번호의 자리수가 틀릴경우 생성불능 처리
		if (cardNumberRange(cardNumber)==false) {
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = 0;
	}
	
	public CheckCard3(long cardNumber, String owner) {
		// 카드번호의 자리수가 틀릴경우 생성불능 처리
		if (cardNumberRange(cardNumber)==false) {
			System.out.println("카드생성불능");
			return;
		}
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = 0;
		this.point = 0;
	}
	/*
	  멤버변수가 private으로  선언되면 클래스 내부에서만 접근가능하므로
	  외부에서의 접근을 위해 getter/setter를 필수적으로 생성해야한다.
	 */
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	// 멤버메소드
	// 충전
	public void charge(int amount) {
		if ((amount % 10000) == 0) {
			this.balance += amount; // 잔액에 충전할 금액을 더한다.
		}
		else {
			System.out.println("10000원 단위로만 충전할 수 있습니다.");
		}
	}
	// 결제
	public void payment(int amount) {
		if (amount <= 0) {
			System.out.println("결제금액이 잘못되었습니다.");
		}
		if (this.balance >= amount) {
			this.balance -= amount; // 잔액에 결제한 금액을 뺀다.
			savingPoint(amount); // 카드를 사용할 때 적립금이 발생하게 되므로 호출한다.
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	// 적립
	public void savingPoint(int amount) {
		// this.point += (amount * 0.1);
		
		double plusPoint = 0;
		if (amount <=100000) {
			plusPoint = (amount * 0.1);
		}
		else {
			plusPoint = (amount * 0.3);
		}
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
