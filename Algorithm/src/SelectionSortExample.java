public class SelectionSortExample {
	public static void main(String[] args) {
		int[] box = {3,7,2,1,4,8,9,0};
		SelectionSortExample selection = new SelectionSortExample();
		selection.sortWithSelectionSort(box);
	}
	
	public void sortWithSelectionSort(int[] notSortedBox) {
		for(int j=0; j<notSortedBox.length-1; j++) {
			int minIndex = -1;//���� ���� �ε���
			int minNum = 99999999;//�������� ����
			for(int i=j; i<notSortedBox.length; i++) {
				//i���� �ϳ��� ũ�� ������ϱ� ������ i=j�� ���ؼ� for���� �ε����� ���� ��.
				if(notSortedBox[i]<=minNum) {
					//minNum���� ������ �ε����� ������ ���� ���� ��쿡 ������ ������ѵ�.
					minIndex = i;
					minNum = notSortedBox[i];
				}
			}
			
			//for���� ���� �Ŀ� ���� �ٲ���
			int temp = notSortedBox[j];
			notSortedBox[j] = notSortedBox[minIndex];
			notSortedBox[minIndex] = temp;
			
			//�迭�� ���� Ȯ��
			for(int i=0;i<notSortedBox.length;i++) {
				System.out.print(notSortedBox[i]+" ");
			}
			System.out.println(String.format(":::%dth sorted", j+1));
		}

	}
}
