package ex10accessmodifier;

// 과일판매자를 추상화한 클래스
class FruitSeller5{
	int numOfApple; // 판매자의 사과 보유 갯수
	int myMoney; // 판매 수익
	final int APPLE_PRICE; // 사과의 단가 // (소문자 변경:블럭후 컨트롤 + 쉬프트 + y, 대문자는 +x)

	public FruitSeller5(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	// 판매자의 현재상태를 출력하는 멤버메소드
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}
}

// 과일구매자를 추상화한 클래스
class FruitBuyer5{
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney =_myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	// 구매자의 현재상태를 출력하는 멤버메소드	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E02FruitSalesMain5 {

	public static void main(String[] args) {
		
		//판매자1 초기화
		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		
		//판매자2 초기화
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		// 구매자가 판매자에게 5000원을 지불하고 사과를 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();

		
		
		/*
		 아래의 코드는 문법적으로는 오류가 없으나 지불금액과
		 구매한 사과의 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
		 즉, 코드(메소드)로 구현한 규칙이 완전히 무너지게 된다.
		 객체지향 프로그래밍에서는 이런 오류를 막기 위해 멤버변수에 대한 "정보은닉"을 하도록 규정하고 있다.
		 */
		seller1.myMoney += 1000; // 판매자1에게 1000원을 지불하고
		seller1.numOfApple -= 50; // 사과 50개를 구매했다.
		buyer.numOfApple += 50;
		
		seller2.myMoney += 1000; // 판매자2에게 1000원을 지불하고
		seller2.numOfApple -= 70; // 사과 70개를 구매했다.
		buyer.numOfApple += 70; // 하지만 구매자의 보유금액은 차감되지 않았다.
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
