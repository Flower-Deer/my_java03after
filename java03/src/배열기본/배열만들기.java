package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		//배열을 생성할 때, 값을 이미 알고 있는 경우 
		int[] s = {1, 2, 3, 4, 5, 6, 7 };
		//변수의 개수 ==>
		//System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[5]);
		
		//배열을 생성할 때, 값을 아직 모르고 있는 경우
		int[] s2 = new int[5];
		//변수의 개수 ==>
		System.out.println(s2.length);
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		
		//마지막위치에 500을 대입
		s2[s2.length -1] = 500;
		System.out.println(s2[0]);
		System.out.println(s2[s2.length-1]);
	}

}
