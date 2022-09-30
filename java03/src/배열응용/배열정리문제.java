package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		//1. 정수 5개 크기의 배열을 만들어서 첫번째 값과 세번째 값을 더해서 프린트 
		
		Scanner sc = new Scanner(System.in);
		
		int[] ary = new int[5];
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print("숫자 입력 >>");
			ary[i] = sc.nextInt();
		}
		int add = ary[0] + ary[2];
		System.out.println(add);
		
		//2. 스트링 3개 크기의 배열을 만들어서 "자바보다는 스프링"로 출력 
		String[] ary2 = new String[3];
		for (int i=0; i<ary2.length; i++) {
			System.out.print("문자열 입력>> ");
			ary2[i] = sc.next();
		}
		System.out.println(ary2[0]+" 보다는 "+ary2[1]);
	}

}
