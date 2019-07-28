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
		//가변적인 변수인 B와 C의 값에 의해서만 이익이 나며,
		//C가 B보다 커야만 이익이 난다.
		if(variableC>variableB) {
			//몫이 다 하고, 다음 값부터 이익을 얻음
			answer =  variableA / (variableC-variableB) + 1;
		}else {
			answer = -1;
		}
		System.out.println(answer);
	}
}