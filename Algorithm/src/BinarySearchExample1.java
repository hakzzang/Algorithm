
public class BinarySearchExample1 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};//정렬된 배열
		int targetNum = 7; //찾는 숫자
		BinarySearchExample1 binarySearch = new BinarySearchExample1();
		int targetIndex = binarySearch.whereIsIndex(numbers, targetNum);
		System.out.println(String.format("찾는 숫자인 %d는 %d번째 위치에 있습니다.",targetNum, targetIndex));
	}
	
	public int whereIsIndex(int[] numbers , int searchNum) {
		int startPoint = 0;//하한선은 0
		int lastPoint = numbers.length-1;//상한선은 배열의 마지막 인덱스
		int searchPoint = 0;//최종 찾는 인덱스
		do {
			int middlePoint = (startPoint + lastPoint)/2;//시작 수와 마지막 수의 중간 값
			if(numbers[middlePoint]>searchNum) {
				//찾는 숫자가 중간숫자보다 작다면
				//lastPoint를 낮춰서 범위를 하향시킨다.
				lastPoint = middlePoint-1;
			}else if(numbers[middlePoint]<searchNum) {
				//찾는 숫자가 중간숫자보다 크다면
				//startPoint를 중간point보다 크게 해서 범위를 상향시킨다.
				startPoint = middlePoint-1;
			}else if(numbers[middlePoint]==searchNum) {
				//찾는 값이 맞으면 while을 종료시키고
				//searchPoint를 셋팅한다.
				searchPoint=middlePoint;
				break;
			}
		}while(startPoint<=lastPoint);
		return searchPoint;
	}
}
