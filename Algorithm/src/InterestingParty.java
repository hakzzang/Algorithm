import java.util.HashMap;

public class InterestingParty {
	/**
	 * @author gamjatwigim
	 * @date 2018.12.23
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://community.topcoder.com/stat?c=problem_statement&pm=11312&rd=14423 */
	private int max = 0; //결과 값
	public int bestInvitation(String[] first, String[] second) {
		HashMap<String, Integer> hashMap = new HashMap();//hashMap을 통해서 key,value로 접근
		for(int i=0; i<first.length;i++) {
			hashMap.put(first[i], 0);//초기화
			hashMap.put(second[i], 0);//초기화
		}
		for(int i=0; i<first.length; i++) {
			hashMap.put(first[i], hashMap.get(first[i])+1); //접근하게 되면 값을 증가
			hashMap.put(second[i], hashMap.get(second[i])+1);//접근하게 되면 값을 증가
		}
		hashMap.values().forEach(value->{
			max = Math.max(max, value); //max와 value중 큰 값을 value에 넣음
		});
		return max;
	}
}
