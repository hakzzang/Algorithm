import java.util.HashMap;

/**
	 * @author gamjatwigim
	 * @date 2018.12.25
	 * @url: https://gamjatwigim.tistory.com/
	 * @algorithm : https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
	 * @content:
	 * 문제 설명
		전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
		전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
		
		구조대 : 119
		박준영 : 97 674 223
		지영석 : 11 9552 4421
		전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
		어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.*/
public class Programmers2 {
	boolean flag = true;
	int count = 0;
	public boolean solution(String[] phone_book) {
		flag = false;
		for(int i=0; i<phone_book.length;i++) {
			for(int j=0; j<phone_book.length; j++) {
				if(phone_book[i].startsWith(phone_book[j])) {
					flag = true;
				}
			}
		}
		
        return flag;
    }
}