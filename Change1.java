package tw.org.iii.chrisword;

import java.util.Scanner;

public class Change1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {

			int a = sc.nextInt();
			System.out.println(change(a));
		}
		sc.close();

	}

	private static String change(int a) {

		String s = "";

		int length = 1, b = a;
		while ((b /= 10) != 0) {
			length++;

		}

		String s1 = "", s2 = "";
		boolean t = false; // t => 確定是否需要補 "億"、"萬"
		for (int i = length - 1; i >= 0; i--) {
			s2 = change_1(a, i);
			if (s2 == "零") {
				if (t && (i & 3) == 0) {
					s += wei_2(i); // 補 "億"、"萬"
					s1 = "";
					t = false;
				} else {
					s1 = "零"; // 記錄 s2 之前是否有 "零" 出現
				}
			} else {
				s += s1 + s2;
				s1 = "";
				t = true; // 有 s2!="零" 要留意補 "億"、"萬"
			}
		}
		return s;
	}

	private static String change_1(int a, int j) {

		// j=index 右至左，index=0開始算
		for (int i = 0; i < j; i++) {
			a /= 10;
			
		}
		a %= 10;

		String c1 = wei_1(a);
		if (c1 == "零") {
			return "零";
		} else {
			return c1 + wei_2(j);
		}
	}

	private static String wei_1(int j) {

		switch (j) {
		case 0:
			return "零";
		case 1:
			return "壹";
		case 2:
			return "貳";
		case 3:
			return "參";
		case 4:
			return "肆";
		case 5:
			return "伍";
		case 6:
			return "陸";
		case 7:
			return "柒";
		case 8:
			return "捌";
		case 9:
			return "玖";
		default:
			return "";
		}
	}

	private static String wei_2(int a) {

		switch (a) {
		case 1:
		case 5:
		case 9:
			return "拾";
		case 2:
		case 6:
			return "佰";
		case 3:
		case 7:
			return "仟";
		case 4:
			return "萬";
		case 8:
			return "億";
		default:
			return "";
		}
	}

}
