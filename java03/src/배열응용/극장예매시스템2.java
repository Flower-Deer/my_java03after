package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(700, 800);

		f.getContentPane().setBackground(Color.green);
		//배치를 물흐르듯이 한쪽방향으로 붙여주는
		//부품을 사용하자.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
//		JButton b1 = new JButton("버튼1");
//		f.add(b1);
//		
//		JButton b2 = new JButton("버튼2");
//		f.add(b2);
		//예약된 상황을 저장해두기 위한 배열을 만들자.
		int[] seat = new int[500];
		//            {0,0,0,0,0,0,0,0,0,...}
		
		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i + "");
			f.add(b);
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//b를 클릭했을 때 처리내용을 여기에 넣으세요.
					String s = e.getActionCommand();//버튼위에 있는 글자를 가지고 온다.
					//"0", "1"
					JOptionPane.showMessageDialog(f, s +"번 예약됨.");
					//예약된 것을 버튼 색을 변경해서 표시를 해보자.!!
					b.setBackground(Color.red);
					//한번 예약하면 다시는 예약안되게 버튼을 변경해보자.!!
					b.setEnabled(false);
					//정수로 인덱스값을 변경해주어야 함.
					int index = Integer.parseInt(s); //0 <-- "0"
					//seat[0] = 1;
					seat[index] = 1; //예약된 상황을 저장
				}
			});
		}
		
		
		
		
		JButton pay = new JButton("결제하기");
		f.add(pay);
		
		pay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//배열에 있는거 전체중에서 1이 몇개인지 세서
				//13000원을 곱해주세요.
				int count = 0;
				for (int x : seat) {
					if(x == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, count * 13000 + "원");
				
			}
		});
		//위줄에 있는거 다보여주라!!
		f.setVisible(true);
	}

}