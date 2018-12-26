package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Programmers4 {
	public static void main(String[] args) {
		Programmers4 pro = new Programmers4();
		String[] genres = {"classic", "pop", "classic", "classic", "pop"}; 
		int[] plays = {500, 600, 150, 800, 2500};
		int[] answer = pro.solution(genres, plays);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	public int[] solution(String[] genres, int[] plays) {
        ArrayList<PlayList> playList = new ArrayList();
        ArrayList<Integer> indexList = new ArrayList();
        HashMap<String, Integer> hashMap = new HashMap();
        for(int i=0; i<genres.length; i++) {
        	playList.add(new PlayList(genres[i],plays[i], i));
        	if(hashMap.get(genres[i])==null) {
            	hashMap.put(genres[i], plays[i]);        		
        	}else {
            	hashMap.put(genres[i], hashMap.get(genres[i])+plays[i]);
        	}
        }
        ArrayList<Integer> sortedArrayList = new ArrayList(hashMap.values());
        ArrayList<String> sortedGenresArrayList = new ArrayList();
        Collections.sort(sortedArrayList);
        Collections.reverse(sortedArrayList);
        sortedArrayList.forEach(value->{
        	hashMap.entrySet().forEach(entry->{
        		if(value==entry.getValue()) {
        			if(!sortedGenresArrayList.contains(entry.getKey()))
        				sortedGenresArrayList.add(entry.getKey());
        		}
        	});
        });
        
        //playList별로 정리
        Collections.sort(playList, new Comparator<PlayList>() {
        	@Override
        	public int compare(PlayList o1, PlayList o2) {
        		// TODO Auto-generated method stub
        		if(o1.plays>o2.plays) {
        			return -1;
        		}else if(o1.plays==o2.plays) {
        			return 0;
        		}else {
        			return 1;
        		}
          	}
		});
        
        sortedGenresArrayList.forEach(key->{
        	int count = 0;
        	for(int i=0;i<playList.size();i++) {
        		if(key.equals(playList.get(i).getGenres())) {
        			indexList.add(playList.get(i).getIndex());
        			count++;
        		}
        		if(count==2) {
        			break;
        		}
        	}
        	
        });
        int[] answer = new int[indexList.size()];
        for(int i=0; i<indexList.size();i++) {
        	answer[i] = indexList.get(i);
        }
        return answer;
    }
	
	class PlayList{
		String genres;
		int plays;
		Integer index;
		PlayList(String genres, int plays, Integer index){
			this.genres = genres;
			this.plays = plays;
			this.index = index;
		}
		
		public String getGenres() {
			return genres;
		}
		public Integer getIndex() {
			return index;
		}
		public int getPlays() {
			return plays;
		}
	}
}
