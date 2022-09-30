package 배열응용;

import java.util.Random;

public class 랜덤한값배열넣기 {

	public static void main(String[] args) {
		int[] ary = new int[6];
		
		Random r = new Random();
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = r.nextInt(44)+1;
		}
		for(int i=0; i<ary.length; i++) {
			System.out.print(ary[i]);
		}
	}

}
