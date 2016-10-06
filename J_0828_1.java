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

	public J_0828_1(){//constructor���ϥΤ����O�L�ǰѼƪ�??
		super("my window app");//�u��b�Ĥ@�C
		open=new JButton("open");
		save=new JButton("save");
		exit=new JButton("exit");
		edit=new JTextArea();
		
		setLayout(new BorderLayout());//FLOWLAYOUT�t�m����
		JPanel top=new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);  top.add(save);  top.add(exit);
		add(top,BorderLayout.NORTH);
		add(edit,BorderLayout.CENTER);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		open.addActionListener(this);//�ۤv��// open
		save.addActionListener(this);
		open.addActionListener(new MyListener());//2 �g���������O
		open.addActionListener(new tw.iii.org.MyListener());//�~������CLASS 1//�V�᭱���V��Ĳ�o
		open.addActionListener(new ActionListener() {//�̱`�� �����b�o�ɰ�ACTION LISTENER���������
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();//�����s���~�����O���ݩʸ��k
			}
		});
	
	}
		private void doOpen(){
		System.out.println("INNERLISTENER");
	}
	
	public static void main(String[] args) {//�D�{��
		new J_0828_1();
	}

	class MyListener implements ActionListener{//�������O:�`��
		@Override
		public void actionPerformed(ActionEvent e){
			System.out.println("mylistener2: "+count++);
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent event) {//��@��������k�갵�X��
		if(event.getSource().equals(open)){
			System.out.println("open");
		}
		else if (save.equals(event.getSource())){
		System.out.println("save");
		}
	}
}


class MyListener implements ActionListener{//�~�����O
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("mylistener1:");
	}
}


