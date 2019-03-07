package baekjoon;

import java.util.Scanner;

/*
 * ����
	�� ���� �ڿ����� �Է¹޾� �ִ� ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù° �ٿ��� �� ���� �ڿ����� �־�����. �� ���� 10,000������ �ڿ����̸� ���̿� �� ĭ�� ������ �־�����.
	
	���
	ù° �ٿ��� �Է����� �־��� �� ���� �ִ�������,��° �ٿ��� �Է����� �־��� �� ���� �ּ� ������� ����Ѵ�.
*/
public class Quiz2609 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		//��Ŭ���� ȣ�����̶�� ������ ������, �ܿ�°� ����
		// 10 12
		// 10 12
		// 5 6 2 = 60
		Quiz2609 quiz = new Quiz2609();
		int numMin = quiz.getMinNumber(num1, num2);
		int numMax = num1 * num2 / numMin;
		System.out.println(numMin);
		System.out.println(numMax);
	}
	
	public int getMinNumber(int num1, int num2) {
		int numMin = Math.min(num1, num2);
		int numMax = Math.max(num1, num2);
		int returnNum = numMax % numMin == 0 ? numMin : getMinNumber(numMin, numMax %numMin);
		return returnNum;
	}
}
