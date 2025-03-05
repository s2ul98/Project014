package main;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			// 에러가 발생할 가능성이 있는 코드를 작성
			arr[5] = 5;
		} catch (ArithmeticException e) {
			// 에러가 발생했을 때 처리할 코드를 작성
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
	}
		// 발생한 오류와 일치하는 catch 블록을 찾아서 실행
		
		// 예외처리를 하면 에러가 발생해도 프로그램이 정상적으로 종료된다
		// 예외처리를 안하면 에러가 발생했을때 프로그램이 중간에 종료된다
		System.out.println("프로그램이 정상적으로 종료가 되었습니다");
}
}