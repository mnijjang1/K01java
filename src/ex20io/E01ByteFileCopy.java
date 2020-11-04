package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 스트림(Stream)
  - IO모델의 핵심개념이라 할 수 있는 스트림은 '데이터의 흐름' 혹은
  	'데이터의 흐름을 형성해주는 통로' 정도로 정의할 수 있다.
  - 입력(Input)스트림, 출력(Output)스트림으로 나눌 수 있다.
 */
public class E01ByteFileCopy {

	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;
		int copyByte= 0;
		/*
		 IO관련 작업에서는 많은 부분에서 예외처리가 필요하다.
		 이 때 예외를 throws하는 것보다 try~catch로 예외처리하기를 권장하고 있다.
		 예외를 무시하게 되면 문제가 생겼을 때 적절한 조치를 취하기 힘들기 때문이다.
		 */
		try {
			// 원본파일을 읽어 오기 위한 입력스트림 생성
			in= new FileInputStream("src/ex20io/BANDIZIP6.EXE");
			// 복사본을 만들기 위한 출력스트림 생성
			out= new FileOutputStream("src/ex20io/BANDIZIP6_copy.EXE");
			// 원본에서 1byte를 읽어 저장하기 위한 변수
			int bData;
			
			while(true) {
				bData = in.read(); // 원본파일에서 1byte씩 읽어온다.
				
				if (bData==-1) { // 파일을 끝까지 다 읽으면 -1을 반환하므로 반복문을 탈출한다.
					break;
				}
				out.write(bData); // 읽어온 데이터를 복사본으로 출력한다.
				copyByte++; // 1byte를 읽을때마다 +1해준다(복사한 파일의 전체 용량)
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException e) {
			System.out.println("파일스트림 생성시 오류발생");
		}
		finally {
			try {
				//IO작업이 완료되면 스트림을 닫아주는 작업이 반드시 필요하다.
				in.close();
				out.close();
				
				System.out.println("복사된 KByte 크기 : " + (copyByte/1024));
			}
			catch(IOException e) {
				System.out.println("파일스트림 닫기 오류");
			}
		}
	}
}
