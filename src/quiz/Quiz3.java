package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
//		Object object = new Integer(0);
//		String str = (String)object; // 잘못된 다운캐스팅
//		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
		try {
			Object object = new Integer(0);
			if(object instanceof String) { // 타입체크
				String str = (String)object; // 다운캐스팅
			}
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}

}
