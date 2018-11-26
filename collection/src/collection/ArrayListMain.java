package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//현재 Object 데이터 타입으로 입력 받음
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		
		for(int i=0 ; i < al.size(); i ++) {
			//String temp = al.get(i); -> al은 Object타입이기 때문에 String 으로 형변환 해줘야함
			System.out.println(al.get(i));
		}
		//정렬
		Collections.sort(al);
		
//		DescendingObj descending = new DescendingObj();
//        Collections.sort(arrayList, descending);



		
		
	}
	
	
	String getName() {
		return "";
	}
	
	//객체 정렬
	// String 내림차순
	class DescendingObj implements Comparator<ArrayListMain> {
	 
	    @Override
	    public int compare(ArrayListMain o1, ArrayListMain o2) {
	        return o2.getName().compareTo(o1.getName());
	    }
	 
	}
	 
	// Integer 오름차순
	class AscendingObj implements Comparator<ArrayListMain> {
	 
	    @Override
	    public int compare(ArrayListMain o1, ArrayListMain o2) {
	        return o1.getName().compareTo(o2.getName());
	    }
	 
	}


	

}
