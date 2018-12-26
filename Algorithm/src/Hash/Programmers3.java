package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Programmers3 {
	int answer = 1;
    public int solution(String[][] clothes) {
    	answer = 1;
    	HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
    	for(int i=0; i<clothes.length;i++) {
    		//key값에 이미 다른 옷이 있을 경우
    		if(hashMap.get(clothes[i][1])!=null) {
        		hashMap.put(clothes[i][1], hashMap.get(clothes[i][1])+1);
    		}//key값에 옷이 없을 경우
    		else {
        		hashMap.put(clothes[i][1], 1);
    		}
    	}
    	
    	ArrayList<Integer> clothesArray = new ArrayList(hashMap.values());
    	for(int i=0; i<clothesArray.size();i ++) {
    		answer *= (clothesArray.get(i)+1);
    	}
        return answer-1;
    } 
}