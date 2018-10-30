public class BurbleSortExample {
	public static void main(String[] args) {
		int[] boxs = {3,7,2,1,4,8,9,0};//burble sort는 가장 큰 값부터 정렬 된다. 결국 인덱스 하나씩 깍을 수 있겠다.
		BurbleSortExample burbleSort = new BurbleSortExample();//객체 생성
		burbleSort.sortWithBurble(boxs);
	}
	
	public void sortWithBurble(int[] notSortedBox) {
		System.out.println("START");
		int burbleSize = notSortedBox.length;//box의 size를 for문 1회마다 1개씩 깍기 위해서 사용.
		for(int j=0; j<notSortedBox.length-1;j++) {//버블소트의 사이클
			boolean sortedBool = true;
			for(int i=0; i<burbleSize-1; i++) {//한 사이클의 횟수
				if(notSortedBox[i] > notSortedBox[i+1]) {
					//sort가 되지 않은 상태
					sortedBool = false;
					//앞에 수가 뒤에서보다 작은 경우
					int temp = notSortedBox[i];
					notSortedBox[i] = notSortedBox[i+1];
					notSortedBox[i+1] = temp;
					//값을 교환
				}
			}
			if(sortedBool) {
				//sort가 된 상태라면 for문 종료
				break;
			}
			//출력
			for(int i=0; i<notSortedBox.length-1;i++) {
				System.out.print(notSortedBox[i]+" ");
			}
			//횟수를 1회씩 줄이기 위해서 burbleSize 줄여나감
			burbleSize = burbleSize - 1;
			System.out.println(String.format(":::%d번째 burble", j+1));
		}
	}
}
