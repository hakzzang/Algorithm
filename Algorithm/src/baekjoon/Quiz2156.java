package baekjoon;

import java.util.Scanner;

public class Quiz2156 {
	//������ ���� �����ϸ� �� �ܿ� ����ִ� �����ִ� ��� ���ž� �ϰ�, ���� �Ŀ��� ���� ��ġ�� �ٽ� ���ƾ� �Ѵ�.
	//�������� ���� �ִ� 3���� ��� ���� ���� ����.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loopIndex = scanner.nextInt();
		int[] drinks = new int[loopIndex];
		int[] dp = new int[loopIndex];
		for(int i=0; i<loopIndex; i++) {
			drinks[i] = scanner.nextInt();
		}
		dp[0] = drinks[0];//6
		if(loopIndex>1) {
			dp[1] = drinks[0] + drinks[1];//16
		}
		if(loopIndex>2) {
			dp[2] = Math.max(Math.max(dp[1], dp[0]+drinks[2]), drinks[1]+drinks[2]);//23
		}
		for(int i=3;i<loopIndex; i++) {
			dp[i] = Math.max(Math.max(dp[i-2]+drinks[i],dp[i-3]+drinks[i]+drinks[i-1]), dp[i-1]);
		}
        System.out.println(dp[loopIndex-1]);
	}
}