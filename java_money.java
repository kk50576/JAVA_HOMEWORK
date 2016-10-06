package tw.iii.org;

import javax.swing.JOptionPane;

public class java_money {

	private static int[] charAt;

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String strMoney = JOptionPane.showInputDialog("輸入金額");//接收一字串陣列
		int a=strMoney.length();//取得輸入金額長度
		int k;
		int[] arr=new int[a];//以陣列存放輸入金額
		for(int i=0;i<a;i++){//將一串文字轉為整數陣列
			String Money=strMoney.substring(i,i+1);//分割為字串
			arr[i]=Integer.parseInt(Money);//放入ARR當中
		}
		String[] chin={"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};
		String[] chin2={"","十","百","千","萬","十","百","千","億"};
			for(k=0;k<a;k++){			     
			    	 if(k==a-1 && arr[k]==0){//尾數是零
			    		 System.out.print("");	
			    		 break;
			     }
			    	 else if(k!=a-1&&arr[k]==0){//中間是零 結尾不是

//			    			 if(中間連續為零){  //以一個零代替
//			    		 }
			    		 System.out.print("零");
			    		 continue;
			    		 
			    	 }
				System.out.print(chin[(arr[k])]+ chin2[a-k-1]);	
			
		}
	
	}

	
}