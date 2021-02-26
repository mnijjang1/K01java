package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.connect.IConnectImpl;

public class InsertShop extends IConnectImpl{
	
	public InsertShop() {
		super(ORACLE_DRIVER, "kosmo", "1234");
	}
	
	@Override
	public void execute() {
		
		try {
			String query = "INSERT INTO sh_goods VALUES "
					+ " (goods_seq.nextval, ?, ?, ?, ?)";
			
			psmt = con.prepareStatement(query);
			
			psmt.setString(1,  scanValue("상품명"));
			psmt.setString(2,  scanValue("상품가격"));
			psmt.setString(3,  scanValue("상품코드"));

			Scanner scan = new Scanner(System.in);
			System.out.println("상품명 : ");
			String name = scan.nextLine();
			System.out.println("상품가격 : ");
			int price = scan.nextInt();
			System.out.println("상품코드 : ");
			int code = scan.nextInt();
			
			//psmt.setString(1, sequence);
			psmt.setString(1, name);
			psmt.setInt(2, price);
			psmt.setInt(4, code);
			
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			psmt.setDate(3, sqlDate);
			
			int affected = psmt.executeUpdate();
			System.out.println(affected + "행이 입력되었습니다.");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		
		new InsertShop().execute();
	}

}
