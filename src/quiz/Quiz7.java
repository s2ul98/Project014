package quiz;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;



public class Quiz7 {

	public static void main(String[] args) {
		
		// Set : 자료구조. 순서 x 중복 x
		// E 기호 : 제네릭 타입
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		// Integer : Set을 순화하는 도구
		// Set은 get 사용불가
		Iterator<Integer> iterator = set.iterator();
		
		// next :set에서 다음 요소를 꺼내는 함수
		int num1 = iterator.next();
		int num2 = iterator.next();
		int num3 = iterator.next();
		int num4 = iterator.next();
	}

}
