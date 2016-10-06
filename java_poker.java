package tw.iii.org;

import java.util.Arrays;

public class java_poker {

	public static void main(String[] args) {
	
		System.out.println("*********洗牌**********");
		int[] poker=new int[52];
		for(int i=0;i<poker.length;i++){
			int rand;
			boolean isOK;
		do{
			rand=(int)(Math.random()*52);
			isOK=true;//沒有重複
			for(int k=0;k<i;k++){//做檢查
				if(poker[k]==rand){
				isOK=false;
				break;
				}
			}
		}while(isOK==false);//有重複就要持續檢查
		poker[i]=rand;//沒有重複的話將隨機職放入陣列中
			System.out.print(poker[i]+",");
		}
	//發牌
		System.out.println();
		System.out.println("*********發牌*********");
	int[][] player=new int[4][13];//四個玩家一人13張牌
	for(int i=0;i<poker.length;i++){
		player[i%4][i/4]=poker[i];//將排發給玩家
	}
	for(int[] a:player){
		for(int c: a){
		System.out.print(c+",");//查看每個人的排
		}System.out.println();
	}
	//攤牌
	System.out.println();
	System.out.println("********攤牌**********");
	String[] color={"黑桃","愛心","方塊","梅花"};
	String[] value={" A"," 1"," 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9","10"," J"," Q"," K"};
	for(int[] a:player){//1-52 player
		Arrays.sort(a);//排序Arrays.sort
		for(int c:a){
			System.out.print(color[c%4]+value[c/4]+" ");//指派花色和數字
		}System.out.println();
	}
	}
}


