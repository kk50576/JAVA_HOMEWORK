package tw.iii.org;

import java.util.Arrays;

public class java_poker {

	public static void main(String[] args) {
	
		System.out.println("*********�~�P**********");
		int[] poker=new int[52];
		for(int i=0;i<poker.length;i++){
			int rand;
			boolean isOK;
		do{
			rand=(int)(Math.random()*52);
			isOK=true;//�S������
			for(int k=0;k<i;k++){//���ˬd
				if(poker[k]==rand){
				isOK=false;
				break;
				}
			}
		}while(isOK==false);//�����ƴN�n�����ˬd
		poker[i]=rand;//�S�����ƪ��ܱN�H��¾��J�}�C��
			System.out.print(poker[i]+",");
		}
	//�o�P
		System.out.println();
		System.out.println("*********�o�P*********");
	int[][] player=new int[4][13];//�|�Ӫ��a�@�H13�i�P
	for(int i=0;i<poker.length;i++){
		player[i%4][i/4]=poker[i];//�N�Ƶo�����a
	}
	for(int[] a:player){
		for(int c: a){
		System.out.print(c+",");//�d�ݨC�ӤH����
		}System.out.println();
	}
	//�u�P
	System.out.println();
	System.out.println("********�u�P**********");
	String[] color={"�®�","�R��","���","����"};
	String[] value={" A"," 1"," 2"," 3"," 4"," 5"," 6"," 7"," 8"," 9","10"," J"," Q"," K"};
	for(int[] a:player){//1-52 player
		Arrays.sort(a);//�Ƨ�Arrays.sort
		for(int c:a){
			System.out.print(color[c%4]+value[c/4]+" ");//�������M�Ʀr
		}System.out.println();
	}
	}
}


