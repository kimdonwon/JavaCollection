package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		//map 의 입력은 put
		map.put("0", "str1");
		map.put("1", "str2");
		map.put("2", "str3");
		
		map.put("0", "str3");
		//map 의 크기는 size
		System.out.println(map.size());
		//map 의 출력은 get
		System.out.println(map.get("0"));
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
				
		//map 의 키 값은 set으로 되어있음
		Set<String> keys = map.keySet();
		//Iterator은 꺼낼것이 있는지 없는지 살펴보는 hashNext()메소드, 자료를 꺼내는 next()메소드가 있음
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		
		if(map.containsKey("0"))
			System.out.println(map.get("0"));
		
		
		
	}

}
