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
		examArrayList.print(arrayList);//arrayList의 내용을 확인함
		Collections.reverse(arrayList);//내림차순
		examArrayList.print(arrayList);//arrayList의 내용을 확인함
		Collections.sort(arrayList);//올림차순
		examArrayList.print(arrayList);//arrayList의 내용을 확인함
		arrayList.remove(3);//3번째 인덱스를 제거
		examArrayList.print(arrayList);//arrayList의 내용을 확인함
		
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
