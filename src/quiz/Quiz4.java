package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 1.23 실수
		// Integer : 정수형 클래스
		// parse~ : 타입 변환 함수
		// parseInt : 문자열 -> 정수
//		String str = "1.23";
//		int num = Integer.parseInt(str);
//		System.out.println("프로그램이 정상적으로 종료되었습니다");

		try {
			String str = "1.23"; // 실수
			int num = Integer.parseInt(str); // int는 정수임
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
	}

}
