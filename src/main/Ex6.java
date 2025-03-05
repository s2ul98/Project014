package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 반드시 예외처리 해야하는 이유
public class Ex6 {

	public static void main(String[] args) {
		
		// FileInputStream : 파일과 프로그램을 연결하는 통로
		// 프로그램을 통해서 파일에 내용을 작성하거나 읽어올 떄 사용함
		// 13장에서 배운 스트림과 다름 스트림
		
		// FileInputStream 클래스를 사용할 때 에러남
		// Unhandled exception type FileNotFoundException
		// => FileNotFoundException 에러가 발생할 수 있으니 예외처리를 미리 하라는 의미
		
		// a라는 파일이 없으면 프로그램 중간에 에러가 발생할 수도 있음
		
		
		// FileInputStream : checked Exception
		// 컴파일러가 미리 체크하여 예외처리를 하라고 알려줌
//		FileInputStream fis = new FileInputStream("src/main/a.txt"); // try/satch누르면 하단처럼 자동으로 써짐
		
		try {
			FileInputStream fis = new FileInputStream("src/main/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}

}
