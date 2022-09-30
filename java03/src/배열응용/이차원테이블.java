package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		String header[] = {"컴퓨터","영어","수학","체육"};
		String contents[][] = {
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"}
		};
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		
		//이중for문 ,중첩
		//contents.length : 1차월 배열의 갸수
		for (int i = 0; i < contents.length; i++) { //행
			for (int j = 0; j < contents[i].length; j++) { //열
				System.out.println(contents[i][j] + "");
			}
		}
	}
}
