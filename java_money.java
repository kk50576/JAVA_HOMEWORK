package tw.iii.org;

import javax.swing.JOptionPane;

public class java_money {

	private static int[] charAt;

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String strMoney = JOptionPane.showInputDialog("��J���B");//�����@�r��}�C
		int a=strMoney.length();//���o��J���B����
		int k;
		int[] arr=new int[a];//�H�}�C�s���J���B
		for(int i=0;i<a;i++){//�N�@���r�ର��ư}�C
			String Money=strMoney.substring(i,i+1);//���ά��r��
			arr[i]=Integer.parseInt(Money);//��JARR��
		}
		String[] chin={"�s","��","�L","��","�v","��","��","�m","��","�h"};
		String[] chin2={"","�Q","��","�d","�U","�Q","��","�d","��"};
			for(k=0;k<a;k++){			     
			    	 if(k==a-1 && arr[k]==0){//���ƬO�s
			    		 System.out.print("");	
			    		 break;
			     }
			    	 else if(k!=a-1&&arr[k]==0){//�����O�s �������O

//			    			 if(�����s�򬰹s){  //�H�@�ӹs�N��
//			    		 }
			    		 System.out.print("�s");
			    		 continue;
			    		 
			    	 }
				System.out.print(chin[(arr[k])]+ chin2[a-k-1]);	
			
		}
	
	}

	
}