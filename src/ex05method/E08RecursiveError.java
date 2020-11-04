package ex05method;

public class E08RecursiveError {

	public static void main(String[] args) {
		showHi(3);
	}
	/*
	 오류코드
	  - 감소연산자로 인해 cnt의 값은 줄어들지만 조건식의 위치가 잘못되어 무한루프에 빠진다.
	  - 재귀호출을 하기 전에 종료체크를 할 수 있도록 수정해야 한다.
	 스택오버플로우(Stack Overflow)
	  - 스택은 함수가 종료되기 전까지의 모든 정보를 저장하는 메모리로
	  	유한한 공간이기 때문에 무한 루프에 빠지게 되면 저장능력을 초과하여 해당 에러가 발생하게 된다.
	 */
	public static void showHi(int cnt) {
		System.out.println("Hi~!");
		System.out.println("cnt="+cnt);
		
//		showHi(--cnt); 에러코드
//		if(cnt==1) {
//			return;
		
		if(cnt==1) { // 수정코드
			return;
		}
		showHi(--cnt); 
		/*
		 --cnt와 cnt--는 다르다 감소연산자가 뒤에 있으면 cnt의 값이 감소하기전에 함수를 호출해버리므로 무한루프.
		  - --cnt
		 	3,2,1...
		  - cnt--
		 	showHi(3)만을 무한 반복한다.
		 */
	}
}
