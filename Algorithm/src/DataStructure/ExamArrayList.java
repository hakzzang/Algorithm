package DataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class ExamArrayList {
	public static void main(String[] args) {
		ExamArrayList examArrayList = new ExamArrayList();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		examArrayList.print(arrayList);//arrayList�� ������ Ȯ����
		Collections.reverse(arrayList);//��������
		examArrayList.print(arrayList);//arrayList�� ������ Ȯ����
		Collections.sort(arrayList);//�ø�����
		examArrayList.print(arrayList);//arrayList�� ������ Ȯ����
		arrayList.remove(3);//3��° �ε����� ����
		examArrayList.print(arrayList);//arrayList�� ������ Ȯ����
		
	}
	
	public void print(ArrayList<Integer> arrayList) {
		System.out.print("value: ");
		arrayList.forEach((value)->{
			System.out.print(value);
		});
		System.out.print(String.format("  size: %d", arrayList.size()));
		System.out.println("");
	}
}
