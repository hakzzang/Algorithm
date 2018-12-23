public class KiwiJuiceEasy {
	/**
	 * @author gamjatwigim
	 * @date 2018.12.23
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://www.topcoder.com/stat?c=problem_statement&pm=11019 */
	static public void main(String[] args) {
		
	}
	
	public int[] thePouring(int capacities[], int bottles[], int fromId[], int fromTo[]) {
		for(int i=0; i<fromId.length; i++) {
			int tempTotalBottle = bottles[fromTo[i]] + bottles[fromId[i]];//이전 병에서 받았을 때,
			//일단 음료를 줌
			bottles[fromTo[i]] += bottles[fromId[i]]; //fromId로부터 받음
			bottles[fromId[i]] -= bottles[fromId[i]]; //fromId의 값을 온전히 다 뺌
			if(tempTotalBottle > capacities[fromTo[i]])//담을 수 있는 양보다 많을 경우
			{
				int restDrink = tempTotalBottle - capacities[fromTo[i]]; //나머지 음료
				bottles[fromTo[i]] = capacities[fromTo[i]];//넣을 음료를 가득 채워버림
				bottles[fromId[i]] = restDrink; //나머지 음료를 병에 넣음
			}
		}
		return bottles;
	}
}
