package ex08class;

// 과일판매자를 추상화한 클래스
class FruitSeller2{
	int numOfApple; // 판매자의 사과 보유 갯수
	int myMoney; // 판매 수익
	int apple_price; // 사과의 단가 // (소문자 변경:블럭후 컨트롤+쉬프트+y, 대문자는 +x)
//		-> 상수에서 변수로 변겸함
//		      상수는 단 한번만 초기화되는 특성을 가지고 있기 때문에 일반적인 멤버메소드내에서는 초기화 불가능.
//		      멤버메소드는 개발자가 원할 때 언제든지 호출할 수있으므로 상수의 특성과는 맞지 않기 때문.
	
	//E06FruitSalesMain1에서 새로 추가된 멤버 메소드. 이에 따라 메인함수 코드도 조금 바뀜
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	public int saleApple(int money) {
		int num = money / apple_price;
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
class FruitBuyer2{
	int myMoney; //보유금액
	int numOfApple; //구매한 사과의 갯수
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney =_myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	// 구매자의 현재상태를 출력하는 멤버메소드	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:" + myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}

public class E06FruitSalesMain2 {

	public static void main(String[] args) {
		
		//초기화메소드를 정의하였으므로 각각 성격이 다른 객체들을 생성할 수 있다.
		//판매자1 초기화
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		
		//판매자2 초기화
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
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
