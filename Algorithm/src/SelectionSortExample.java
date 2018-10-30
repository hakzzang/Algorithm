public class SelectionSortExample {
	public static void main(String[] args) {
		int[] box = {3,7,2,1,4,8,9,0};
		SelectionSortExample selection = new SelectionSortExample();
		selection.sortWithSelectionSort(box);
	}
	
	public void sortWithSelectionSort(int[] notSortedBox) {
		for(int j=0; j<notSortedBox.length-1; j++) {
			int minIndex = -1;//가장 작은 인덱스
			int minNum = 99999999;//가장작은 숫자
			for(int i=j; i<notSortedBox.length; i++) {
				//i값을 하나씩 크게 해줘야하기 때문에 i=j를 통해서 for문의 인덱스와 같게 함.
				if(notSortedBox[i]<=minNum) {
					//minNum보다 선택한 인덱스의 아이템 값이 작을 경우에 정보를 저장시켜둠.
					minIndex = i;
					minNum = notSortedBox[i];
				}
			}
			
			//for문이 끝난 후에 값을 바꿔줌
			int temp = notSortedBox[j];
			notSortedBox[j] = notSortedBox[minIndex];
			notSortedBox[minIndex] = temp;
			
			//배열의 값을 확인
			for(int i=0;i<notSortedBox.length;i++) {
				System.out.print(notSortedBox[i]+" ");
			}
			System.out.println(String.format(":::%dth sorted", j+1));
		}

	}
}
