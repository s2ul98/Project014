package quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 컴파일된 파일이 없으면 Book 클래스를 찾을 수 없어서 에러남
		
//		Book book = new Book();
//		System.out.println("프로그램이 정상적으로 종료되었습니다");

		try {
			Book book = new Book();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}

}
class Book {
	
}