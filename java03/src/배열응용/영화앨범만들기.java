package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {
	
	//전체영역에서 특정한 변수를 사용하려면 클래스아래에 변수 선언.
	static int start = 2; // = '전역변수'

	public static void main(String[] args) {
		// 영화 제목
		String[] title = {"삼진그룹영어토익반","담보","위플래시","미스터트롯","소리도없이"};
		// 포스터 파일이름
		String[] img = {"삼진그룹영어토익반.png","담보.png","위플래시.png","미스터트롯.png","소리도없이.png"};
		//평점
		double[] jumsu = {99.9, 88.9, 77.9, 66.9, 55.9};
		
		JFrame f =new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setBackground(new Color(255, 255, 0));
		f.setSize(369,405);
		
		JLabel top = new JLabel("위플래시");
		top.setBackground(new Color(255, 255, 0));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel under = new JLabel("77.9");
		under.setBackground(new Color(255, 255, 0));
		under.setFont(new Font("굴림", Font.BOLD, 40));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭 시 처리 = actionPerformed
				//제목이 표시된 라벨에 제목변변
				if (start > 0) {
					start--;
					top.setText(title[start]);
					under.setText(jumsu[start]+ "점");
					//*이미지 변경 *'부품새로'생성해야함
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
					start++;
					top.setText(title[start]);
					under.setText(jumsu[start]+ "점");
					//*이미지변경
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다.");
				}
			}
		});
		btnNewButton_1.setBackground(new Color(0, 255, 64));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
	}
}
