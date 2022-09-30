package 배열응용;

import java.util.Random;
import java.util.Scanner;

public class 토익문제채점2 {

	public static void main(String[] args) {
		//1. 답안지 대답안 공간 만들어라
		int[] 답안지 = new int[990];
		int[] 대답안 = new int[990];
		
		//2. 랜덤하게 만들어주는 부품을 만들어라 
		Random r = new Random();
		
		//3. 990번 반복해서 답안지, 대답안에 숫자를 넣어라. 
		// 1~4까지 범위
		for (int i = 0; i < 대답안.length; i++) {
			답안지[i] = r.nextInt(4)+1; 
			대답안[i] = r.nextInt(4)+1; 
			
		}
		
		//4. 같은 인덱스끼리 990번 반복해서 비교 
		//비교하다가 숫자가 동일하면 점수를 1증가 
		int score =0;
		for (int i = 0; i < 대답안.length; i++) {
			if(답안지[i] == 대답안[i]) {
				score++;
			}	
		}
		
		//5. 내 점수 프린트
		System.out.println("번호: \t대답\t답안");
		System.out.println("------------------------");
		for (int i = 0; i < 대답안.length; i++) {
			System.out.println(i+1+":\t"+대답안[i]+"\t"+답안지[i]);
			
		}
		System.out.println("내 점수는 : "+score);
	}

}
