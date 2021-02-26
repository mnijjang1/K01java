package ex21jdbc.shopping;

import java.sql.Types;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class DeleteShop extends IConnectImpl{
	
	public DeleteShop() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopDeleteGoods(?,?)}");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("삭제할 상품의 일련번호 : ");
			int idxInput = scan.nextInt();
			csmt.setInt(1, idxInput);
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.execute();
			
			System.out.println("삭제프로시저 실행결과 : ");
			System.out.println(csmt.getInt(2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		
		new DeleteShop().execute();
	}

}
