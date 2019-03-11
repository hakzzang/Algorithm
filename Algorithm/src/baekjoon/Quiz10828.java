package baekjoon;

import java.util.Scanner;

public class Quiz10828 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loopIndex = scanner.nextInt();
		String[] vpsBox = new String[loopIndex];
		for(int i=0; i<loopIndex;i++)
		{
			vpsBox[i] = scanner.next();
			int stacker = 0;
			boolean stackFlag = true;
			for(int j=0; j<vpsBox[i].length(); j++) {
				char currentVps = vpsBox[i].charAt(j);
				if(currentVps=='(') {
					stacker++;
				}else {
					stacker--;
					if(stacker<0) {
						stackFlag = false;
						break;
					}
				}
			}
			if(stacker==0&&stackFlag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}