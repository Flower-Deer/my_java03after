package 배열응용;

import java.util.Scanner;

public class 여행배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] last = new String[3];
		String[] year = new String[3];
		
		System.out.println("작년 가고싶었던 세 곳 ");
		for (int i=0; i<last.length; i++) {
			last[i] = sc.next();
		}
		System.out.println("올해 가고싶었던 세 곳 ");
		for (int i=0; i<3; i++) {
			year[i] = sc.next();
		}
		
		int count = 0;
		for (int i=0; i<last.length; i++) {
			if (last[i].equals(year[i])) {
				count++;
			}
		}
		System.out.println("전체 동일한 여행지수 : " + count);
	}

}