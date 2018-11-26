package collection;

import java.util.*;

public class ListSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		
		//Iterator은 꺼낼것이 있는지 없는지 살펴보는 hasNext()메소드, 자료를 꺼내는 next()메소드가 있음
		Iterator ai = al.iterator();
		while(ai.hasNext()) {
			//list는 순서대로 출력함
			System.out.println(ai.next());
		}
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		

		//값이 저장 되면 true, 안되면 false 
		boolean f1 = hs.add("kim");//true
		boolean f2 = hs.add("lee");//true
		boolean f3 = hs.add("kim");//false
		
		System.out.println(hs.size());
		Iterator hi = hs.iterator();
		while(hi.hasNext()) {
			//set은 순서없이 출력함, 중복 혀용 안함 
			System.out.println(hi.next());
		}
		
		
		
		
		
	}

}
