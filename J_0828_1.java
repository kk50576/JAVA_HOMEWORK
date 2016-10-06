package tw.iii.org;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class J_0828_1 extends JFrame implements ActionListener{ //J_0828_1 is a JFrame
	private JButton open,save,exit;
	private JTextArea edit;
	private int count;

	public J_0828_1(){//constructor不使用父類別無傳參數的??
		super("my window app");//只能在第一列
		open=new JButton("open");
		save=new JButton("save");
		exit=new JButton("exit");
		edit=new JTextArea();
		
		setLayout(new BorderLayout());//FLOWLAYOUT配置版面
		JPanel top=new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);  top.add(save);  top.add(exit);
		add(top,BorderLayout.NORTH);
		add(edit,BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		open.addActionListener(this);//自己做// open
		save.addActionListener(this);
		open.addActionListener(new MyListener());//2 寫成內部類別
		open.addActionListener(new tw.iii.org.MyListener());//外面那個CLASS 1//越後面的越先觸發
		open.addActionListener(new ActionListener() {//最常用 直接在這時做ACTION LISTENER的物件實體
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();//直接存取外部類別的屬性跟方法
			}
		});
	
	}
		private void doOpen(){
		System.out.println("INNERLISTENER");
	}
	
	public static void main(String[] args) {//主程式
		new J_0828_1();
	}

	class MyListener implements ActionListener{//內部類別:常見
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("mylistener2: "+count++);
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent event) {//實作介面的方法實做出來
		if(event.getSource().equals(open)){
			System.out.println("open");
		}
		else if (save.equals(event.getSource())){
		System.out.println("save");
		}
	}
}


class MyListener implements ActionListener{//外部類別
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("mylistener1:");
	}
}


