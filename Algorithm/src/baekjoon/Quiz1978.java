package baekjoon;

import java.util.Scanner;
/*
 * ����
	�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
	
	���
	�־��� ���� �� �Ҽ��� ������ ����Ѵ�.
*/
public class Quiz1978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loopIndex = scanner.nextInt();
		int result = 0;
		//���� Ǯ�̹��� �ƴ� �� ������
		for(int i=0; i<loopIndex; i++) {
			//������ ����  ������ 2�� ���ؼ� for���� ������ �Ҽ��� ��´�.
			int number =scanner.nextInt();
			boolean resultFlag = true;
			for(int j=2; j<= number/2; j++) {
				if(number%j==0) {
					resultFlag = false;
					break;
				}
			}
			if(number == 1) {
				resultFlag = false;
			}
			if(resultFlag) {
				result += 1;
			}
		}
		System.out.println(result);
	}
}