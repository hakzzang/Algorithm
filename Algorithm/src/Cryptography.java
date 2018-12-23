public class Cryptography {
	/**
	 * @author gamjatwigim
	 * @date 2018.12.23
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://community.topcoder.com/stat?c=problem_statement&pm=10814 */
	
	//해결 방법: 가장 작은 수에서 +1을 하면 가장 큰 비율로 증가한다.
	public long encrypt(int[] passwords) {
		int min = 99999999; //가장 작은 값
		int min_index = -1; //가장 작은 인덱스
		long result = 1; //결과값
		//for문을 통해서 가장 작은 값과 index를 구한다. 
		for(int i=0;i<passwords.length;i++) {
			if(passwords[i] == Math.min(min, passwords[i])) {
				min = passwords[i];
				min_index = i;
			}
		}
		
		//가장 작은 값일 경우에만 1을 더해서 곱한다.
		for(int i=0; i<passwords.length;i++) {
			if(i==min_index)
				result *= (passwords[i]+1);
			else
				result *= passwords[i];
		}
		
		//결과값
		return result;
	}
}
