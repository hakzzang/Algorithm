package baekjoon;

import java.util.Scanner;

public class Quiz1712 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int variableA = scanner.nextInt();
		int variableB = scanner.nextInt();
		int variableC = scanner.nextInt();
		int answer = 0;
		//1000 70 170
		//�������� ������ B�� C�� ���� ���ؼ��� ������ ����,
		//C�� B���� Ŀ�߸� ������ ����.
		if(variableC>variableB) {
			//���� �� �ϰ�, ���� ������ ������ ����
			answer =  variableA / (variableC-variableB) + 1;
		}else {
			answer = -1;
		}
		System.out.println(answer);
	}
}