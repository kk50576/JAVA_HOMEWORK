package tw.iii.org;

import javax.swing.JOptionPane;

public class java_guess {

	public static void main(String[] args) {
		String answer = createAnswer();// 建立一函數
		System.out.println(answer);
		// 使用者輸入數字
		for (int i = 0; i <= 10; i++) {
			String guess1 = JOptionPane.showInputDialog("請輸入四個數字");
			if (guess1.equals(answer)) {// 比較字串建議用equals
				JOptionPane.showMessageDialog(null, "答對");
				break;
			} else {
				String result = checkAB(answer, guess1);// 呼叫checkAB
				JOptionPane.showMessageDialog(null, guess1 + " : " + result);
			}
		}
	}

	// 產生謎底
	public static String createAnswer() { // 隨機產生四位數
		int[] guess = new int[4];
		int[] rand = new int[4];
		int i, j;
		boolean isOK;
		for (i = 0; i < guess.length; i++) {
			do {// 給值
				isOK = true;
				guess[i] = (int) (Math.random() * 10);// 隨機產生值給guess
				for (j = 0; j < i; j++) {// 檢查是否重複
					if (guess[i] == guess[j]) {
						isOK = false;// 再檢查一次
						break;
					}
				}
			} while (isOK == false);
		}
		String aaa = "";// 給定一空字串
		for (int v : guess) // 將陣列直轉為int
			aaa += Integer.toString(v);// 才能輸出去每個字串
		return aaa;
	}

	// 判斷幾A幾B
	public static String checkAB(String a, String g) {
		int A = 0, B = 0;
		// 數字同位置同A++
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
		// //數字同位子不同
		// }

		return A + "A" + B + "B";
	}
}
