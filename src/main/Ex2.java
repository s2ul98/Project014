package main;


// 런타임 오류 :
// 프로그램 실행 중에 발생하는 오류
public class Ex2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[5] = 5; // ArrayIndexOutOfBoundsException 에러남
		
		System.out.println("프로그램이 종료되었습니다");
		// 프로그램이 비정상적으로 종료되어 마지막 코드가 실행이 안됨
		
		// 실제 서비스 운영...
	}

}
