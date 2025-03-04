package main;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			arr[5] = 5;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
	}
		// 발생한 오류와 일치하는 catch 블록을 찾아서 실행
		System.out.println("프로그램이 정상적으로 종료가 되었습니다");
}
}