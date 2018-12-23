public class Cryptography {
	/**
	 * @author gamjatwigim
	 * @date 2018.12.23
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://community.topcoder.com/stat?c=problem_statement&pm=10814 */
	
	//�ذ� ���: ���� ���� ������ +1�� �ϸ� ���� ū ������ �����Ѵ�.
	public long encrypt(int[] passwords) {
		int min = 99999999; //���� ���� ��
		int min_index = -1; //���� ���� �ε���
		long result = 1; //�����
		//for���� ���ؼ� ���� ���� ���� index�� ���Ѵ�. 
		for(int i=0;i<passwords.length;i++) {
			if(passwords[i] == Math.min(min, passwords[i])) {
				min = passwords[i];
				min_index = i;
			}
		}
		
		//���� ���� ���� ��쿡�� 1�� ���ؼ� ���Ѵ�.
		for(int i=0; i<passwords.length;i++) {
			if(i==min_index)
				result *= (passwords[i]+1);
			else
				result *= passwords[i];
		}
		
		//�����
		return result;
	}
}
