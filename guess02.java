package tw.iii.org;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class guess02 extends JFrame implements ActionListener {
	private JButton lottery;// �@���s

	public guess02() {
		super("my window app");
		setLayout(new BorderLayout());// FLOWLAYOUT�t�m����

		lottery = new JButton("Generate");

		JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel num = new JPanel(new GridLayout(3, 2));
		top.add(lottery);
		add(top, BorderLayout.NORTH);
		add(num, BorderLayout.CENTER);

		setSize(640, 480);// �]�w�j�p
		setVisible(true);// ��ܬݪ���
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		lottery.addActionListener(this);
		// num.addActionListener(this);
	}

	public static void main(String[] args) {// �D�{��
		new guess02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {//��@guess02
		int[] a=new int[6];
		int ran;
		boolean isOK;
		for(int i=0;i<6;i++){
			do{
				isOK=true;
				a[i]=(int)(Math.random()*42);
				for(int j=0;j<i;j++){
					if(a[i]==a[j]){
						isOK=false;
						break;
					}
				}	
		}while(isOK==false);
			System.out.print(a[i]+"  ");
	}System.out.println("");
	}

}
