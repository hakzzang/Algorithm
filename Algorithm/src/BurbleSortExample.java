public class BurbleSortExample {
	public static void main(String[] args) {
		int[] boxs = {3,7,2,1,4,8,9,0};//burble sort�� ���� ū ������ ���� �ȴ�. �ᱹ �ε��� �ϳ��� ���� �� �ְڴ�.
		BurbleSortExample burbleSort = new BurbleSortExample();//��ü ����
		burbleSort.sortWithBurble(boxs);
	}
	
	public void sortWithBurble(int[] notSortedBox) {
		System.out.println("START");
		int burbleSize = notSortedBox.length;//box�� size�� for�� 1ȸ���� 1���� ��� ���ؼ� ���.
		for(int j=0; j<notSortedBox.length-1;j++) {//�����Ʈ�� ����Ŭ
			boolean sortedBool = true;
			for(int i=0; i<burbleSize-1; i++) {//�� ����Ŭ�� Ƚ��
				if(notSortedBox[i] > notSortedBox[i+1]) {
					//sort�� ���� ���� ����
					sortedBool = false;
					//�տ� ���� �ڿ������� ���� ���
					int temp = notSortedBox[i];
					notSortedBox[i] = notSortedBox[i+1];
					notSortedBox[i+1] = temp;
					//���� ��ȯ
				}
			}
			if(sortedBool) {
				//sort�� �� ���¶�� for�� ����
				break;
			}
			//���
			for(int i=0; i<notSortedBox.length-1;i++) {
				System.out.print(notSortedBox[i]+" ");
			}
			//Ƚ���� 1ȸ�� ���̱� ���ؼ� burbleSize �ٿ�����
			burbleSize = burbleSize - 1;
			System.out.println(String.format(":::%d��° burble", j+1));
		}
	}
}
