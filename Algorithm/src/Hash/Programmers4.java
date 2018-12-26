package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Programmers4 {
	/*
	 * @author gamjatwigim
	 * @date 2018.12.25
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
	 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
		
		속한 노래가 많이 재생된 장르를 먼저 수록합니다.
		장르 내에서 많이 재생된 노래를 먼저 수록합니다.
		장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
		노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
	 */
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
        ArrayList<PlayList> playList = new ArrayList();//playList를 ArrayList의 클래스를 만들어 담아서 index에 대한 고민을 없앤다.
        ArrayList<Integer> indexList = new ArrayList();//answer에 담을 indexList를 사용합니다.
        HashMap<String, Integer> hashMap = new HashMap();//재생횟수를 축적합니다.
        for(int i=0; i<genres.length; i++) {
        	playList.add(new PlayList(genres[i],plays[i], i));
        	//여러개의 배열을 하나로 합칩니다.
        	//여기서 필요한 배열은 장르, 플레이횟수, 인덱스입니다.
        	if(hashMap.get(genres[i])==null) {
            	hashMap.put(genres[i], plays[i]);        		
        	}else {
            	hashMap.put(genres[i], hashMap.get(genres[i])+plays[i]);
        	}
        }
        ArrayList<Integer> sortedArrayList = new ArrayList(hashMap.values());
        //hashMap의 value는 플레이횟수의 누적입니다.
        //hashMap.values를 arrayList에 담아서 arrayList화 시킵니다.
        //이 arrayList는 play횟수를 sort하기 위해서 사용합니다.
        ArrayList<String> sortedGenresArrayList = new ArrayList();
        //장르별로 나열된 어레이리스트입니다.
        //이 arrayList는 genre를 sort하기 위해서 사용합니다.
        Collections.sort(sortedArrayList);
        Collections.reverse(sortedArrayList);
        //정렬시키고 reverse시켜서 내림차순화 시킵니다.
        sortedArrayList.forEach(value->{
        	hashMap.entrySet().forEach(entry->{
        		if(value==entry.getValue()) {
        			//sortedArray는 축적된 array의 내림차순과 관련된 array입니다.
        			//sortedArrayList는 play횟수를 내림차순
        			//sortedGenresArrayList는 genre를 내림차순하여 담고 있는 arrayList입니다.
        			if(!sortedGenresArrayList.contains(entry.getKey()))
        				sortedGenresArrayList.add(entry.getKey());
        		}
        	});
        });
        
        //playList는 index, genre, plays를 담고 있습니다.
        //그 중에서도 plays를 기준으로 내림차순을 갖고 있습니다.
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
        
        //많이 사용된 장르가 내림차순화 되었기 때문에
        //key는 가장 많이 재생된 장르가 먼저 나옵니다.
        //해당 for문에서는 나열된 재생횟수가 나열된 playList와 비교할 것이고
        //가장 많은 순서대로 나열된 playList를 가장 많이 재생된 장르로 비교할 것이기 때문에
        //가장 많은 순서로, 가장 많이 재생된 장르부터 나오게 되며
        //2개씩만 뽑아서 베스트앨범으로 만들것이기 때문에
        //count의 값이 2라면 break시키고
        //그 외에는 indexList에 playList의 index를 담아서 출력합니다.
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
        //bestAlbum에 담길 음악의 갯수
        int[] answer = new int[indexList.size()];
        //index를 삽입
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
