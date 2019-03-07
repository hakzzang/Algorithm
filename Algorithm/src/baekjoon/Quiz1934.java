package baekjoon;

import java.util.Scanner;

public class Quiz1934 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loopIndex = scanner.nextInt();
		//최대 공약수는
		// (a/min) * (b/min) * min
		//최소 공배수를 구하기 위해서는
		//int returnNum = numMax % numMin == 0 ?
		//	numMin : getMinNumber(numMin, numMax %numMin);
		//loopIndex만큼 돌려줍니다.
		for(int i=0; i<loopIndex; i++)
		{
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();	
			Quiz1934 quiz = new Quiz1934();
			int numMin = quiz.getMinNumber(num1, num2);
			System.out.println(num1 * num2 / numMin);
		}
		
	}
	public int getMinNumber(int num1, int num2) {
		int numMin = Math.min(num1, num2);
		int numMax = Math.max(num1, num2);
		int returnNum = numMax % numMin == 0 ?
				numMin : getMinNumber(numMin, numMax %numMin);
		return returnNum;
	}
}