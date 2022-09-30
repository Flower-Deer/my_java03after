package 배열응용;

import java.util.Scanner;

public class 입력받아배열넣기 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int[] num = new int[5];
	  
	  for (int i = 0; i < 5; i++) {
		  System.out.print("숫자입력 >> ");
		  num[i] = sc.nextInt(); 
	}
	  int sum=0;
	  for (int x : num) {
		  
		  sum+= x;
	  }
	  System.out.println(sum);
	  
	  
	  
	  
	  
	  

	}

}
