package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		// 다음 코드를 실행하면 에러가 발생합니다.
		// 프로그램이 정상적으로 종료되도록 예외처리를 해주세요
		
//		String str = null;
//		System.out.println(str.length());
//		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
		// String 대문자여서 클래스
		// 인스턴스 없이 참조변수를 사용하면 에러남
		
		try {
			String str = null;
			System.out.println(str.length()); // "str" is null
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}

}
