import java.util.HashMap;
import java.util.Map;

/**
	 * @author gamjatwigim
	 * @date 2018.12.24
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://programmers.co.kr/learn/courses/30/lessons/42576?language=java 
	 * @content:
	 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
		 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.*/
public class Programmers1 {
	private String answer = "";
    public String solution(String[] participant, String[] completion) {
    	Map<String, Integer> hashMap = new HashMap();
        for(int i=0; i<participant.length; i++) {
        	if(hashMap.get(participant[i])==null)
        		hashMap.put(participant[i], 1);
        	else
        		hashMap.put(participant[i], hashMap.get(participant[i])+1);
        }
        for(int i=0; i<completion.length; i++) {
        	hashMap.put(completion[i], hashMap.get(completion[i])+1);
        }
        hashMap.forEach((name,count) -> {
        	if(count%2==1) {
        		answer = name;
        	}
        });
        return answer;
    }
}