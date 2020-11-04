package ex08class;

// 과일판매자를 추상화한 클래스
class FruitSeller3{
	int numOfApple; // 판매자의 사과 보유 갯수
	int myMoney; // 판매 수익
	final int APPLE_PRICE; // 사과의 단가 // (소문자 변경:블럭후 컨트롤+쉬프트+y, 대문자는 +x)
//		-> 변수에서 다시 상수로 변겸함
//		      상수는 단 한번만 초기화되는 특성을 가지고 있기 때문에 일반적인 멤버메소드내에서는 초기화 불가능.
//		      하지만 생성자 메소드에서는 초기화가 가능하다.
//		-> 마음대로호출할 수 없고, 객체생성시 단 한번만 호출되는 특성이 동일하므로
//		      한 번 이상 초기화되지 않음이 보장되기 때문이다
	
	/*
	 E06FruitSalesMain2에서 선언한 initMembers 멤버메소드를 생성자로 변경
	  - initMembers 대신 클래스명과 같은 FruitSeller3으로 대체하고 반환값이 없으므로 void 삭제
	 FruitBuyer3도 마찬가지로 변경
	 */
	public FruitSeller3(int money, int appleNum, int price) {
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
class FruitBuyer3{
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney =_myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	// 구매자의 현재상태를 출력하는 멤버메소드	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		
		/*
		초기화메소드를 생성자로 변경하였으므로 아래와 같이 코드가 간단해졌다
		 FruitSeller3 seller1 = new FruitSeller3();
		 seller1.initMembers(0, 100, 1000);
		 => FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		 */
		//판매자1 초기화
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		//판매자2 초기화
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
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
	}

}
