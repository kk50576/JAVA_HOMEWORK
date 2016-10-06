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
	private JButton lottery;// 一按鈕

	public guess02() {
		super("my window app");
		setLayout(new BorderLayout());// FLOWLAYOUT配置版面

		lottery = new JButton("Generate");

		JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel num = new JPanel(new GridLayout(3, 2));
		top.add(lottery);
		add(top, BorderLayout.NORTH);
		add(num, BorderLayout.CENTER);

		setSize(640, 480);// 設定大小
		setVisible(true);// 顯示看的到
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		lottery.addActionListener(this);
		// num.addActionListener(this);
	}

	public static void main(String[] args) {// 主程式
		new guess02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {//實作guess02
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
