import java.util.HashMap;
import java.util.Map;

/**
	 * @author gamjatwigim
	 * @date 2018.12.24
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://programmers.co.kr/learn/courses/30/lessons/42576?language=java 
	 * @content:
	 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
		�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��,
		 �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/
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