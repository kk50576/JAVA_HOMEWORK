package tw.iii.org;

import javax.swing.JOptionPane;

public class java_calender {

	public static void main(String[] args) {

		
		// �}�l�q
				boolean isWinner=false;
				for (int i = 0; i < 10; i++) {
					String guess = JOptionPane.showInputDialog("guess");
					if (guess.equals(answer)) {//"=="���󤣥i??
						isWinner=true;
						JOptionPane.showMessageDialog(null, "����");
						break;
					}

					else {//��ܴXA�XB
						String result=checkAB(answer,guess);
						JOptionPane.showMessageDialog(null,guess+":"+result);
					}
				}
				if (!isWinner){//�q�B�����q��
					JOptionPane.showMessageDialog(null, "���׬O"+answer);
				}
			}
		//��� �XA�XB
			static String checkAB(String a,String g){
				int A,B;A=B=0;
				for(int i=0;i<g.length();i++){
					if(g.charAt(i)==a.charAt(i)){
						A++;
					}
					else if(a.indexOf(g.charAt(i))>=0){
						B++;
						//�Ʀr�P��l���P
					}
				}
				return A+"A"+B+"B";
			}
			
		//���͵���
			static String createAnswer() {
				return "734";
			
		}		
		    
			
		}//for�^�餺

	

