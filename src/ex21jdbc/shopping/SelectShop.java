package ex21jdbc.shopping;

import java.sql.SQLException;
import java.util.Scanner;

import ex21jdbc.statement.ConnectDB;

public class SelectShop extends ConnectDB{
	
	public SelectShop() {
		super();
	}
//	G_IDX, GOODS_NAME, GOODS_PRICE, REGIDATE, P_CODE
	
	@Override
	public void execute() {
		try {
			stmt = con.createStatement();
			
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 상품명 : ");
			String searchName = scan.nextLine();
			String query = "SELECT G_IDX, GOODS_NAME, GOODS_PRICE, "
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi'), "
					+ " P_CODE FROM sh_goods WHERE goods_name like '%"+searchName+"%'";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int idx = rs.getInt(1); 
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String strPrice = String.format("%,d", price);
				String regidate = rs.getString(4);
				int code = rs.getInt(5);
				
				System.out.printf("%d %s %s %s %d\n", idx, name, strPrice, regidate, code);
			}
		
		}
		catch(SQLException e) {
			System.out.println("쿼리오류발생");
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {
		SelectShop selectSQL = new SelectShop();
		selectSQL.execute();
	}

}
