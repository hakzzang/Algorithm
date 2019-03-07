package QueueAndStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Programmers2{
	public static void main(String[] args) {
		int[] s = {2, 1, 3, 2};
		/*
		 * int answer =solution(s, s[2]); System.out.println(answer);
		 */
	}
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<PrintInfo> queue = new LinkedList<PrintInfo>();
        for(int i=0;i<priorities.length;i++) {
        	if(location==i)
        		queue.offer(new PrintInfo(priorities[i],true));
        	else
        		queue.offer(new PrintInfo(priorities[i],false));
        }
        
        answer = findData(queue, priorities[location], location);
        return answer;
    }
    
    public int findData(Queue<PrintInfo> queue, int priority,int location) {
    	int count = 0;
    	int plusLocation = 0;
    	while(true) {
        	PrintInfo printInfo = queue.poll();
        	ArrayList<PrintInfo> array = new ArrayList(queue);
        	boolean flag = true;
        	for(int i=0; i<array.size(); i++) {
        		if(printInfo.getPriority()<array.get(i).getPriority()) {
        			queue.offer(printInfo);
        			flag = false;
        			break;
        		}
        	}
        	if(flag && printInfo.getPriority() == priority && printInfo.getFix() == true) {
        		break;
        	}else if(flag && printInfo.getPriority() != priority && printInfo.getFix() == false) {
        		count++;
        		if(count<location) {
        			plusLocation++;
        		}
        	}
    	}
    	return count+plusLocation;
    }
    
    public class PrintInfo{
    	Integer priority;
    	boolean fix;
    	PrintInfo(int priority, boolean fix){
    		this.priority = priority;
    		this.fix = fix;
    	}
    	boolean getFix(){
    		return fix;
    	}
    	int getPriority() {
    		return priority;
    	}
    }
}