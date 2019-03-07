package baekjoon;

import java.util.Scanner;
/*
 * 문제
	주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	
	입력
	첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
	
	출력
	주어진 수들 중 소수의 개수를 출력한다.
*/
public class Quiz1978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loopIndex = scanner.nextInt();
		int result = 0;
		//좋은 풀이법은 아닌 것 같은데
		for(int i=0; i<loopIndex; i++) {
			//들어오는 값의  나누기 2를 통해서 for문을 돌려서 소수를 얻는다.
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