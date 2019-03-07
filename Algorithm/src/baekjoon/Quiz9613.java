package baekjoon;

import java.util.Scanner;

public class Quiz9613 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Quiz9613 quiz = new Quiz9613();
		int loopIndex = scanner.nextInt();
		int[] sums = new int[loopIndex];
		//최대 공약수는
		// (a/min) * (b/min) * min
		//최소 공배수를 구하기 위해서는
		//int returnNum = numMax % numMin == 0 ?
		//	numMin : getMinNumber(numMin, numMax %numMin);
		//loopIndex만큼 돌려줍니다.
		for(int i=0; i<loopIndex; i++)
		{
			int loop2Index = scanner.nextInt();
			int nums[] = new int[loop2Index];
			int sum = 0;
			for(int j=0; j<loop2Index; j++)
			{
				nums[j] = scanner.nextInt();
				if(nums.length>1) {
					for(int k=j-1;k>=0;k--) {
						int numMin = quiz.getMinNumber(nums[k], nums[j]);
						sum += numMin;
					}
				}else {
					sum = nums[j];
				}
			}
			sums[i] = sum;
		}
		for(int i=0; i< sums.length; i++) {
			System.out.println(sums[i]);
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