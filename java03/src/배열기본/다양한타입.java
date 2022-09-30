package 배열기본;

public class 다양한타입 {

	public static void main(String[] args) {
		String[] travel = {"부산","제주도", "서울", "속초", "강릉"};
		char[] color = {'r','g','b','y','p'};
		double[] height = {10.0, 20.1, 20.5, 40.4, 50.7};
		
		
		for (char c : color) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		for (String c : travel) {
			System.out.print(c+" ");
			
		}
		for (double c : height) {
			System.out.print(c+" ");
			
		}


	}

}
