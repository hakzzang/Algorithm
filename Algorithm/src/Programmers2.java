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
	int count = 0;
	public boolean solution(String[] phone_book) {
		flag = false;
		for(int i=0; i<phone_book.length;i++) {
			for(int j=0; j<phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])) {
					flag = true;
				}
			}
		}
		
        return flag;
    }
}