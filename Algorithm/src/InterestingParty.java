import java.util.HashMap;

public class InterestingParty {
	/**
	 * @author gamjatwigim
	 * @date 2018.12.23
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://community.topcoder.com/stat?c=problem_statement&pm=11312&rd=14423 */
	private int max = 0; //��� ��
	public int bestInvitation(String[] first, String[] second) {
		HashMap<String, Integer> hashMap = new HashMap();//hashMap�� ���ؼ� key,value�� ����
		for(int i=0; i<first.length;i++) {
			hashMap.put(first[i], 0);//�ʱ�ȭ
			hashMap.put(second[i], 0);//�ʱ�ȭ
		}
		for(int i=0; i<first.length; i++) {
			hashMap.put(first[i], hashMap.get(first[i])+1); //�����ϰ� �Ǹ� ���� ����
			hashMap.put(second[i], hashMap.get(second[i])+1);//�����ϰ� �Ǹ� ���� ����
		}
		hashMap.values().forEach(value->{
			max = Math.max(max, value); //max�� value�� ū ���� value�� ����
		});
		return max;
	}
}
