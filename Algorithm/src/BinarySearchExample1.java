
public class BinarySearchExample1 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};//���ĵ� �迭
		int targetNum = 7; //ã�� ����
		BinarySearchExample1 binarySearch = new BinarySearchExample1();
		int targetIndex = binarySearch.whereIsIndex(numbers, targetNum);
		System.out.println(String.format("ã�� ������ %d�� %d��° ��ġ�� �ֽ��ϴ�.",targetNum, targetIndex));
	}
	
	public int whereIsIndex(int[] numbers , int searchNum) {
		int startPoint = 0;//���Ѽ��� 0
		int lastPoint = numbers.length-1;//���Ѽ��� �迭�� ������ �ε���
		int searchPoint = 0;//���� ã�� �ε���
		do {
			int middlePoint = (startPoint + lastPoint)/2;//���� ���� ������ ���� �߰� ��
			if(numbers[middlePoint]>searchNum) {
				//ã�� ���ڰ� �߰����ں��� �۴ٸ�
				//lastPoint�� ���缭 ������ �����Ų��.
				lastPoint = middlePoint-1;
			}else if(numbers[middlePoint]<searchNum) {
				//ã�� ���ڰ� �߰����ں��� ũ�ٸ�
				//startPoint�� �߰�point���� ũ�� �ؼ� ������ �����Ų��.
				startPoint = middlePoint-1;
			}else if(numbers[middlePoint]==searchNum) {
				//ã�� ���� ������ while�� �����Ű��
				//searchPoint�� �����Ѵ�.
				searchPoint=middlePoint;
				break;
			}
		}while(startPoint<=lastPoint);
		return searchPoint;
	}
}
