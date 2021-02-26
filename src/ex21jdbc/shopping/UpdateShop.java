package ex21jdbc.shopping;

import java.sql.Types;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class UpdateShop extends IConnectImpl{
	
	public UpdateShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("수정할 상품의 일련번호 : ");
			String idxInput = scan.nextLine();
			System.out.println("상품명을 수정해주세요 : ");
			String nameInput = scan.nextLine();
			System.out.println("상품의 가격을 수정해주세요 : ");
			int priceInput = scan.nextInt();
			System.out.println("상품의 제품코드를 수정해주세요 : ");
			int codeInput = scan.nextInt();
			
			csmt.setString(1, nameInput);
			csmt.setInt(2, priceInput);
			csmt.setInt(3, codeInput);
			csmt.setString(4, idxInput);
			csmt.registerOutParameter(5, Types.NUMERIC);
			csmt.execute();
			
			System.out.println("삭제프로시저 실행결과 : ");
			System.out.println(csmt.getInt(5));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		new UpdateShop().execute();

	}

}
