package bokang;

public class test {
	public static void upgradeGugu() {
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=i; j++) {
				System.out.printf("%dx%d=%d",i,j,i*j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		upgradeGugu();
	}

}
