import java.util.HashMap;

public class InterestingParty {
	int max = 0;
	public int bestInvitation(String[] first, String[] second) {
		HashMap<String, Integer> hashMap = new HashMap();
		for(int i=0; i<first.length;i++) {
			hashMap.put(first[i], 0);//초기화
			hashMap.put(second[i], 0);//초기화
		}
		for(int i=0; i<first.length; i++) {
			hashMap.put(first[i], hashMap.get(first[i])+1);
			hashMap.put(second[i], hashMap.get(second[i])+1);
		}
		hashMap.values().forEach(value->{
			if(max<value) {
				max = value;
			}
		});
		return max;
	}
}
