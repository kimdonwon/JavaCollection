package collection;

import java.util.*;

public class ListSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		
		//Iterator�� �������� �ִ��� ������ ���캸�� hasNext()�޼ҵ�, �ڷḦ ������ next()�޼ҵ尡 ����
		Iterator ai = al.iterator();
		while(ai.hasNext()) {
			//list�� ������� �����
			System.out.println(ai.next());
		}
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("three");
		

		//���� ���� �Ǹ� true, �ȵǸ� false 
		boolean f1 = hs.add("kim");//true
		boolean f2 = hs.add("lee");//true
		boolean f3 = hs.add("kim");//false
		
		System.out.println(hs.size());
		Iterator hi = hs.iterator();
		while(hi.hasNext()) {
			//set�� �������� �����, �ߺ� ���� ���� 
			System.out.println(hi.next());
		}
		
		
		
		
		
	}

}
