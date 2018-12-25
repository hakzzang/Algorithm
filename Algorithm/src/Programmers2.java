import java.util.HashMap;

/**
	 * @author gamjatwigim
	 * @date 2018.12.25
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
	 * @content:
	 * ���� ����
		��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
		��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
		
		������ : 119
		���ؿ� : 97 674 223
		������ : 11 9552 4421
		��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
		� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/
public class Programmers2 {
	boolean flag = true;
	public boolean solution(String[] phone_book) {
		int min=99999;//�ּҰ��� phone_book�� ���λ縦 ���� ���ؼ� null���� ������ �ʵ��� �Ѵ�.
		HashMap<String,Integer> resultHash = new HashMap();//hashMap�� ���� key ���� ������ �� �̴�.
		for(int i=0; i<phone_book.length; i++) {
			min = Math.min(min, phone_book[i].length());
			resultHash.put(phone_book[i], 0);//���� �ʱ�ȭ
        }
		for(int j=0; j<phone_book.length;j++) {
			if(resultHash.get(phone_book[j].substring(0, min).toString())!=null) {
				//���λ簡 ������ ��쿡 �ش� value���� +1 ���� ��.
				//���� �������� ���̸� value�� ��� 1
				resultHash.put(phone_book[j].substring(0, min), resultHash.get(phone_book[j].substring(0, min).toString())+1);
			}
		}
		
		resultHash.forEach((k,v)->{
			//hash�� �˻���.
			//value�� 1���� ũ�� ���λ�� ���.
			if(v>1) {
				flag = false;
			}
		});
        return flag;
    }
}