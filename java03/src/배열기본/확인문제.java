package 배열기본;

public class 확인문제 {

	public static void main(String[] args) {
		//1. int크기 5인 배열 생성 
		int[] ary = new int[5];
		System.out.println(ary);
		
		//2. 배열의 크기 
		System.out.println(ary.length);
		
		//3. 배열의 첫번째 위치에 100넣기 
		ary[0] = 100;
		
		//4. 배열의 마지막위치에 500 넣기  
		ary[ary.length-1] = 500;
		
		//5. 배열의 3번째 위치에 200 넣기
		ary[2] = 200;
		
		//6. 배열 전체 데이터를 프린트 
		for (int i : ary) {
			System.out.println(i);
		}
		
		//7. 배열 전체 데이터를 인덱스와 함께 프린트 
		for (int i = 0; i < ary.length; i++) {
			System.out.print((i+1)+"번째 값 : ");
			System.out.println(ary[i]);
			
		}
		
		
	}

}
