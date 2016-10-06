package tw.iii.org;

import javax.swing.JOptionPane;

public class java_calender {

	public static void main(String[] args) {

		
		// 開始猜
				boolean isWinner=false;
				for (int i = 0; i < 10; i++) {
					String guess = JOptionPane.showInputDialog("guess");
					if (guess.equals(answer)) {//"=="為何不可??
						isWinner=true;
						JOptionPane.showMessageDialog(null, "恭喜");
						break;
					}

					else {//顯示幾A幾B
						String result=checkAB(answer,guess);
						JOptionPane.showMessageDialog(null,guess+":"+result);
					}
				}
				if (!isWinner){//猜拾次仍猜錯
					JOptionPane.showMessageDialog(null, "答案是"+answer);
				}
			}
		//比對 幾A幾B
			static String checkAB(String a,String g){
				int A,B;A=B=0;
				for(int i=0;i<g.length();i++){
					if(g.charAt(i)==a.charAt(i)){
						A++;
					}
					else if(a.indexOf(g.charAt(i))>=0){
						B++;
						//數字同位子不同
					}
				}
				return A+"A"+B+"B";
			}
			
		//產生答案
			static String createAnswer() {
				return "734";
			
		}		
		    
			
		}//for回圈內

	

