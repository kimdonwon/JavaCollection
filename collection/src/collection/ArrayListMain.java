package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� Object ������ Ÿ������ �Է� ����
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		
		for(int i=0 ; i < al.size(); i ++) {
			//String temp = al.get(i); -> al�� ObjectŸ���̱� ������ String ���� ����ȯ �������
			System.out.println(al.get(i));
		}
		//����
		Collections.sort(al);
		
//		DescendingObj descending = new DescendingObj();
//        Collections.sort(arrayList, descending);



		
		
	}
	
	
	String getName() {
		return "";
	}
	
	//��ü ����
	// String ��������
	class DescendingObj implements Comparator<ArrayListMain> {
	 
	    @Override
	    public int compare(ArrayListMain o1, ArrayListMain o2) {
	        return o2.getName().compareTo(o1.getName());
	    }
	 
	}
	 
	// Integer ��������
	class AscendingObj implements Comparator<ArrayListMain> {
	 
	    @Override
	    public int compare(ArrayListMain o1, ArrayListMain o2) {
	        return o1.getName().compareTo(o2.getName());
	    }
	 
	}


	

}
