import java.util.HashMap;

public class Programmers2 {
	int min = 99999999;
	public boolean solution(String[] phone_book) {
        HashMap<String ,Integer> resultHash = new HashMap();
        for(int i=0; i<phone_book.length; i++) {
        	resultHash.put(phone_book[i], 0);
        }
        
        resultHash.forEach((k,v)->{
        	
        });
        return min == 1 ? true : false;
    }
}
