package baekjoon;

import java.util.Scanner;

/*
 * 문제
	두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
	
	출력
	첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
*/
public class Quiz2609 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		//유클리드 호제법이라는 공식이 있지만
		//내가 생각하는 것은 두 값을 나머지 한 값이 0일 경우
		//최소 공배수라고 생각을 합니다. 그렇기 때문에 제귀를 사용한다면,
		//numMin값을 구할 수 있을 것이고 
		//최소공배수는 a * b / numMin 값이라고 생각합니다.
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
		int returnNum = numMax % numMin == 0 ?
				numMin : getMinNumber(numMin, numMax %numMin);
		return returnNum;
	}
}