package collection;

import java.util.ArrayList;

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
		
	}

}
