package ex09package.kosmo.seller;

public class FruitSeller4{
	int numOfApple; // 판매자의 사과 보유 갯수
	int myMoney; // 판매 수익
	final int APPLE_PRICE; // 사과의 단가 // (소문자 변경:블럭후 컨트롤+쉬프트+y, 대문자는 +x)
	public FruitSeller4(int money, int appleNum, int price) {
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
