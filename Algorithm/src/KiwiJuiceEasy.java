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
			int tempTotalBottle = bottles[fromTo[i]] + bottles[fromId[i]];//���� ������ �޾��� ��,
			//�ϴ� ���Ḧ ��
			bottles[fromTo[i]] += bottles[fromId[i]]; //fromId�κ��� ����
			bottles[fromId[i]] -= bottles[fromId[i]]; //fromId�� ���� ������ �� ��
			if(tempTotalBottle > capacities[fromTo[i]])//���� �� �ִ� �纸�� ���� ���
			{
				int restDrink = tempTotalBottle - capacities[fromTo[i]]; //������ ����
				bottles[fromTo[i]] = capacities[fromTo[i]];//���� ���Ḧ ���� ä������
				bottles[fromId[i]] = restDrink; //������ ���Ḧ ���� ����
			}
		}
		return bottles;
	}
}
