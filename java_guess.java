package tw.iii.org;

import javax.swing.JOptionPane;

public class java_guess {

	public static void main(String[] args) {
		String answer = createAnswer();// �إߤ@���
		System.out.println(answer);
		// �ϥΪ̿�J�Ʀr
		for (int i = 0; i <= 10; i++) {
			String guess1 = JOptionPane.showInputDialog("�п�J�|�ӼƦr");
			if (guess1.equals(answer)) {// ����r���ĳ��equals
				JOptionPane.showMessageDialog(null, "����");
				break;
			} else {
				String result = checkAB(answer, guess1);// �I�scheckAB
				JOptionPane.showMessageDialog(null, guess1 + " : " + result);
			}
		}
	}

	// ��������
	public static String createAnswer() { // �H�����ͥ|���
		int[] guess = new int[4];
		int[] rand = new int[4];
		int i, j;
		boolean isOK;
		for (i = 0; i < guess.length; i++) {
			do {// ����
				isOK = true;
				guess[i] = (int) (Math.random() * 10);// �H�����ͭȵ�guess
				for (j = 0; j < i; j++) {// �ˬd�O�_����
					if (guess[i] == guess[j]) {
						isOK = false;// �A�ˬd�@��
						break;
					}
				}
			} while (isOK == false);
		}
		String aaa = "";// ���w�@�Ŧr��
		for (int v : guess) // �N�}�C���ରint
			aaa += Integer.toString(v);// �~���X�h�C�Ӧr��
		return aaa;
	}

	// �P�_�XA�XB
	public static String checkAB(String a, String g) {
		int A = 0, B = 0;
		// �Ʀr�P��m�PA++
		for (int i = 0; i < g.length(); i++) {
			char c = g.charAt(i);
			for (int j = 0; j < g.length(); j++) {
				if (c == a.charAt(j)) {
					if (i == j) {
						A++;
					}
					else
						B++;
				}
			}
		}

		// for(int i=0;i<g.length();i++){
		// if (a.charAt(i)==g.charAt(i)){
		// A++;
		// }
		//
		// else if(a.indexOf(g.charAt(i))>=0){
		// B++;
		// //�Ʀr�P��l���P
		// }

		return A + "A" + B + "B";
	}
}
