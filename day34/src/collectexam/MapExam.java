package collectexam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 95);
		map.put("김자바", 55);
		map.put("이강산", 80);
		map.put("한바다", 93);
		map.put("홍길동", 75);
		
		System.out.println(map.size());
		System.out.println(map.get("김자바")); //key로 value에 접근
		System.out.println();
		map.remove("홍길동");
		System.out.println(map.get("홍길동"));
		System.out.println(map.size());
		System.out.println("----------------");
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
