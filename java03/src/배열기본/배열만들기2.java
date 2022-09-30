package 배열기본;

public class 배열만들기2 {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		System.out.println("num의 주소 >> " +num);
		
		num[0] = 100;
		num[1] = 200;
		
		for (int x : num) { //for-each 반복문  하나씩 처음부터 뒤로가면서 꺼내오는 반복문 x는 int역할
			System.out.println(x);
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		

	}

}
