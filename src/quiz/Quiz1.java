package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 나누기 연산에서 나누는 값으로 0을 쓰면 ArithmeticException 에러 발생
		
		// 다음 코드를 실행하면 에러가 발생합니다
		// 프로그램이 정상적으로 종료되도록 예외 처리를 해주세요
		
//		int num = 5 / 0; // 5를 0으로 나눌 수 없어 이 코드를 try 코드 안으로 넣는다
		
		try {
			// 에러가 발생할 가능성이 있는 코드
			int num = 5 / 0;
		}catch (NullPointerException e) {  
			// 에러가 발생했을때 처리할 코드
			// e : 에러
			// 에러메세지를 출력
			System.out.println(e);
		}catch (ArithmeticException e) { 
			System.out.println(e);
		}catch (Exception e) {// Exception 최상위 에러 클래스
			// 실제로 발생한 에러 : ArithmeticException
			// Exception e = ArithmeticException
			// 부모타입 변수 = 자식 인스턴스
			// Exception 변수는 모든 에러를 받을 수 있다
			System.out.println(e); // 에러메세지
			e.printStackTrace(); // 에러메세지 + 코드 위치
		}
		// 에러가 발생했을때 에러와 일치하는 catch블록을 찾는다
		System.out.println("프로그램이 정상적으로 종료되었습니다");
}
}