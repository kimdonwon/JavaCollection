package collection;

import java.util.ArrayList;

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
		
	}

}
