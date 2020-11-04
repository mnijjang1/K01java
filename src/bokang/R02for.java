package bokang;

public class R02for {
	/*
	 while : 반복 횟수가 명확하지 않을때
	 do~while : 반복 횟수가 명확하지 않으며, 무조건 1번 이상 실행시키고 싶을 때
	 for : 반복 횟수가 명확할 때 사용하며 3가지 반복문 중 사용빈도가 가장 높음
	 */
	public static void main(String[] args) {
		
		//시나리오 1~10까지의 합을 구하는 while문을 작성하시오.

		int a=1, sum1=0;
		while (a<=10) { // 조건에 따라 while문으로 진입 안할 수도 있음
			sum1 += a;
			a++;
		}
		System.out.println("1~10의 합 = " +sum1);

		// 시나리오 : 위에서 만든 프로그램을 do~while문으로 변경하시오.
		
		int b=1, sum2=0;
		do { // 일단 진입하기 때문에 최소한 1번은 무조건 실행
			sum2 += b;
			b++;
		}
		while (b<=10); // 조건을 만족하면 do로, 불만족이면 아래줄로.
		System.out.println("1~10의 합 = " +sum2);

		// 시나리오 : 위에서 만든 프로그램을 for문으로 변경하시오.
		
		int sum3 = 0;
		for (int i=1; i<=10; i++) {
			sum3 += i;
		}
		System.out.println("1~10의 합 = " +sum3);
		
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		
		int dice=6;
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				if (i+j==dice) {
					System.out.printf("%d+%d=%d%n",i,j,dice);
				}
			}
		}

		// 연습문제] 위 문제를 do~while문으로 변경해보세요
		
		int m=1;
		do {
			int n=1;
			do {
				if (m+n==6) {
					System.out.printf("%d+%d=6%n",m,n);
				}
				n++;
			}
			while(n<=6);
			m++;
		}
		while(m<=6);
		
		
		/*
		연습문제] 방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
		단, x,y의 범위는 0~10사이의 정수이고 while문을 통해
		구현하시오.
		실행결과]
			x=0, y=3
			x=2, y=2
			.......
		 */
		
		int x=0;
		while (x<=10) {
			int y=0;
			while (y<=10) {
				if ((2*x)+(4*y)==12) {
					System.out.printf("x=%d, y=%d%n",x,y);
				}
				y++;
			}
			x++;
		}
		
		/*
		문제) 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의
		결과를 계산하는 프로그램을 작성하시오.
		 */
		
		int total = 0;
		for (int k=1; k<=10; k++) {
			for (int l=1; l<=k; l++) {
				total +=l;
				if (k==1) {
					System.out.print(l);
				}
				else if (k!=1 && l==1) {
					System.out.print("("+l+"+");
				}
				else if (k!=1 && l==k) {
					System.out.print(l+")");
				}
				else
					System.out.print(l+"+");
			}
			if (k==10) {
				System.out.print("="+total);
			}
			else 
				System.out.print("+");
		}
	}
}
