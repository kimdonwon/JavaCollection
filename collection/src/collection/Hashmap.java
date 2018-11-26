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
		//map �� �Է��� put
		map.put("0", "str1");
		map.put("1", "str2");
		map.put("2", "str3");
		
		map.put("0", "str3");
		//map �� ũ��� size
		System.out.println(map.size());
		//map �� ����� get
		System.out.println(map.get("0"));
		System.out.println(map.get("1"));
		System.out.println(map.get("2"));
				
		//map �� Ű ���� set���� �Ǿ�����
		Set<String> keys = map.keySet();
		//Iterator�� �������� �ִ��� ������ ���캸�� hashNext()�޼ҵ�, �ڷḦ ������ next()�޼ҵ尡 ����
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
