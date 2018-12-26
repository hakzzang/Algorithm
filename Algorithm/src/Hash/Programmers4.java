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
	 * ��Ʈ���� ����Ʈ���� �帣 ���� ���� ���� ����� �뷡�� �� ���� ��� ����Ʈ �ٹ��� ����Ϸ� �մϴ�. �뷡�� ���� ��ȣ�� �����ϸ�, �뷡�� �����ϴ� ������ ������ �����ϴ�.
		
		���� �뷡�� ���� ����� �帣�� ���� �����մϴ�.
		�帣 ������ ���� ����� �뷡�� ���� �����մϴ�.
		�帣 ������ ��� Ƚ���� ���� �뷡 �߿����� ���� ��ȣ�� ���� �뷡�� ���� �����մϴ�.
		�뷡�� �帣�� ��Ÿ���� ���ڿ� �迭 genres�� �뷡�� ��� Ƚ���� ��Ÿ���� ���� �迭 plays�� �־��� ��, ����Ʈ �ٹ��� �� �뷡�� ���� ��ȣ�� ������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
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
        ArrayList<PlayList> playList = new ArrayList();//playList�� ArrayList�� Ŭ������ ����� ��Ƽ� index�� ���� ����� ���ش�.
        ArrayList<Integer> indexList = new ArrayList();//answer�� ���� indexList�� ����մϴ�.
        HashMap<String, Integer> hashMap = new HashMap();//���Ƚ���� �����մϴ�.
        for(int i=0; i<genres.length; i++) {
        	playList.add(new PlayList(genres[i],plays[i], i));
        	//�������� �迭�� �ϳ��� ��Ĩ�ϴ�.
        	//���⼭ �ʿ��� �迭�� �帣, �÷���Ƚ��, �ε����Դϴ�.
        	if(hashMap.get(genres[i])==null) {
            	hashMap.put(genres[i], plays[i]);        		
        	}else {
            	hashMap.put(genres[i], hashMap.get(genres[i])+plays[i]);
        	}
        }
        ArrayList<Integer> sortedArrayList = new ArrayList(hashMap.values());
        //hashMap�� value�� �÷���Ƚ���� �����Դϴ�.
        //hashMap.values�� arrayList�� ��Ƽ� arrayListȭ ��ŵ�ϴ�.
        //�� arrayList�� playȽ���� sort�ϱ� ���ؼ� ����մϴ�.
        ArrayList<String> sortedGenresArrayList = new ArrayList();
        //�帣���� ������ ��̸���Ʈ�Դϴ�.
        //�� arrayList�� genre�� sort�ϱ� ���ؼ� ����մϴ�.
        Collections.sort(sortedArrayList);
        Collections.reverse(sortedArrayList);
        //���Ľ�Ű�� reverse���Ѽ� ��������ȭ ��ŵ�ϴ�.
        sortedArrayList.forEach(value->{
        	hashMap.entrySet().forEach(entry->{
        		if(value==entry.getValue()) {
        			//sortedArray�� ������ array�� ���������� ���õ� array�Դϴ�.
        			//sortedArrayList�� playȽ���� ��������
        			//sortedGenresArrayList�� genre�� ���������Ͽ� ��� �ִ� arrayList�Դϴ�.
        			if(!sortedGenresArrayList.contains(entry.getKey()))
        				sortedGenresArrayList.add(entry.getKey());
        		}
        	});
        });
        
        //playList�� index, genre, plays�� ��� �ֽ��ϴ�.
        //�� �߿����� plays�� �������� ���������� ���� �ֽ��ϴ�.
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
        
        //���� ���� �帣�� ��������ȭ �Ǿ��� ������
        //key�� ���� ���� ����� �帣�� ���� ���ɴϴ�.
        //�ش� for�������� ������ ���Ƚ���� ������ playList�� ���� ���̰�
        //���� ���� ������� ������ playList�� ���� ���� ����� �帣�� ���� ���̱� ������
        //���� ���� ������, ���� ���� ����� �帣���� ������ �Ǹ�
        //2������ �̾Ƽ� ����Ʈ�ٹ����� ������̱� ������
        //count�� ���� 2��� break��Ű��
        //�� �ܿ��� indexList�� playList�� index�� ��Ƽ� ����մϴ�.
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
        //bestAlbum�� ��� ������ ����
        int[] answer = new int[indexList.size()];
        //index�� ����
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
