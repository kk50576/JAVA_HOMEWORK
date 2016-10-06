package tw.org.iii.chrisword;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumWindow extends JFrame {
	
	private JButton start;
	private JTextArea edit2;
	private JTextField tf;
	private StringBuffer sb;
	String text ,answer ,setText;
	int count;
	boolean isWIN;

	GuessNumWindow() {
		// 設定視窗標題
		super("I want to  play a Game");

		// 產生元件
		start = new JButton("開始猜");
		edit2 = new JTextArea();
		tf = new JTextField(30);
		sb = new StringBuffer();

		// 加入元件
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		top.add(tf);
		top.add(start);
		add(top, BorderLayout.NORTH);
		add(edit2, BorderLayout.CENTER);

		//顯示視窗,視窗大小,關閉視窗
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 產生謎底
		answer = createAnswer(3);
		System.out.println(answer);
		
		//Button 傾聽觸發
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(doGo())
					return;

				if (count > 2) {
					JOptionPane.showMessageDialog(null, "蝦~魯蛇\n答案是" + answer);

				}

			}

		});

	}
	
	//開始猜
	public boolean doGo() {
		count++;
		text = tf.getText().toString();

		isWIN = false;

		if (answer.equals(text)) {
			JOptionPane.showMessageDialog(null, "恭喜答對了", "我是視窗標題", JOptionPane.CLOSED_OPTION);
			return true;
		} else {
			//比對
			String result = createAB(answer, text);
			setText = (text + ":" + result + "\n");
			sb.append(setText);
			edit2.setText(sb.toString());
			return false;
		}
		
		

	}

	public static void main(String[] args) {

		new GuessNumWindow();
	}
	
	
	static String createAB(String a, String t) {
		int A = 0, B = 0;
		try {
			for (int i = 0; i < t.length(); i++) {
				if (a.charAt(i) == t.charAt(i)) {
					A++;
				} else if (a.indexOf(t.charAt(i)) != -1) {
					B++;
				}
			}
		} catch (StringIndexOutOfBoundsException se) {
			JOptionPane.showMessageDialog(null, "輸入字數有誤");

		}
		return A + "A" + B + "B";
	}
	
	static String createAnswer(int n) {
		int[] num = new int[n];
		boolean isOK;
		int rand;
		for (int i = 0; i < num.length; i++) {
			do {
				isOK = true;
				rand = (int) (Math.random() * 10);
				for (int j = 0; j < i; j++) {
					if (num[j] == rand) {
						isOK = false;
						break;
					}
				}
			} while (!isOK);

			num[i] = rand;
		}
		String ret = "";
		for (int v : num) {
			ret += v;
		}
		return ret;
	}

	

	}

}
