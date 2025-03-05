package quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		// 정수가 아닌 다른걸 입력했을 시 나오는 에러코드를 예외처리 하는법
		
		// Scanner : 키보드를 통해 값을 입력받는 기능
//		Scanner scanner = new Scanner(System.in);
		// nextInt : 정수를 입력받는 함수
//		int num = scanner.nextInt(); // 다른 타입의 값이 들어와서 에러남
//		System.out.println("프로그램이 정상적으로 종료되었습니다");

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("정수를 입력하세요.");
			int num = scanner.nextInt(); 
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}

}
