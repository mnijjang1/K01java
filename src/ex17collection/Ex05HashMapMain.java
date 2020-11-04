package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 HashMap<K,V> : Map<T> 인터페이스를 구현한 컬렉션 클래스
  - Key, Value의 쌍으로 객체를 저장한다
  - 키값은 중복될 수 없다. 중복될 경우 덮어쓰기 처리된다.
  - 키값으로 검색하므로 다른 컬렉션보다 속도가 빠르다.
 */
public class Ex05HashMapMain {

	public static void main(String[] args) {

		// Map 컬렉션 생성, Key와 Value는 String형으로 선언함.
		HashMap<String, String> map = new HashMap<String, String>();
		
		System.out.println("name이라는 키값으로 저장된 이전의 값 : "+ map.put("name", "홍길동"));
		// -> null값 반환됨. map.put은 기존에 동일한 키값이 있으면 해당 value값, 없으면 null값 반환
		
		int number = 20;
//		map.put("age", number); // 에러 발생 - value가 String형으로 선언되었으므로 int형 입력 불가
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");

		System.out.println("저장된 객체수 : " + map.size()); // 4개
		
		System.out.println("name이라는 키값으로 저장된 이전의 값 : "+ map.put("name", "최길동"));
		// -> 홍길동 반환, 키값 name이 이미 존재하므로 기존 value인 홍길동을 반환하고 최길동으로 덮어쓰기됨
		System.out.println("키값으로 중복 저장후 객체수 : "+ map.size()); // 4개
		
		// 키값을 알고 있을 때는 get(키값)을 통해 value값 출력
		System.out.println("키값을 알때 : " + map.get("name")); 

		/*
		 키값을 모를 때 출력하기
		  1. Set<T> keySet() 메소드 호출을 통해 키값들을 Set계열의 컬렉션으로 얻어온다.
		  2. 키값을 얻어온 후 확장 for문을 통해 저장된 값을 출력한다.
		  ※ Map 계열의 컬렉션은 처음부터 확장 for문을 사용하는 것이 불가능하다
		   위처럼 key값을 먼저 얻어온 후 사용해야 한다.
		 */
		
		Set<String> keys = map.keySet();
		System.out.println("[확장for문 적용]");
		for (String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		/*
		 반복자를 통한 출력
		  - iterator를 통해 반복할 때도 keySet()으로 먼저 key를 얻어온 후 사용할 수 있다. 
		 */
		System.out.println("[반복자 사용하기]");
		Set<String> keys2= map.keySet();
		Iterator<String> it = keys2.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		System.out.println("[value값들만 출력하기]");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
		
		// key 혹은 value가 존재할 경우 true가 반환된다
		System.out.println(map.containsKey("name") ? "name키값있다":"name키값없다");
		System.out.println(map.containsKey("account") ? "account키값있다":"account키값없다");
		System.out.println(map.containsValue("남자") ? "남자 있다":"남자 없다");
		System.out.println(map.containsValue("여자") ? "여자 있다":"여자 없다");
		
		// 삭제 - key를 통해 삭제하고, 삭제가 완료되면 해당 value가 반환된다.
		System.out.println("삭제된 객체 : " + map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		for (String key : keys) {
			System.out.println(String.format("%s:%s", key, map.get(key)));
		}
		
		map.clear();
		System.out.println("전체삭제후 객체수 : " + map.size());
	}

}
